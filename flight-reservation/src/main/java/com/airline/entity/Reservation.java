package com.airline.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue
	@Column(name = "ticket_no")
	private int eTicketNo;
	
	@Column(name = "date_of_booking")
	private LocalDate dateOfBooking;
	
	@Column(name = "flight_status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "reservations.eTicketNo")
	private Flight flight;
	
	//private Payment payment;
	
	private User user;
	
}
