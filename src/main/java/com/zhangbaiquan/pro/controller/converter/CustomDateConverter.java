package com.zhangbaiquan.pro.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


public class CustomDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String source) {
		if (source!="") {
			
		
		SimpleDateFormat simpleDateFormat;
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		if(source.length()==10)
		{
			 simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		}
		else  simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		try {
			//转成直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		//如果参数绑定失败返回null
		return null;
	}

}
