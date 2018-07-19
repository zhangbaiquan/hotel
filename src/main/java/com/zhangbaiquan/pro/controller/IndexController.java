package com.zhangbaiquan.pro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.power.MFunctioncontrol;
import com.zhangbaiquan.pro.po.power.MFunctioncontrolExample;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurity;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample.Criteria;
import com.zhangbaiquan.pro.service.power.FunctionControlService;
import com.zhangbaiquan.pro.service.power.SysFunctionService;
import com.zhangbaiquan.pro.util.ValidateImage;

@Controller
public class IndexController {
	@Autowired
	private SysFunctionService sysFunctionService;
	@Autowired
	private FunctionControlService functionControlService;
	@RequestMapping(value="index")
	public ModelAndView showIndex(ModelAndView mv,HttpSession session){
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
		}
//		if (!user.getEx1().equals(pwd) { // 密码错误
//			result.put("result", -2);
//			writeJSON(response, result);
//			return;
//		}
		
		List<String> fidlist=new ArrayList<String>();
		if(user!=null&&user.getGroupid()!=null) {
			MSysFuncsecurityExample funcrexample=new MSysFuncsecurityExample();
			Criteria funcCriteria=funcrexample.createCriteria();
			funcCriteria.andMisUseridEqualTo(new Integer(user.getGroupid()));
			funcCriteria.andLockEqualTo(0);
			List<MSysFuncsecurity> sflist= sysFunctionService.selectByExample(funcrexample);
			if(sflist!=null) {
				for (MSysFuncsecurity mSysFuncsecurity : sflist) {
					fidlist.add(mSysFuncsecurity.getFunctionId());
				}
			}
		}else {
			mv.setViewName("login");
			return mv;
		}
		MFunctioncontrolExample example1 =new  MFunctioncontrolExample();
		com.zhangbaiquan.pro.po.power.MFunctioncontrolExample.Criteria criteria1=example1.createCriteria();
		if(fidlist==null||fidlist.isEmpty()) {
			mv.addObject("message", "您没有权限访问此系统，请联系管理员");
			mv.setViewName("login");
			return mv;
		}
		
		criteria1.andIdIn(fidlist);
		criteria1.andActivateEqualTo(1);
		criteria1.andPidEqualTo("0");
		example1.setOrderByClause("pxid");
		List<MFunctioncontrol> parentlist=functionControlService.selectByExample(example1);
		MFunctioncontrolExample example =new  MFunctioncontrolExample();
		com.zhangbaiquan.pro.po.power.MFunctioncontrolExample.Criteria criteria=example.createCriteria();
		criteria.andIdIn(fidlist);
		criteria.andActivateEqualTo(1);
		example.setOrderByClause("pxid");
		List<MFunctioncontrol> funclist=functionControlService.selectByExample(example);
		mv.addObject("parentlist", parentlist);
		mv.addObject("funclist", funclist);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="loginPage")
	public ModelAndView loginPage(ModelAndView mv){
		mv.setViewName("login");		
		return mv;
	}
	/**
	 * 生成验证码
	 * code.do
	 * @return
	 */
	@RequestMapping(path="code")
	public void code(HttpServletRequest req,HttpServletResponse resp){
		try {
			//实例化
			ValidateImage img = new ValidateImage(150, 40, 4, 30);
			
			//获取session
			HttpSession session = req.getSession();
			
			//保存验证码到session中
			session.setAttribute("code", img.getRandomCode().toString());
			
			//禁止图像缓存
			resp.setHeader("Pragma", "no-cache");
			resp.setHeader("Cache-Control", "no-cache");
			resp.setDateHeader("Expires", 0);
			resp.setContentType("image/jpeg");
			
			ServletOutputStream sos = resp.getOutputStream();
			ImageIO.write(img.getImage(), "jpeg", sos);
			sos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="mainPage")
	public ModelAndView mainPage(ModelAndView mv){
//		mv.setViewName("main");	
//		mv.setViewName("roommanagement/realtime_room");
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	@RequestMapping(value="defaultPage")
	public ModelAndView defaultPage(ModelAndView mv){
		mv.addObject("message", "此功能暂未实现，请先使用其他功能");
		mv.setViewName("default");		
		return mv;
	}
}