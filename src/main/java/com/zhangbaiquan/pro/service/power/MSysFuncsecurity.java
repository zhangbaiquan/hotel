package com.zhangbaiquan.pro.service.power;

public class MSysFuncsecurity {
    private Integer fid;

    private String misUserid;

    private String functionId;

    private Integer lock;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getMisUserid() {
        return misUserid;
    }

    public void setMisUserid(String misUserid) {
        this.misUserid = misUserid == null ? null : misUserid.trim();
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    public Integer getLock() {
        return lock;
    }

    public void setLock(Integer lock) {
        this.lock = lock;
    }
}