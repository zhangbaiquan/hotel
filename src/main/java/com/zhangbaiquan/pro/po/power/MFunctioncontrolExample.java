package com.zhangbaiquan.pro.po.power;

import java.util.ArrayList;
import java.util.List;

public class MFunctioncontrolExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MFunctioncontrolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPxidIsNull() {
            addCriterion("PXID is null");
            return (Criteria) this;
        }

        public Criteria andPxidIsNotNull() {
            addCriterion("PXID is not null");
            return (Criteria) this;
        }

        public Criteria andPxidEqualTo(Integer value) {
            addCriterion("PXID =", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidNotEqualTo(Integer value) {
            addCriterion("PXID <>", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidGreaterThan(Integer value) {
            addCriterion("PXID >", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PXID >=", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidLessThan(Integer value) {
            addCriterion("PXID <", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidLessThanOrEqualTo(Integer value) {
            addCriterion("PXID <=", value, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidIn(List<Integer> values) {
            addCriterion("PXID in", values, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidNotIn(List<Integer> values) {
            addCriterion("PXID not in", values, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidBetween(Integer value1, Integer value2) {
            addCriterion("PXID between", value1, value2, "pxid");
            return (Criteria) this;
        }

        public Criteria andPxidNotBetween(Integer value1, Integer value2) {
            addCriterion("PXID not between", value1, value2, "pxid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("IMAGE =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("IMAGE <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("IMAGE >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("IMAGE <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("IMAGE <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("IMAGE like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("IMAGE not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("IMAGE in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("IMAGE not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("IMAGE between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("IMAGE not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andPriIsNull() {
            addCriterion("PRI is null");
            return (Criteria) this;
        }

        public Criteria andPriIsNotNull() {
            addCriterion("PRI is not null");
            return (Criteria) this;
        }

        public Criteria andPriEqualTo(Integer value) {
            addCriterion("PRI =", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotEqualTo(Integer value) {
            addCriterion("PRI <>", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThan(Integer value) {
            addCriterion("PRI >", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRI >=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThan(Integer value) {
            addCriterion("PRI <", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThanOrEqualTo(Integer value) {
            addCriterion("PRI <=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriIn(List<Integer> values) {
            addCriterion("PRI in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotIn(List<Integer> values) {
            addCriterion("PRI not in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriBetween(Integer value1, Integer value2) {
            addCriterion("PRI between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotBetween(Integer value1, Integer value2) {
            addCriterion("PRI not between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("ISLEAF is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("ISLEAF is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(Integer value) {
            addCriterion("ISLEAF =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(Integer value) {
            addCriterion("ISLEAF <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(Integer value) {
            addCriterion("ISLEAF >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISLEAF >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(Integer value) {
            addCriterion("ISLEAF <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(Integer value) {
            addCriterion("ISLEAF <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<Integer> values) {
            addCriterion("ISLEAF in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<Integer> values) {
            addCriterion("ISLEAF not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(Integer value1, Integer value2) {
            addCriterion("ISLEAF between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(Integer value1, Integer value2) {
            addCriterion("ISLEAF not between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andParaIsNull() {
            addCriterion("PARA is null");
            return (Criteria) this;
        }

        public Criteria andParaIsNotNull() {
            addCriterion("PARA is not null");
            return (Criteria) this;
        }

        public Criteria andParaEqualTo(String value) {
            addCriterion("PARA =", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotEqualTo(String value) {
            addCriterion("PARA <>", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaGreaterThan(String value) {
            addCriterion("PARA >", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaGreaterThanOrEqualTo(String value) {
            addCriterion("PARA >=", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLessThan(String value) {
            addCriterion("PARA <", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLessThanOrEqualTo(String value) {
            addCriterion("PARA <=", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaLike(String value) {
            addCriterion("PARA like", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotLike(String value) {
            addCriterion("PARA not like", value, "para");
            return (Criteria) this;
        }

        public Criteria andParaIn(List<String> values) {
            addCriterion("PARA in", values, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotIn(List<String> values) {
            addCriterion("PARA not in", values, "para");
            return (Criteria) this;
        }

        public Criteria andParaBetween(String value1, String value2) {
            addCriterion("PARA between", value1, value2, "para");
            return (Criteria) this;
        }

        public Criteria andParaNotBetween(String value1, String value2) {
            addCriterion("PARA not between", value1, value2, "para");
            return (Criteria) this;
        }

        public Criteria andActivateIsNull() {
            addCriterion("ACTIVATE is null");
            return (Criteria) this;
        }

        public Criteria andActivateIsNotNull() {
            addCriterion("ACTIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andActivateEqualTo(Integer value) {
            addCriterion("ACTIVATE =", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotEqualTo(Integer value) {
            addCriterion("ACTIVATE <>", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThan(Integer value) {
            addCriterion("ACTIVATE >", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVATE >=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThan(Integer value) {
            addCriterion("ACTIVATE <", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVATE <=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateIn(List<Integer> values) {
            addCriterion("ACTIVATE in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotIn(List<Integer> values) {
            addCriterion("ACTIVATE not in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVATE between", value1, value2, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVATE not between", value1, value2, "activate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}