package com.zhangbaiquan.pro.po.base;

public class Userclassinfo {
    private Integer userclassid;

    private String userclassname;

    private String classnotes;

    public Integer getUserclassid() {
        return userclassid;
    }

    public void setUserclassid(Integer userclassid) {
        this.userclassid = userclassid;
    }

    public String getUserclassname() {
        return userclassname;
    }

    public void setUserclassname(String userclassname) {
        this.userclassname = userclassname == null ? null : userclassname.trim();
    }

    public String getClassnotes() {
        return classnotes;
    }

    public void setClassnotes(String classnotes) {
        this.classnotes = classnotes == null ? null : classnotes.trim();
    }
}