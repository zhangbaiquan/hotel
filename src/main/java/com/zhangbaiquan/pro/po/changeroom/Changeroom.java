package com.zhangbaiquan.pro.po.changeroom;

import java.io.Serializable;
import java.util.Date;

import com.zhangbaiquan.pro.vo.BaseVO;

public class Changeroom extends BaseVO implements Serializable{
	
	private static final long serialVersionUID = -955427925160951645L;

	private Integer id;

    private Integer customerid;

    private String originalroom;

    private String changeroom;

    private Date changetime;

    private String reason;

    private String note;

    private String emplyeeid;

    private String ex1;

    private String ex2;

    private String ex3;

    private String ex4;

    private String ex5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.originalroom = originalroom == null ? null : originalroom.trim();
    }

    public String getChangeroom() {
        return changeroom;
    }

    public void setChangeroom(String changeroom) {
        this.changeroom = changeroom == null ? null : changeroom.trim();
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getEmplyeeid() {
        return emplyeeid;
    }

    public void setEmplyeeid(String emplyeeid) {
        this.emplyeeid = emplyeeid == null ? null : emplyeeid.trim();
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
		return "Changeroom [id=" + id + ", customerid=" + customerid + ", originalroom=" + originalroom
				+ ", changeroom=" + changeroom + ", changetime=" + changetime + ", reason=" + reason + ", note=" + note
				+ ", emplyeeid=" + emplyeeid + ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3=" + ex3 + ", ex4=" + ex4
				+ ", ex5=" + ex5 + "]";
	}
}