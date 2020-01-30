package com.zhangbaiquan.pro.util;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class TestUtil {
	
	public static void main(String[] args) throws Exception {
//		身份证号验证
//		IdCard();
		
//		ValidateImage();
		
//		MsgContent("卫星","B203");
		
		AliyunSMSUtil.MessagesSendDetails("18883365888", "张三","B201","SMS_133965799");
		
	}
	
	public static void IdCard() throws ParseException {
		// TODO Auto-generated method stub
		String IdCard = "412829199404205631";
		IdCard = IdCard.toUpperCase();
		
		Boolean results = false;
		if ("true" != ValidIdCardUtil.IDCardValidate(IdCard)) {
			results = false;
		} else {
			results = true;
		}
		
		System.out.println(results);

	}
	
	public static void ValidateImage() throws Exception {
		
		ValidateImage validateImage = new ValidateImage(100, 60, 100, 16);

	}
	
	public static void MapTOJSON() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "卫星");
		map.put("\"roomnum\"", "B302");
		String json = new Gson().toJson(map);
	}
	
	public static void MsgContent(String name,String roomnum) {
		// TODO Auto-generated method stub
		StringBuffer content = new StringBuffer();
		content.append("{\\\"name\\\":\\\"");
//		String name = "卫星";
		content.append(name);
		content.append("\\\", \\\"roomnum\\\":\\\"");
//		 roomnum = "B203";
		content.append(roomnum);
		content.append("\\\"}");
		System.out.println("content = "+content);
	}
}
