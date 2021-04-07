package com.airline.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Seat")
public class Seat {
	
	public enum SeatClass{
		ECONOMIC,
		BUSINESS,
		FIRST
	}
	@Id
	@GeneratedValue
	

	@Column(name = "seat_no")
	private int no;
	
	@Column(name = "seat_class")
	@Enumerated(EnumType.STRING)
	private SeatClass seatClass;
	
	@Column(name = "seat_fare")
	private double fare;
	
	@ManyToOne
	@JoinColumn(name = "flight_no")
	private Flight flight;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public SeatClass getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(SeatClass seatClass) {
		this.seatClass = seatClass;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
	

}
