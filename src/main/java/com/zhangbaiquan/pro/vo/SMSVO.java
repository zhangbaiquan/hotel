package com.zhangbaiquan.pro.vo;

import java.io.Serializable;

public class SMSVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8529292997261482450L;
	//短信接口模板 模版CODE
	public final static String LIVEINSUCCESS = "SMS_133965799";   //入住成功
	public final static String RESERVATIONSUCCESS = "SMS_133970772";       //预定成功
	public static String getLiveinsuccess() {
		return LIVEINSUCCESS;
	}
	public static String getReservationsuccess() {
		return RESERVATIONSUCCESS;
	}
}
