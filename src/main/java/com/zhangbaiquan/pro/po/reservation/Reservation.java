package com.zhangbaiquan.pro.po.reservation;

import java.io.Serializable;
import java.util.Date;

import com.zhangbaiquan.pro.vo.BaseVO;

public class Reservation extends BaseVO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6771048116883799665L;

	private Integer reserveid;

    private Integer roomid;

    private String roomnum;

    private String name;

    private String gender;

    private String cardnum;

    private String phonenum;

    private Date reservationtime;

    private Date reservetime;

    private String numofpeople;

    private String note;

    private String ex1;

    private String ex2;

    private String ex3;

    private String ex4;

    private String ex5;

    public Integer getReserveid() {
        return reserveid;
    }

    public void setReserveid(Integer reserveid) {
        this.reserveid = reserveid;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }

    public String getNumofpeople() {
        return numofpeople;
    }

    public void setNumofpeople(String numofpeople) {
        this.numofpeople = numofpeople == null ? null : numofpeople.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
		return "Reservation [reserveid=" + reserveid + ", roomid=" + roomid + ", roomnum=" + roomnum + ", name=" + name
				+ ", gender=" + gender + ", cardnum=" + cardnum + ", phonenum=" + phonenum + ", reservationtime="
				+ reservationtime + ", reservetime=" + reservetime + ", numofpeople=" + numofpeople + ", note=" + note
				+ ", ex1=" + ex1 + ", ex2=" + ex2 + ", ex3=" + ex3 + ", ex4=" + ex4 + ", ex5=" + ex5 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardnum == null) ? 0 : cardnum.hashCode());
		result = prime * result + ((ex1 == null) ? 0 : ex1.hashCode());
		result = prime * result + ((ex2 == null) ? 0 : ex2.hashCode());
		result = prime * result + ((ex3 == null) ? 0 : ex3.hashCode());
		result = prime * result + ((ex4 == null) ? 0 : ex4.hashCode());
		result = prime * result + ((ex5 == null) ? 0 : ex5.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((numofpeople == null) ? 0 : numofpeople.hashCode());
		result = prime * result + ((phonenum == null) ? 0 : phonenum.hashCode());
		result = prime * result + ((reservationtime == null) ? 0 : reservationtime.hashCode());
		result = prime * result + ((reserveid == null) ? 0 : reserveid.hashCode());
		result = prime * result + ((reservetime == null) ? 0 : reservetime.hashCode());
		result = prime * result + ((roomid == null) ? 0 : roomid.hashCode());
		result = prime * result + ((roomnum == null) ? 0 : roomnum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (cardnum == null) {
			if (other.cardnum != null)
				return false;
		} else if (!cardnum.equals(other.cardnum))
			return false;
		if (ex1 == null) {
			if (other.ex1 != null)
				return false;
		} else if (!ex1.equals(other.ex1))
			return false;
		if (ex2 == null) {
			if (other.ex2 != null)
				return false;
		} else if (!ex2.equals(other.ex2))
			return false;
		if (ex3 == null) {
			if (other.ex3 != null)
				return false;
		} else if (!ex3.equals(other.ex3))
			return false;
		if (ex4 == null) {
			if (other.ex4 != null)
				return false;
		} else if (!ex4.equals(other.ex4))
			return false;
		if (ex5 == null) {
			if (other.ex5 != null)
				return false;
		} else if (!ex5.equals(other.ex5))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (numofpeople == null) {
			if (other.numofpeople != null)
				return false;
		} else if (!numofpeople.equals(other.numofpeople))
			return false;
		if (phonenum == null) {
			if (other.phonenum != null)
				return false;
		} else if (!phonenum.equals(other.phonenum))
			return false;
		if (reservationtime == null) {
			if (other.reservationtime != null)
				return false;
		} else if (!reservationtime.equals(other.reservationtime))
			return false;
		if (reserveid == null) {
			if (other.reserveid != null)
				return false;
		} else if (!reserveid.equals(other.reserveid))
			return false;
		if (reservetime == null) {
			if (other.reservetime != null)
				return false;
		} else if (!reservetime.equals(other.reservetime))
			return false;
		if (roomid == null) {
			if (other.roomid != null)
				return false;
		} else if (!roomid.equals(other.roomid))
			return false;
		if (roomnum == null) {
			if (other.roomnum != null)
				return false;
		} else if (!roomnum.equals(other.roomnum))
			return false;
		return true;
	}
}