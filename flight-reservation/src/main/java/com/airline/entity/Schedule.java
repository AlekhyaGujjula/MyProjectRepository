package com.airline.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {

	@Id
	@GeneratedValue
	@Column(name = "schedule_id")
	private int id;
	
	@Column(name = "travel_date")
	private LocalDate travelDate;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "departure_time")
	private LocalDateTime departureTime;
	
	@Column(name = "arrival_time")
	private LocalDateTime arrivalTime;
	
	@ManyToOne
	@JoinColumn(name = "schedules.id")
	private Flight flight;
}
