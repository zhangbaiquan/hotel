package com.zhangbaiquan.pro.po.msgboard;

import java.util.Date;

public class Msgboard {
    private Integer msgboardid;

    private String msgboardname;

    private Date msgboardtime;

    private String msgboardphone;

    private String ex1;

    private String ex2;

    private String ex3;

    public Integer getMsgboardid() {
        return msgboardid;
    }

    public void setMsgboardid(Integer msgboardid) {
        this.msgboardid = msgboardid;
    }

    public String getMsgboardname() {
        return msgboardname;
    }

    public void setMsgboardname(String msgboardname) {
        this.msgboardname = msgboardname == null ? null : msgboardname.trim();
    }

    public Date getMsgboardtime() {
        return msgboardtime;
    }

    public void setMsgboardtime(Date msgboardtime) {
        this.msgboardtime = msgboardtime;
    }

    public String getMsgboardphone() {
        return msgboardphone;
    }

    public void setMsgboardphone(String msgboardphone) {
        this.msgboardphone = msgboardphone == null ? null : msgboardphone.trim();
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
}