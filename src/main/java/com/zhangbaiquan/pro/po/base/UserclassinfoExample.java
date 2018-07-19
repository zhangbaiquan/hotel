package com.zhangbaiquan.pro.po.base;

import java.util.ArrayList;
import java.util.List;

public class UserclassinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserclassinfoExample() {
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

        public Criteria andUserclassidIsNull() {
            addCriterion("UserClassID is null");
            return (Criteria) this;
        }

        public Criteria andUserclassidIsNotNull() {
            addCriterion("UserClassID is not null");
            return (Criteria) this;
        }

        public Criteria andUserclassidEqualTo(Integer value) {
            addCriterion("UserClassID =", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidNotEqualTo(Integer value) {
            addCriterion("UserClassID <>", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidGreaterThan(Integer value) {
            addCriterion("UserClassID >", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserClassID >=", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidLessThan(Integer value) {
            addCriterion("UserClassID <", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidLessThanOrEqualTo(Integer value) {
            addCriterion("UserClassID <=", value, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidIn(List<Integer> values) {
            addCriterion("UserClassID in", values, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidNotIn(List<Integer> values) {
            addCriterion("UserClassID not in", values, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidBetween(Integer value1, Integer value2) {
            addCriterion("UserClassID between", value1, value2, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserClassID not between", value1, value2, "userclassid");
            return (Criteria) this;
        }

        public Criteria andUserclassnameIsNull() {
            addCriterion("UserClassName is null");
            return (Criteria) this;
        }

        public Criteria andUserclassnameIsNotNull() {
            addCriterion("UserClassName is not null");
            return (Criteria) this;
        }

        public Criteria andUserclassnameEqualTo(String value) {
            addCriterion("UserClassName =", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameNotEqualTo(String value) {
            addCriterion("UserClassName <>", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameGreaterThan(String value) {
            addCriterion("UserClassName >", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("UserClassName >=", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameLessThan(String value) {
            addCriterion("UserClassName <", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameLessThanOrEqualTo(String value) {
            addCriterion("UserClassName <=", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameLike(String value) {
            addCriterion("UserClassName like", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameNotLike(String value) {
            addCriterion("UserClassName not like", value, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameIn(List<String> values) {
            addCriterion("UserClassName in", values, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameNotIn(List<String> values) {
            addCriterion("UserClassName not in", values, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameBetween(String value1, String value2) {
            addCriterion("UserClassName between", value1, value2, "userclassname");
            return (Criteria) this;
        }

        public Criteria andUserclassnameNotBetween(String value1, String value2) {
            addCriterion("UserClassName not between", value1, value2, "userclassname");
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