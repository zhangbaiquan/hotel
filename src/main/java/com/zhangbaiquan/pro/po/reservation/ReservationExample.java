package com.zhangbaiquan.pro.po.reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    int startPos;
    int PageSize;

    public ReservationExample() {
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

        public Criteria andReserveidIsNull() {
            addCriterion("reserveid is null");
            return (Criteria) this;
        }

        public Criteria andReserveidIsNotNull() {
            addCriterion("reserveid is not null");
            return (Criteria) this;
        }

        public Criteria andReserveidEqualTo(Integer value) {
            addCriterion("reserveid =", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidNotEqualTo(Integer value) {
            addCriterion("reserveid <>", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidGreaterThan(Integer value) {
            addCriterion("reserveid >", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserveid >=", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidLessThan(Integer value) {
            addCriterion("reserveid <", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidLessThanOrEqualTo(Integer value) {
            addCriterion("reserveid <=", value, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidIn(List<Integer> values) {
            addCriterion("reserveid in", values, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidNotIn(List<Integer> values) {
            addCriterion("reserveid not in", values, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidBetween(Integer value1, Integer value2) {
            addCriterion("reserveid between", value1, value2, "reserveid");
            return (Criteria) this;
        }

        public Criteria andReserveidNotBetween(Integer value1, Integer value2) {
            addCriterion("reserveid not between", value1, value2, "reserveid");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomid is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomid =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomid <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomid >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomid >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomid <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomid <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomid in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomid not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomid between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomid not between", value1, value2, "roomid");
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

        public Criteria andCardnumIsNull() {
            addCriterion("cardnum is null");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNotNull() {
            addCriterion("cardnum is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumEqualTo(String value) {
            addCriterion("cardnum =", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotEqualTo(String value) {
            addCriterion("cardnum <>", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThan(String value) {
            addCriterion("cardnum >", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThanOrEqualTo(String value) {
            addCriterion("cardnum >=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThan(String value) {
            addCriterion("cardnum <", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThanOrEqualTo(String value) {
            addCriterion("cardnum <=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLike(String value) {
            addCriterion("cardnum like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotLike(String value) {
            addCriterion("cardnum not like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumIn(List<String> values) {
            addCriterion("cardnum in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotIn(List<String> values) {
            addCriterion("cardnum not in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumBetween(String value1, String value2) {
            addCriterion("cardnum between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotBetween(String value1, String value2) {
            addCriterion("cardnum not between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phonenum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phonenum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phonenum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phonenum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phonenum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phonenum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phonenum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phonenum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phonenum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phonenum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phonenum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phonenum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phonenum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIsNull() {
            addCriterion("reservationtime is null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIsNotNull() {
            addCriterion("reservationtime is not null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeEqualTo(Date value) {
            addCriterion("reservationtime =", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotEqualTo(Date value) {
            addCriterion("reservationtime <>", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThan(Date value) {
            addCriterion("reservationtime >", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reservationtime >=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThan(Date value) {
            addCriterion("reservationtime <", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThanOrEqualTo(Date value) {
            addCriterion("reservationtime <=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIn(List<Date> values) {
            addCriterion("reservationtime in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotIn(List<Date> values) {
            addCriterion("reservationtime not in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeBetween(Date value1, Date value2) {
            addCriterion("reservationtime between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotBetween(Date value1, Date value2) {
            addCriterion("reservationtime not between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNull() {
            addCriterion("reservetime is null");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNotNull() {
            addCriterion("reservetime is not null");
            return (Criteria) this;
        }

        public Criteria andReservetimeEqualTo(Date value) {
            addCriterion("reservetime =", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotEqualTo(Date value) {
            addCriterion("reservetime <>", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThan(Date value) {
            addCriterion("reservetime >", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reservetime >=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThan(Date value) {
            addCriterion("reservetime <", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThanOrEqualTo(Date value) {
            addCriterion("reservetime <=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeIn(List<Date> values) {
            addCriterion("reservetime in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotIn(List<Date> values) {
            addCriterion("reservetime not in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeBetween(Date value1, Date value2) {
            addCriterion("reservetime between", value1, value2, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotBetween(Date value1, Date value2) {
            addCriterion("reservetime not between", value1, value2, "reservetime");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleIsNull() {
            addCriterion("numofpeople is null");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleIsNotNull() {
            addCriterion("numofpeople is not null");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleEqualTo(String value) {
            addCriterion("numofpeople =", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleNotEqualTo(String value) {
            addCriterion("numofpeople <>", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleGreaterThan(String value) {
            addCriterion("numofpeople >", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("numofpeople >=", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleLessThan(String value) {
            addCriterion("numofpeople <", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleLessThanOrEqualTo(String value) {
            addCriterion("numofpeople <=", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleLike(String value) {
            addCriterion("numofpeople like", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleNotLike(String value) {
            addCriterion("numofpeople not like", value, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleIn(List<String> values) {
            addCriterion("numofpeople in", values, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleNotIn(List<String> values) {
            addCriterion("numofpeople not in", values, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleBetween(String value1, String value2) {
            addCriterion("numofpeople between", value1, value2, "numofpeople");
            return (Criteria) this;
        }

        public Criteria andNumofpeopleNotBetween(String value1, String value2) {
            addCriterion("numofpeople not between", value1, value2, "numofpeople");
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