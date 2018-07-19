package com.zhangbaiquan.pro.po.roommanagement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.zhangbaiquan.pro.vo.BaseVO;

public class Room extends BaseVO implements Serializable {
	private Integer roomid;

    private String roomnum;

    private Integer customerid;

    private Integer reserveid;

    private String floor;

    private String type;

    private BigDecimal price;

    private String state;

    private String isreservation;

    private Date reservationtime;

    private String arrive;

    private String deposit;

    private String instructions;

    private String ex1;

    private String ex2;

    private String ex3;

    private String ex4;

    private String ex5;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getReserveid() {
        return reserveid;
    }

    public void setReserveid(Integer reserveid) {
        this.reserveid = reserveid;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsreservation() {
        return isreservation;
    }

    public void setIsreservation(String isreservation) {
        this.isreservation = isreservation == null ? null : isreservation.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive == null ? null : arrive.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions == null ? null : instructions.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3 == null ? null : ex3.trim();
    }

    public String getEx4() {
        return ex4;
    }

    public void setEx4(String ex4) {
        this.ex4 = ex4 == null ? null : ex4.trim();
    }

    public String getEx5() {
        return ex5;
    }

    public void setEx5(String ex5) {
        this.ex5 = ex5 == null ? null : ex5.trim();
    }

	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomnum=" + roomnum + ", customerid=" + customerid + ", reserveid="
				+ reserveid + ", floor=" + floor + ", type=" + type + ", price=" + price + ", state=" + state
				+ ", isreservation=" + isreservation + ", reservationtime=" + reservationtime + ", arrive=" + arrive
				+ ", deposit=" + deposit + ", instructions=" + instructions + ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3="
				+ ex3 + ", ex4=" + ex4 + ", ex5=" + ex5 + "]";
	}
}