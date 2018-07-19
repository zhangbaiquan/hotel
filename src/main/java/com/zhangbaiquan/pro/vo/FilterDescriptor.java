package com.zhangbaiquan.pro.vo;

import java.util.ArrayList;
import java.util.List;

public class FilterDescriptor {
	private String logic;	//逻辑 如 and、or
    private List<FilterDescriptor> filters;//各字段查询集合（同一字段下还可能是2个条件的or: 字段A条件1 or 字段A条件2）
    private String field;	//字段 如city
    private Object value;	//值 如 London
    private String operator;//操作符 如startwith。包括"isnull", "isnotnull", "isempty", "isnotempty"
    private boolean ignoreCase = true;

    public FilterDescriptor() {
        filters = new ArrayList<FilterDescriptor>();
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public boolean isIgnoreCase() {
        return ignoreCase;
    }

    public void setIgnoreCase(boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    public List<FilterDescriptor> getFilters() {
        return filters;
    }
}
