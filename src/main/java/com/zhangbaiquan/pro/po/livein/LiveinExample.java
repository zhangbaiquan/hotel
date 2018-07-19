package com.zhangbaiquan.pro.po.livein;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    int startPos;
    int PageSize;
    
    public LiveinExample() {
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

        public Criteria andCustomernumIsNull() {
            addCriterion("customernum is null");
            return (Criteria) this;
        }

        public Criteria andCustomernumIsNotNull() {
            addCriterion("customernum is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernumEqualTo(String value) {
            addCriterion("customernum =", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotEqualTo(String value) {
            addCriterion("customernum <>", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumGreaterThan(String value) {
            addCriterion("customernum >", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumGreaterThanOrEqualTo(String value) {
            addCriterion("customernum >=", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumLessThan(String value) {
            addCriterion("customernum <", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumLessThanOrEqualTo(String value) {
            addCriterion("customernum <=", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumLike(String value) {
            addCriterion("customernum like", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotLike(String value) {
            addCriterion("customernum not like", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumIn(List<String> values) {
            addCriterion("customernum in", values, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotIn(List<String> values) {
            addCriterion("customernum not in", values, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumBetween(String value1, String value2) {
            addCriterion("customernum between", value1, value2, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotBetween(String value1, String value2) {
            addCriterion("customernum not between", value1, value2, "customernum");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("certificatetype is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("certificatetype is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("certificatetype =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("certificatetype <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("certificatetype >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificatetype >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("certificatetype <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("certificatetype <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("certificatetype like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("certificatetype not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("certificatetype in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("certificatetype not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("certificatetype between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("certificatetype not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomnum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomnum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("roomnum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("roomnum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("roomnum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("roomnum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("roomnum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("roomnum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("roomnum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("roomnum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("roomnum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("roomnum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("roomnum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("roomnum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNull() {
            addCriterion("checkintime is null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNotNull() {
            addCriterion("checkintime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeEqualTo(Date value) {
            addCriterion("checkintime =", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotEqualTo(Date value) {
            addCriterion("checkintime <>", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThan(Date value) {
            addCriterion("checkintime >", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkintime >=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThan(Date value) {
            addCriterion("checkintime <", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("checkintime <=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIn(List<Date> values) {
            addCriterion("checkintime in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotIn(List<Date> values) {
            addCriterion("checkintime not in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeBetween(Date value1, Date value2) {
            addCriterion("checkintime between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("checkintime not between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNull() {
            addCriterion("leavetime is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNotNull() {
            addCriterion("leavetime is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeEqualTo(Date value) {
            addCriterion("leavetime =", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotEqualTo(Date value) {
            addCriterion("leavetime <>", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThan(Date value) {
            addCriterion("leavetime >", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leavetime >=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThan(Date value) {
            addCriterion("leavetime <", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThanOrEqualTo(Date value) {
            addCriterion("leavetime <=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIn(List<Date> values) {
            addCriterion("leavetime in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotIn(List<Date> values) {
            addCriterion("leavetime not in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeBetween(Date value1, Date value2) {
            addCriterion("leavetime between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotBetween(Date value1, Date value2) {
            addCriterion("leavetime not between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(String value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(String value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(String value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(String value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(String value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(String value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLike(String value) {
            addCriterion("days like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotLike(String value) {
            addCriterion("days not like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<String> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<String> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(String value1, String value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(String value1, String value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNull() {
            addCriterion("certificatenum is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNotNull() {
            addCriterion("certificatenum is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumEqualTo(String value) {
            addCriterion("certificatenum =", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotEqualTo(String value) {
            addCriterion("certificatenum <>", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThan(String value) {
            addCriterion("certificatenum >", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThanOrEqualTo(String value) {
            addCriterion("certificatenum >=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThan(String value) {
            addCriterion("certificatenum <", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThanOrEqualTo(String value) {
            addCriterion("certificatenum <=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLike(String value) {
            addCriterion("certificatenum like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotLike(String value) {
            addCriterion("certificatenum not like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIn(List<String> values) {
            addCriterion("certificatenum in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotIn(List<String> values) {
            addCriterion("certificatenum not in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumBetween(String value1, String value2) {
            addCriterion("certificatenum between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotBetween(String value1, String value2) {
            addCriterion("certificatenum not between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andMembertypeIsNull() {
            addCriterion("membertype is null");
            return (Criteria) this;
        }

        public Criteria andMembertypeIsNotNull() {
            addCriterion("membertype is not null");
            return (Criteria) this;
        }

        public Criteria andMembertypeEqualTo(String value) {
            addCriterion("membertype =", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotEqualTo(String value) {
            addCriterion("membertype <>", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeGreaterThan(String value) {
            addCriterion("membertype >", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeGreaterThanOrEqualTo(String value) {
            addCriterion("membertype >=", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLessThan(String value) {
            addCriterion("membertype <", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLessThanOrEqualTo(String value) {
            addCriterion("membertype <=", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLike(String value) {
            addCriterion("membertype like", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotLike(String value) {
            addCriterion("membertype not like", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeIn(List<String> values) {
            addCriterion("membertype in", values, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotIn(List<String> values) {
            addCriterion("membertype not in", values, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeBetween(String value1, String value2) {
            addCriterion("membertype between", value1, value2, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotBetween(String value1, String value2) {
            addCriterion("membertype not between", value1, value2, "membertype");
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
}