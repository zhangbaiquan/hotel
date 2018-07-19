package com.zhangbaiquan.pro.vo;

import java.util.Date;

public class ChangeRoomVo {
	
	private Integer customerid;
	private String originalroom;
	private String changeroom;
	private Date changetime;
	private String note;
	private String reason;
	private String name;
	private String roomnum;
	private String gender;
	private String certificatenum;
	private String realname;
	private String ex1;
	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getOriginalroom() {
		return originalroom;
	}
	public void setOriginalroom(String originalroom) {
		this.originalroom = originalroom;
	}
	public String getChangeroom() {
		return changeroom;
	}
	public void setChangeroom(String changeroom) {
		this.changeroom = changeroom;
	}
	public Date getChangetime() {
		return changetime;
	}
	public void setChangetime(Date changetime) {
		this.changetime = changetime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCertificatenum() {
		return certificatenum;
	}
	public void setCertificatenum(String certificatenum) {
		this.certificatenum = certificatenum;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "ChangeRoomVo [customerid=" + customerid + ", originalroom=" + originalroom + ", changeroom="
				+ changeroom + ", changetime=" + changetime + ", note=" + note + ", reason=" + reason + ", name=" + name
				+ ", roomnum=" + roomnum + ", gender=" + gender + ", certificatenum=" + certificatenum + ", realname="
				+ realname + "]";
	}
	public String getEx1() {
		return ex1;
	}
	public void setEx1(String ex1) {
		this.ex1 = ex1;
	}
	
	
}
