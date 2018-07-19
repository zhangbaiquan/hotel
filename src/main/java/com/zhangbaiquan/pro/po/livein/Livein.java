package com.zhangbaiquan.pro.po.livein;

import java.io.Serializable;
import java.util.Date;

import com.zhangbaiquan.pro.vo.BaseVO;

public class Livein extends BaseVO implements Serializable{
    private Integer customerid;

    private String customernum;

    private String name;

    private String gender;

    private String certificatetype;

    private String roomnum;

    private Date checkintime;

    private Date leavetime;

    private String days;

    private String deposit;

    private String certificatenum;

    private String membertype;

    private String note;

    private String ex1;

    private String ex2;

    private String ex3;

    private String ex4;

    private String ex5;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomernum() {
        return customernum;
    }

    public void setCustomernum(String customernum) {
        this.customernum = customernum == null ? null : customernum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype == null ? null : certificatetype.trim();
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public String getCertificatenum() {
        return certificatenum;
    }

    public void setCertificatenum(String certificatenum) {
        this.certificatenum = certificatenum == null ? null : certificatenum.trim();
    }

    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype == null ? null : membertype.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3 == null ? null : ex3.trim();
    }

    public String getEx4() {
        return ex4;
    }

    public void setEx4(String ex4) {
        this.ex4 = ex4 == null ? null : ex4.trim();
    }

    public String getEx5() {
        return ex5;
    }

    public void setEx5(String ex5) {
        this.ex5 = ex5 == null ? null : ex5.trim();
    }

	@Override
	public String toString() {
		return "Livein [customerid=" + customerid + ", customernum=" + customernum + ", name=" + name + ", gender="
				+ gender + ", certificatetype=" + certificatetype + ", roomnum=" + roomnum + ", checkintime="
				+ checkintime + ", leavetime=" + leavetime + ", days=" + days + ", deposit=" + deposit
				+ ", certificatenum=" + certificatenum + ", membertype=" + membertype + ", note=" + note + ", ex1="
				+ ex1 + ", ex2=" + ex2 + ", ex3=" + ex3 + ", ex4=" + ex4 + ", ex5=" + ex5 + "]";
	}
}