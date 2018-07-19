package com.zhangbaiquan.pro.util;

import java.util.Scanner;

public class ValidIdCard {
	
	public static void validIdCard(String cardNum) {
		
		String idCard = cardNum;
		
		Integer a = 0;
		a += (idCard.charAt(0)-'0')*7;
		a += (idCard.charAt(1)-'0')*9;
		a += (idCard.charAt(2)-'0')*10;
		a += (idCard.charAt(3)-'0')*5;
		a += (idCard.charAt(4)-'0')*8;
		a += (idCard.charAt(5)-'0')*4;
		a += (idCard.charAt(6)-'0')*2;
		a += (idCard.charAt(7)-'0')*1;
		a += (idCard.charAt(8)-'0')*6;
		a += (idCard.charAt(9)-'0')*3;
		a += (idCard.charAt(10)-'0')*7;
		a += (idCard.charAt(11)-'0')*9;
		a += (idCard.charAt(12)-'0')*10;
		a += (idCard.charAt(13)-'0')*5;
		a += (idCard.charAt(14)-'0')*8;
		a += (idCard.charAt(15)-'0')*4;
		a += (idCard.charAt(16)-'0')*2;
		int b = a % 11;

//		校验位为:"10X98765432"
		String checkDigit = "10X98765432";
		String result =	checkDigit.charAt(b)-'0' == idCard.charAt(17)-'0' ? "合法" : "不合法";
		System.out.println("身份证号码" + ":" + idCard + result);
	
	}
}
