package com.zhangbaiquan.pro.vo;

import java.io.Serializable;

public class BaseVO implements Serializable{

	
	private static final long serialVersionUID = 5137767918909058977L;
	// 房间类型
	public final static String HASBEENIN = "已入住";
	public final static String EMPTYNETROOM = "空净房";	
	public final static String DIRTYROOM = "脏房";
	public final static String RESERVATION = "已预定";
	public final static String MAINTENANCE = "维修中";
	
	public final static String CHANGEROOM = "换房";
	
	public static String getHasbeenin() {
		return HASBEENIN;
	}
	public static String getEmptynetroom() {
		return EMPTYNETROOM;
	}
	public static String getDirtyroom() {
		return DIRTYROOM;
	}
	public static String getReservation() {
		return RESERVATION;
	}
	public static String getMaintenance() {
		return MAINTENANCE;
	}	
	
}