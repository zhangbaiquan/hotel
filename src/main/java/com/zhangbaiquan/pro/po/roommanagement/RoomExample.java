package com.zhangbaiquan.pro.po.roommanagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    int startPos;
    int PageSize;
    
    public RoomExample() {
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

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsreservationIsNull() {
            addCriterion("isreservation is null");
            return (Criteria) this;
        }

        public Criteria andIsreservationIsNotNull() {
            addCriterion("isreservation is not null");
            return (Criteria) this;
        }

        public Criteria andIsreservationEqualTo(String value) {
            addCriterion("isreservation =", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationNotEqualTo(String value) {
            addCriterion("isreservation <>", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationGreaterThan(String value) {
            addCriterion("isreservation >", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationGreaterThanOrEqualTo(String value) {
            addCriterion("isreservation >=", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationLessThan(String value) {
            addCriterion("isreservation <", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationLessThanOrEqualTo(String value) {
            addCriterion("isreservation <=", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationLike(String value) {
            addCriterion("isreservation like", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationNotLike(String value) {
            addCriterion("isreservation not like", value, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationIn(List<String> values) {
            addCriterion("isreservation in", values, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationNotIn(List<String> values) {
            addCriterion("isreservation not in", values, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationBetween(String value1, String value2) {
            addCriterion("isreservation between", value1, value2, "isreservation");
            return (Criteria) this;
        }

        public Criteria andIsreservationNotBetween(String value1, String value2) {
            addCriterion("isreservation not between", value1, value2, "isreservation");
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

        public Criteria andArriveIsNull() {
            addCriterion("arrive is null");
            return (Criteria) this;
        }

        public Criteria andArriveIsNotNull() {
            addCriterion("arrive is not null");
            return (Criteria) this;
        }

        public Criteria andArriveEqualTo(String value) {
            addCriterion("arrive =", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveNotEqualTo(String value) {
            addCriterion("arrive <>", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveGreaterThan(String value) {
            addCriterion("arrive >", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveGreaterThanOrEqualTo(String value) {
            addCriterion("arrive >=", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveLessThan(String value) {
            addCriterion("arrive <", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveLessThanOrEqualTo(String value) {
            addCriterion("arrive <=", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveLike(String value) {
            addCriterion("arrive like", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveNotLike(String value) {
            addCriterion("arrive not like", value, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveIn(List<String> values) {
            addCriterion("arrive in", values, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveNotIn(List<String> values) {
            addCriterion("arrive not in", values, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveBetween(String value1, String value2) {
            addCriterion("arrive between", value1, value2, "arrive");
            return (Criteria) this;
        }

        public Criteria andArriveNotBetween(String value1, String value2) {
            addCriterion("arrive not between", value1, value2, "arrive");
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

        public Criteria andInstructionsIsNull() {
            addCriterion("instructions is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsIsNotNull() {
            addCriterion("instructions is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsEqualTo(String value) {
            addCriterion("instructions =", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotEqualTo(String value) {
            addCriterion("instructions <>", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThan(String value) {
            addCriterion("instructions >", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("instructions >=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThan(String value) {
            addCriterion("instructions <", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThanOrEqualTo(String value) {
            addCriterion("instructions <=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLike(String value) {
            addCriterion("instructions like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotLike(String value) {
            addCriterion("instructions not like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsIn(List<String> values) {
            addCriterion("instructions in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotIn(List<String> values) {
            addCriterion("instructions not in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsBetween(String value1, String value2) {
            addCriterion("instructions between", value1, value2, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotBetween(String value1, String value2) {
            addCriterion("instructions not between", value1, value2, "instructions");
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