package com.zhangbaiquan.pro.controller.power;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.Userclassinfo;
import com.zhangbaiquan.pro.po.power.MFunctioncontrol;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurity;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample.Criteria;
import com.zhangbaiquan.pro.service.base.UserClassService;
import com.zhangbaiquan.pro.service.power.FunctionControlService;
import com.zhangbaiquan.pro.service.power.SysFunctionService;
import com.zhangbaiquan.pro.util.PageBean;
import com.zhangbaiquan.pro.vo.FunctionVo;

@Controller
@RequestMapping("/group")
public class GroupController {
	@Autowired
	private UserClassService userClassService;
	@Autowired
	private FunctionControlService functionControlService;
	@Autowired
	private SysFunctionService sysFunctionService;
	@RequestMapping(value="list")
	public ModelAndView showList(ModelAndView mv,Integer page) {
		PageBean paging=new PageBean();
		if(page!=null&&page>0) {
			paging.setCurrentPage(page);
		}
		paging.setPageSize(8);
		userClassService.selectByPage(paging);
		mv.addObject("paging", paging);
		mv.setViewName("power/group/list");
		return mv;		
	}
	@RequestMapping(value="sendAdd")
	public ModelAndView add(ModelAndView mv){
		mv.setViewName("power/group/add");
		return mv;
	}
	@RequestMapping(value="add")
	public ModelAndView add(ModelAndView mv,Userclassinfo userclassinfo) {
		int row=userClassService.insertSelective(userclassinfo);
		if(row>0) {
			mv.setViewName("redirect:/group/list.action");
		}else {
			mv.addObject("message", "添加失败");
			mv.setViewName("power/group/add");
		}
		return mv;
		
	}
	@RequestMapping(value="sendUpdate")
	public ModelAndView sendUpdate(ModelAndView mv,Integer id) {
		mv.addObject("info", userClassService.selectByPrimaryKey(id));
		mv.setViewName("power/group/update");		
		return mv;		
	}
	@RequestMapping(value="update")
	public ModelAndView update(ModelAndView mv,Userclassinfo userclassinfo) {
		int row=userClassService.updateByPrimaryKeySelective(userclassinfo);
		userclassinfo.getClassnotes();
		if(row>0) {
			mv.setViewName("redirect:/group/list.action");
		}else {
			mv.addObject("message", "修改失败");
			mv.setViewName("power/group/update");
		}
		return mv;
		
	}

	@ResponseBody
	@RequestMapping(value="delete")
	public String delete(Integer id) {
		int row=userClassService.deleteByPrimaryKey(id);
		if(row>0) {
			return "success";	
		}else {
			return "error";
		}
				
	}
	
	@RequestMapping(value="sendManage")
	public ModelAndView sendFunctionList(ModelAndView mv,Integer id) {		
		Userclassinfo group=userClassService.selectByPrimaryKey(id);
		mv.addObject("group", group);
		List<MFunctioncontrol> parentlist=functionControlService.selectParent();
		List<MFunctioncontrol> childlist=functionControlService.selectChild();
		MSysFuncsecurityExample example=new MSysFuncsecurityExample();
		Criteria criteria =example.createCriteria();
		criteria.andMisUseridEqualTo(group.getUserclassid());
		List<MSysFuncsecurity> sflist=sysFunctionService.selectByExample(example);
		List<FunctionVo> parentfv=functionUtil(parentlist,sflist);
		List<FunctionVo> childfv=functionUtil(childlist,sflist);
		mv.addObject("parentfv", parentfv);
		mv.addObject("childfv", childfv);
		mv.setViewName("power/group/functionlist");
		return mv;
		
	}
	public List<FunctionVo> functionUtil(List<MFunctioncontrol> fclist,List<MSysFuncsecurity> sflist) {
		List<FunctionVo> fvlist=new ArrayList<FunctionVo>();
		for(MFunctioncontrol fc:fclist) {
			FunctionVo fv=new FunctionVo();
			fv.setFid(fc.getId());
			fv.setFname(fc.getName());
			fv.setPid(fc.getPid());
			fv.setChecked(0);
			for(MSysFuncsecurity sf:sflist) {
				if(fc.getId().equals(sf.getFunctionId())) {
					fv.setChecked(1);
					break;
				}
			}
			fvlist.add(fv);
		}
		return fvlist;
		
	}
	@ResponseBody
	@RequestMapping(value="setFunction")
	public String setFunction(Integer groupid,String ids) {
		int row=0;
		if(groupid!=null) {
			MSysFuncsecurityExample example =new MSysFuncsecurityExample();
			Criteria criteria=example.createCriteria();
			criteria.andMisUseridEqualTo(groupid);
			sysFunctionService.deleteByExample(example);
			String[] fids=ids.split(",");
			for(String fid:fids) {
				MSysFuncsecurity sf=new MSysFuncsecurity();
				sf.setMisUserid(groupid);
				sf.setFunctionId(fid);
				sf.setLock(0);
				row +=sysFunctionService.insertSelective(sf);
			}
		}
		if(row>0) {
			return "success";
		}else {
			return "error";
		}
				
	}
}
