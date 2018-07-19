package com.zhangbaiquan.pro.po.base;

import java.util.ArrayList;
import java.util.List;

public class TitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleExample() {
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

        public Criteria andTitleidIsNull() {
            addCriterion("titleId is null");
            return (Criteria) this;
        }

        public Criteria andTitleidIsNotNull() {
            addCriterion("titleId is not null");
            return (Criteria) this;
        }

        public Criteria andTitleidEqualTo(String value) {
            addCriterion("titleId =", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotEqualTo(String value) {
            addCriterion("titleId <>", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidGreaterThan(String value) {
            addCriterion("titleId >", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidGreaterThanOrEqualTo(String value) {
            addCriterion("titleId >=", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidLessThan(String value) {
            addCriterion("titleId <", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidLessThanOrEqualTo(String value) {
            addCriterion("titleId <=", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidLike(String value) {
            addCriterion("titleId like", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotLike(String value) {
            addCriterion("titleId not like", value, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidIn(List<String> values) {
            addCriterion("titleId in", values, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotIn(List<String> values) {
            addCriterion("titleId not in", values, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidBetween(String value1, String value2) {
            addCriterion("titleId between", value1, value2, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitleidNotBetween(String value1, String value2) {
            addCriterion("titleId not between", value1, value2, "titleid");
            return (Criteria) this;
        }

        public Criteria andTitlenameIsNull() {
            addCriterion("titleName is null");
            return (Criteria) this;
        }

        public Criteria andTitlenameIsNotNull() {
            addCriterion("titleName is not null");
            return (Criteria) this;
        }

        public Criteria andTitlenameEqualTo(String value) {
            addCriterion("titleName =", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotEqualTo(String value) {
            addCriterion("titleName <>", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameGreaterThan(String value) {
            addCriterion("titleName >", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameGreaterThanOrEqualTo(String value) {
            addCriterion("titleName >=", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLessThan(String value) {
            addCriterion("titleName <", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLessThanOrEqualTo(String value) {
            addCriterion("titleName <=", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLike(String value) {
            addCriterion("titleName like", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotLike(String value) {
            addCriterion("titleName not like", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameIn(List<String> values) {
            addCriterion("titleName in", values, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotIn(List<String> values) {
            addCriterion("titleName not in", values, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameBetween(String value1, String value2) {
            addCriterion("titleName between", value1, value2, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotBetween(String value1, String value2) {
            addCriterion("titleName not between", value1, value2, "titlename");
            return (Criteria) this;
        }

        public Criteria andEx1IsNull() {
            addCriterion("EX1 is null");
            return (Criteria) this;
        }

        public Criteria andEx1IsNotNull() {
            addCriterion("EX1 is not null");
            return (Criteria) this;
        }

        public Criteria andEx1EqualTo(String value) {
            addCriterion("EX1 =", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotEqualTo(String value) {
            addCriterion("EX1 <>", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThan(String value) {
            addCriterion("EX1 >", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThanOrEqualTo(String value) {
            addCriterion("EX1 >=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThan(String value) {
            addCriterion("EX1 <", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThanOrEqualTo(String value) {
            addCriterion("EX1 <=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Like(String value) {
            addCriterion("EX1 like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotLike(String value) {
            addCriterion("EX1 not like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1In(List<String> values) {
            addCriterion("EX1 in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotIn(List<String> values) {
            addCriterion("EX1 not in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Between(String value1, String value2) {
            addCriterion("EX1 between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotBetween(String value1, String value2) {
            addCriterion("EX1 not between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx2IsNull() {
            addCriterion("EX2 is null");
            return (Criteria) this;
        }

        public Criteria andEx2IsNotNull() {
            addCriterion("EX2 is not null");
            return (Criteria) this;
        }

        public Criteria andEx2EqualTo(String value) {
            addCriterion("EX2 =", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotEqualTo(String value) {
            addCriterion("EX2 <>", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThan(String value) {
            addCriterion("EX2 >", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThanOrEqualTo(String value) {
            addCriterion("EX2 >=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThan(String value) {
            addCriterion("EX2 <", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThanOrEqualTo(String value) {
            addCriterion("EX2 <=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Like(String value) {
            addCriterion("EX2 like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotLike(String value) {
            addCriterion("EX2 not like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2In(List<String> values) {
            addCriterion("EX2 in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotIn(List<String> values) {
            addCriterion("EX2 not in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Between(String value1, String value2) {
            addCriterion("EX2 between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotBetween(String value1, String value2) {
            addCriterion("EX2 not between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx3IsNull() {
            addCriterion("EX3 is null");
            return (Criteria) this;
        }

        public Criteria andEx3IsNotNull() {
            addCriterion("EX3 is not null");
            return (Criteria) this;
        }

        public Criteria andEx3EqualTo(String value) {
            addCriterion("EX3 =", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotEqualTo(String value) {
            addCriterion("EX3 <>", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThan(String value) {
            addCriterion("EX3 >", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThanOrEqualTo(String value) {
            addCriterion("EX3 >=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThan(String value) {
            addCriterion("EX3 <", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThanOrEqualTo(String value) {
            addCriterion("EX3 <=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Like(String value) {
            addCriterion("EX3 like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotLike(String value) {
            addCriterion("EX3 not like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3In(List<String> values) {
            addCriterion("EX3 in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotIn(List<String> values) {
            addCriterion("EX3 not in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Between(String value1, String value2) {
            addCriterion("EX3 between", value1, value2, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotBetween(String value1, String value2) {
            addCriterion("EX3 not between", value1, value2, "ex3");
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