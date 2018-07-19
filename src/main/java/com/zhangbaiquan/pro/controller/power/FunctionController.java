package com.zhangbaiquan.pro.controller.power;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.UserclassinfoExample;
import com.zhangbaiquan.pro.po.power.MFunctioncontrol;
import com.zhangbaiquan.pro.po.power.MFunctioncontrolExample;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurity;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample.Criteria;
import com.zhangbaiquan.pro.service.base.UserClassService;
import com.zhangbaiquan.pro.service.power.FunctionControlService;
import com.zhangbaiquan.pro.service.power.SysFunctionService;
import com.zhangbaiquan.pro.vo.FunctionVo;

@Controller
@RequestMapping("func")
public class FunctionController {
	@Autowired
	private FunctionControlService functionControlService;
	@Autowired
	private UserClassService userClassService;
	@Autowired
	private SysFunctionService sysFunctionService;

	@RequestMapping(value="showList")
	public ModelAndView showList(ModelAndView mv,Integer groupid) {
		List<MFunctioncontrol> parentlist=functionControlService.selectParent();
		List<MFunctioncontrol> childlist=functionControlService.selectChild();
		MSysFuncsecurityExample example=new MSysFuncsecurityExample();
		Criteria criteria =example.createCriteria();
		criteria.andMisUseridEqualTo(groupid);
		List<MSysFuncsecurity> sflist=sysFunctionService.selectByExample(example);
		List<FunctionVo> parentfv=functionUtil(parentlist,sflist);
		List<FunctionVo> childfv=functionUtil(childlist,sflist);
		mv.addObject("parentfv", parentfv);
		mv.addObject("childfv", childfv);
		mv.addObject("groupid", groupid);
		mv.setViewName("group/functionlist");
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
				row +=sysFunctionService.insert(sf);
			}
		}
		if(row>0) {
			return "success";
		}else {
			return "error";
		}
				
	}
	@RequestMapping(value="showIndex")
	public ModelAndView showIndex(ModelAndView mv) {
		List<MFunctioncontrol> parentlist=functionControlService.selectParent();
		List<MFunctioncontrol> childlist=functionControlService.selectChild();
		mv.addObject("parentlist", parentlist);
		
		mv.addObject("childlist", childlist);
		mv.setViewName("power/function/index");
		return mv;		
	}
	@RequestMapping(value="showInfo")
	public ModelAndView showIndex(ModelAndView mv,String id) {
		MFunctioncontrol func=functionControlService.selectByPrimaryKey(id);
		mv.addObject("func",func);
		mv.setViewName("power/function/info");
		return mv;		
	}
	@RequestMapping(value="sendUpdate")
	public ModelAndView sendUpdate(ModelAndView mv,String id) {
		MFunctioncontrol func=functionControlService.selectByPrimaryKey(id);
		List<MFunctioncontrol> parentlist=functionControlService.selectParent();
		List<MFunctioncontrol> childlist=functionControlService.selectChild();
		mv.addObject("parentlist", parentlist);
		mv.addObject("childlist", childlist);
		mv.addObject("func", func);
		mv.setViewName("power/function/update");
		return mv;
		
	}
	@RequestMapping(value="update")
	public ModelAndView update(ModelAndView mv,MFunctioncontrol func) {
		int row=functionControlService.updateByPrimaryKey(func);
		if(row>0) {
			mv.setViewName("redirect:/func/showInfo.action?id="+func.getId());
		}else {
			mv.setViewName("redirect:/func/sendUpdate.action?id="+func.getId());
		}
		return mv;		
	}
	@RequestMapping(value="sendAdd")
	public ModelAndView sendAdd(ModelAndView mv) {
		List<MFunctioncontrol> parentlist=functionControlService.selectParent();
		List<MFunctioncontrol> childlist=functionControlService.selectChild();
		mv.addObject("parentlist", parentlist);
		mv.addObject("childlist", childlist);
		mv.setViewName("power/function/add");
		return mv;
		
	}
	@RequestMapping(value="add")
	public ModelAndView add(ModelAndView mv,MFunctioncontrol func) {
		func.setId(StringUtil(12));
		int row=functionControlService.insert(func);
		if(row>0) {
			mv.setViewName("redirect:/func/showInfo.action?id="+func.getId());
		}else {
			mv.setViewName("power/function/add");
		}
		return mv;
		
	}
	@RequestMapping(value="delete")
	@ResponseBody
	public String delete(String id) {
		int row=functionControlService.deleteByPrimaryKey(id);
		if(row>0) {
			return "success";
		}else {
			return "error";
		}
	}
	public String StringUtil(int length) {
		String base="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random random=new Random();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<length;i++) {
			int  num=random.nextInt(base.length());
			sb.append(base.charAt(num));			
		}
		if(functionControlService.selectByPrimaryKey(sb.toString())==null) {
			return sb.toString();
		}else {
			return StringUtil(length);
		}
	}

}
