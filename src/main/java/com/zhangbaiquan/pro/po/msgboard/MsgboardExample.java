package com.zhangbaiquan.pro.po.msgboard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgboardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    int startPos;
    int PageSize;

    public MsgboardExample() {
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

        public Criteria andMsgboardidIsNull() {
            addCriterion("msgboardid is null");
            return (Criteria) this;
        }

        public Criteria andMsgboardidIsNotNull() {
            addCriterion("msgboardid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgboardidEqualTo(Integer value) {
            addCriterion("msgboardid =", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidNotEqualTo(Integer value) {
            addCriterion("msgboardid <>", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidGreaterThan(Integer value) {
            addCriterion("msgboardid >", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgboardid >=", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidLessThan(Integer value) {
            addCriterion("msgboardid <", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidLessThanOrEqualTo(Integer value) {
            addCriterion("msgboardid <=", value, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidIn(List<Integer> values) {
            addCriterion("msgboardid in", values, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidNotIn(List<Integer> values) {
            addCriterion("msgboardid not in", values, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidBetween(Integer value1, Integer value2) {
            addCriterion("msgboardid between", value1, value2, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardidNotBetween(Integer value1, Integer value2) {
            addCriterion("msgboardid not between", value1, value2, "msgboardid");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameIsNull() {
            addCriterion("msgboardname is null");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameIsNotNull() {
            addCriterion("msgboardname is not null");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameEqualTo(String value) {
            addCriterion("msgboardname =", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameNotEqualTo(String value) {
            addCriterion("msgboardname <>", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameGreaterThan(String value) {
            addCriterion("msgboardname >", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameGreaterThanOrEqualTo(String value) {
            addCriterion("msgboardname >=", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameLessThan(String value) {
            addCriterion("msgboardname <", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameLessThanOrEqualTo(String value) {
            addCriterion("msgboardname <=", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameLike(String value) {
            addCriterion("msgboardname like", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameNotLike(String value) {
            addCriterion("msgboardname not like", value, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameIn(List<String> values) {
            addCriterion("msgboardname in", values, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameNotIn(List<String> values) {
            addCriterion("msgboardname not in", values, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameBetween(String value1, String value2) {
            addCriterion("msgboardname between", value1, value2, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardnameNotBetween(String value1, String value2) {
            addCriterion("msgboardname not between", value1, value2, "msgboardname");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeIsNull() {
            addCriterion("msgboardtime is null");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeIsNotNull() {
            addCriterion("msgboardtime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeEqualTo(Date value) {
            addCriterion("msgboardtime =", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeNotEqualTo(Date value) {
            addCriterion("msgboardtime <>", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeGreaterThan(Date value) {
            addCriterion("msgboardtime >", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("msgboardtime >=", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeLessThan(Date value) {
            addCriterion("msgboardtime <", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeLessThanOrEqualTo(Date value) {
            addCriterion("msgboardtime <=", value, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeIn(List<Date> values) {
            addCriterion("msgboardtime in", values, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeNotIn(List<Date> values) {
            addCriterion("msgboardtime not in", values, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeBetween(Date value1, Date value2) {
            addCriterion("msgboardtime between", value1, value2, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardtimeNotBetween(Date value1, Date value2) {
            addCriterion("msgboardtime not between", value1, value2, "msgboardtime");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneIsNull() {
            addCriterion("msgboardphone is null");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneIsNotNull() {
            addCriterion("msgboardphone is not null");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneEqualTo(String value) {
            addCriterion("msgboardphone =", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneNotEqualTo(String value) {
            addCriterion("msgboardphone <>", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneGreaterThan(String value) {
            addCriterion("msgboardphone >", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneGreaterThanOrEqualTo(String value) {
            addCriterion("msgboardphone >=", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneLessThan(String value) {
            addCriterion("msgboardphone <", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneLessThanOrEqualTo(String value) {
            addCriterion("msgboardphone <=", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneLike(String value) {
            addCriterion("msgboardphone like", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneNotLike(String value) {
            addCriterion("msgboardphone not like", value, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneIn(List<String> values) {
            addCriterion("msgboardphone in", values, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneNotIn(List<String> values) {
            addCriterion("msgboardphone not in", values, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneBetween(String value1, String value2) {
            addCriterion("msgboardphone between", value1, value2, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andMsgboardphoneNotBetween(String value1, String value2) {
            addCriterion("msgboardphone not between", value1, value2, "msgboardphone");
            return (Criteria) this;
        }

        public Criteria andEx1IsNull() {
            addCriterion("ex1 is null");
            return (Criteria) this;
        }

        public Criteria andEx1IsNotNull() {
            addCriterion("ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andEx1EqualTo(String value) {
            addCriterion("ex1 =", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotEqualTo(String value) {
            addCriterion("ex1 <>", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThan(String value) {
            addCriterion("ex1 >", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThanOrEqualTo(String value) {
            addCriterion("ex1 >=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThan(String value) {
            addCriterion("ex1 <", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThanOrEqualTo(String value) {
            addCriterion("ex1 <=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Like(String value) {
            addCriterion("ex1 like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotLike(String value) {
            addCriterion("ex1 not like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1In(List<String> values) {
            addCriterion("ex1 in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotIn(List<String> values) {
            addCriterion("ex1 not in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Between(String value1, String value2) {
            addCriterion("ex1 between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotBetween(String value1, String value2) {
            addCriterion("ex1 not between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx2IsNull() {
            addCriterion("ex2 is null");
            return (Criteria) this;
        }

        public Criteria andEx2IsNotNull() {
            addCriterion("ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andEx2EqualTo(String value) {
            addCriterion("ex2 =", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotEqualTo(String value) {
            addCriterion("ex2 <>", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThan(String value) {
            addCriterion("ex2 >", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThanOrEqualTo(String value) {
            addCriterion("ex2 >=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThan(String value) {
            addCriterion("ex2 <", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThanOrEqualTo(String value) {
            addCriterion("ex2 <=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Like(String value) {
            addCriterion("ex2 like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotLike(String value) {
            addCriterion("ex2 not like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2In(List<String> values) {
            addCriterion("ex2 in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotIn(List<String> values) {
            addCriterion("ex2 not in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Between(String value1, String value2) {
            addCriterion("ex2 between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotBetween(String value1, String value2) {
            addCriterion("ex2 not between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx3IsNull() {
            addCriterion("ex3 is null");
            return (Criteria) this;
        }

        public Criteria andEx3IsNotNull() {
            addCriterion("ex3 is not null");
            return (Criteria) this;
        }

        public Criteria andEx3EqualTo(String value) {
            addCriterion("ex3 =", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotEqualTo(String value) {
            addCriterion("ex3 <>", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThan(String value) {
            addCriterion("ex3 >", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3GreaterThanOrEqualTo(String value) {
            addCriterion("ex3 >=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThan(String value) {
            addCriterion("ex3 <", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3LessThanOrEqualTo(String value) {
            addCriterion("ex3 <=", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Like(String value) {
            addCriterion("ex3 like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotLike(String value) {
            addCriterion("ex3 not like", value, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3In(List<String> values) {
            addCriterion("ex3 in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotIn(List<String> values) {
            addCriterion("ex3 not in", values, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3Between(String value1, String value2) {
            addCriterion("ex3 between", value1, value2, "ex3");
            return (Criteria) this;
        }

        public Criteria andEx3NotBetween(String value1, String value2) {
            addCriterion("ex3 not between", value1, value2, "ex3");
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

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public int getPageSize() {
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
}