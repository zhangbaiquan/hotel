package com.zhangbaiquan.pro.po.changeroom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChangeroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    private int startPos;
    private int PageSize;
    private Date beginDate;
    private Date endDate;
    private String certificatenum;
    private String name;
    private String realname;
    private String ex1;

    public ChangeroomExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOriginalroomIsNull() {
            addCriterion("originalroom is null");
            return (Criteria) this;
        }

        public Criteria andOriginalroomIsNotNull() {
            addCriterion("originalroom is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalroomEqualTo(String value) {
            addCriterion("originalroom =", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomNotEqualTo(String value) {
            addCriterion("originalroom <>", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomGreaterThan(String value) {
            addCriterion("originalroom >", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomGreaterThanOrEqualTo(String value) {
            addCriterion("originalroom >=", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomLessThan(String value) {
            addCriterion("originalroom <", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomLessThanOrEqualTo(String value) {
            addCriterion("originalroom <=", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomLike(String value) {
            addCriterion("originalroom like", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomNotLike(String value) {
            addCriterion("originalroom not like", value, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomIn(List<String> values) {
            addCriterion("originalroom in", values, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomNotIn(List<String> values) {
            addCriterion("originalroom not in", values, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomBetween(String value1, String value2) {
            addCriterion("originalroom between", value1, value2, "originalroom");
            return (Criteria) this;
        }

        public Criteria andOriginalroomNotBetween(String value1, String value2) {
            addCriterion("originalroom not between", value1, value2, "originalroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomIsNull() {
            addCriterion("changeroom is null");
            return (Criteria) this;
        }

        public Criteria andChangeroomIsNotNull() {
            addCriterion("changeroom is not null");
            return (Criteria) this;
        }

        public Criteria andChangeroomEqualTo(String value) {
            addCriterion("changeroom =", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomNotEqualTo(String value) {
            addCriterion("changeroom <>", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomGreaterThan(String value) {
            addCriterion("changeroom >", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomGreaterThanOrEqualTo(String value) {
            addCriterion("changeroom >=", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomLessThan(String value) {
            addCriterion("changeroom <", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomLessThanOrEqualTo(String value) {
            addCriterion("changeroom <=", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomLike(String value) {
            addCriterion("changeroom like", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomNotLike(String value) {
            addCriterion("changeroom not like", value, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomIn(List<String> values) {
            addCriterion("changeroom in", values, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomNotIn(List<String> values) {
            addCriterion("changeroom not in", values, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomBetween(String value1, String value2) {
            addCriterion("changeroom between", value1, value2, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangeroomNotBetween(String value1, String value2) {
            addCriterion("changeroom not between", value1, value2, "changeroom");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("changetime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changetime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("changetime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("changetime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("changetime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changetime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("changetime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("changetime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("changetime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("changetime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("changetime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("changetime not between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidIsNull() {
            addCriterion("emplyeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidIsNotNull() {
            addCriterion("emplyeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidEqualTo(String value) {
            addCriterion("emplyeeId =", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidNotEqualTo(String value) {
            addCriterion("emplyeeId <>", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidGreaterThan(String value) {
            addCriterion("emplyeeId >", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidGreaterThanOrEqualTo(String value) {
            addCriterion("emplyeeId >=", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidLessThan(String value) {
            addCriterion("emplyeeId <", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidLessThanOrEqualTo(String value) {
            addCriterion("emplyeeId <=", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidLike(String value) {
            addCriterion("emplyeeId like", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidNotLike(String value) {
            addCriterion("emplyeeId not like", value, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidIn(List<String> values) {
            addCriterion("emplyeeId in", values, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidNotIn(List<String> values) {
            addCriterion("emplyeeId not in", values, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidBetween(String value1, String value2) {
            addCriterion("emplyeeId between", value1, value2, "emplyeeid");
            return (Criteria) this;
        }

        public Criteria andEmplyeeidNotBetween(String value1, String value2) {
            addCriterion("emplyeeId not between", value1, value2, "emplyeeid");
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

        public Criteria andEx4IsNull() {
            addCriterion("ex4 is null");
            return (Criteria) this;
        }

        public Criteria andEx4IsNotNull() {
            addCriterion("ex4 is not null");
            return (Criteria) this;
        }

        public Criteria andEx4EqualTo(String value) {
            addCriterion("ex4 =", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4NotEqualTo(String value) {
            addCriterion("ex4 <>", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4GreaterThan(String value) {
            addCriterion("ex4 >", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4GreaterThanOrEqualTo(String value) {
            addCriterion("ex4 >=", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4LessThan(String value) {
            addCriterion("ex4 <", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4LessThanOrEqualTo(String value) {
            addCriterion("ex4 <=", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4Like(String value) {
            addCriterion("ex4 like", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4NotLike(String value) {
            addCriterion("ex4 not like", value, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4In(List<String> values) {
            addCriterion("ex4 in", values, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4NotIn(List<String> values) {
            addCriterion("ex4 not in", values, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4Between(String value1, String value2) {
            addCriterion("ex4 between", value1, value2, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx4NotBetween(String value1, String value2) {
            addCriterion("ex4 not between", value1, value2, "ex4");
            return (Criteria) this;
        }

        public Criteria andEx5IsNull() {
            addCriterion("ex5 is null");
            return (Criteria) this;
        }

        public Criteria andEx5IsNotNull() {
            addCriterion("ex5 is not null");
            return (Criteria) this;
        }

        public Criteria andEx5EqualTo(String value) {
            addCriterion("ex5 =", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5NotEqualTo(String value) {
            addCriterion("ex5 <>", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5GreaterThan(String value) {
            addCriterion("ex5 >", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5GreaterThanOrEqualTo(String value) {
            addCriterion("ex5 >=", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5LessThan(String value) {
            addCriterion("ex5 <", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5LessThanOrEqualTo(String value) {
            addCriterion("ex5 <=", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5Like(String value) {
            addCriterion("ex5 like", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5NotLike(String value) {
            addCriterion("ex5 not like", value, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5In(List<String> values) {
            addCriterion("ex5 in", values, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5NotIn(List<String> values) {
            addCriterion("ex5 not in", values, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5Between(String value1, String value2) {
            addCriterion("ex5 between", value1, value2, "ex5");
            return (Criteria) this;
        }

        public Criteria andEx5NotBetween(String value1, String value2) {
            addCriterion("ex5 not between", value1, value2, "ex5");
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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCertificatenum() {
		return certificatenum;
	}

	public void setCertificatenum(String certificatenum) {
		this.certificatenum = certificatenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEx1() {
		return ex1;
	}

	public void setEx1(String ex1) {
		this.ex1 = ex1;
	}
}