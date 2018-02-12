package com.lab.walmart.TicketService.model;

import java.util.List;

public class SeatHold {
	
	private Integer seatHoldID;
	private List<Integer> seatIds;
	private SeatStatus status;
	private String customerEmail;
	
	public SeatHold() {
		
	}
	
	public SeatHold(Integer seatHoldID, List<Integer> seatIds, SeatStatus status, String customerEmail) {
		this.seatHoldID = seatHoldID;
		this.seatIds = seatIds;
		this.status = status;
		this.customerEmail = customerEmail;
	}
	
	public Integer getSeatHoldID() {
		return seatHoldID;
	}
	
	public void setSeatHoldID(Integer seatHoldID) {
		this.seatHoldID = seatHoldID;
	}
	
	public List<Integer> getSeatIds() {
		return seatIds;
	}
	
	public void setSeatIds(List<Integer> seatIds) {
		this.seatIds = seatIds;
	}
	
	public SeatStatus getStatus() {
		return status;
	}
	
	public void setStatus(SeatStatus status) {
		this.status = status;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
}
