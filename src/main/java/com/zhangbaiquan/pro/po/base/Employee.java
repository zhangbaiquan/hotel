package com.zhangbaiquan.pro.po.base;

public class Employee {
    private String emplyeeid;

    private String usename;

    private String realname;

    private String phone;

    private String titleid;

    private String deptid;

    private String deptname;

    private String groupid;

    private Integer isdelete;

    private String ex1;

    private String ex2;

    private String ex3;

    public String getEmplyeeid() {
        return emplyeeid;
    }

    public void setEmplyeeid(String emplyeeid) {
        this.emplyeeid = emplyeeid == null ? null : emplyeeid.trim();
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTitleid() {
        return titleid;
    }

    public void setTitleid(String titleid) {
        this.titleid = titleid == null ? null : titleid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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

	@Override
	public String toString() {
		return "Employee [emplyeeid=" + emplyeeid + ", usename=" + usename + ", realname=" + realname + ", phone="
				+ phone + ", titleid=" + titleid + ", deptid=" + deptid + ", deptname=" + deptname + ", groupid="
				+ groupid + ", isdelete=" + isdelete + ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3=" + ex3 + "]";
	}
}