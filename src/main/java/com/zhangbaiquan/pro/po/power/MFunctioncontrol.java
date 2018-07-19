package com.zhangbaiquan.pro.po.power;

public class MFunctioncontrol {
    private String id;

    private Integer pxid;

    private String name;

    private String url;

    private String pid;

    private String image;

    private Integer pri;

    private Integer isleaf;

    private String para;

    private Integer activate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPxid() {
        return pxid;
    }

    public void setPxid(Integer pxid) {
        this.pxid = pxid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getPri() {
        return pri;
    }

    public void setPri(Integer pri) {
        this.pri = pri;
    }

    public Integer getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Integer isleaf) {
        this.isleaf = isleaf;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para == null ? null : para.trim();
    }

    public Integer getActivate() {
        return activate;
    }

    public void setActivate(Integer activate) {
        this.activate = activate;
    }
}