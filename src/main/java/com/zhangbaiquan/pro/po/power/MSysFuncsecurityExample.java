package com.zhangbaiquan.pro.po.power;

import java.util.ArrayList;
import java.util.List;

public class MSysFuncsecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MSysFuncsecurityExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andMisUseridIsNull() {
            addCriterion("MIS_USERID is null");
            return (Criteria) this;
        }

        public Criteria andMisUseridIsNotNull() {
            addCriterion("MIS_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andMisUseridEqualTo(Integer value) {
            addCriterion("MIS_USERID =", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridNotEqualTo(Integer value) {
            addCriterion("MIS_USERID <>", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridGreaterThan(Integer value) {
            addCriterion("MIS_USERID >", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIS_USERID >=", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridLessThan(Integer value) {
            addCriterion("MIS_USERID <", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridLessThanOrEqualTo(Integer value) {
            addCriterion("MIS_USERID <=", value, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridIn(List<Integer> values) {
            addCriterion("MIS_USERID in", values, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridNotIn(List<Integer> values) {
            addCriterion("MIS_USERID not in", values, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridBetween(Integer value1, Integer value2) {
            addCriterion("MIS_USERID between", value1, value2, "misUserid");
            return (Criteria) this;
        }

        public Criteria andMisUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("MIS_USERID not between", value1, value2, "misUserid");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNull() {
            addCriterion("FUNCTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("FUNCTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(String value) {
            addCriterion("FUNCTION_ID =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(String value) {
            addCriterion("FUNCTION_ID <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(String value) {
            addCriterion("FUNCTION_ID >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ID >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(String value) {
            addCriterion("FUNCTION_ID <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ID <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLike(String value) {
            addCriterion("FUNCTION_ID like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotLike(String value) {
            addCriterion("FUNCTION_ID not like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<String> values) {
            addCriterion("FUNCTION_ID in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<String> values) {
            addCriterion("FUNCTION_ID not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(String value1, String value2) {
            addCriterion("FUNCTION_ID between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_ID not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andLockIsNull() {
            addCriterion("`LOCK` is null");
            return (Criteria) this;
        }

        public Criteria andLockIsNotNull() {
            addCriterion("`LOCK` is not null");
            return (Criteria) this;
        }

        public Criteria andLockEqualTo(Integer value) {
            addCriterion("`LOCK` =", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockNotEqualTo(Integer value) {
            addCriterion("`LOCK` <>", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockGreaterThan(Integer value) {
            addCriterion("`LOCK` >", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("`LOCK` >=", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockLessThan(Integer value) {
            addCriterion("LOCK <", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockLessThanOrEqualTo(Integer value) {
            addCriterion("LOCK <=", value, "lock");
            return (Criteria) this;
        }

        public Criteria andLockIn(List<Integer> values) {
            addCriterion("LOCK in", values, "lock");
            return (Criteria) this;
        }

        public Criteria andLockNotIn(List<Integer> values) {
            addCriterion("LOCK not in", values, "lock");
            return (Criteria) this;
        }

        public Criteria andLockBetween(Integer value1, Integer value2) {
            addCriterion("LOCK between", value1, value2, "lock");
            return (Criteria) this;
        }

        public Criteria andLockNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCK not between", value1, value2, "lock");
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