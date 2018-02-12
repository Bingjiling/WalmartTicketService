package com.lab.walmart.TicketService.model;

public enum SeatStatus {
	A("Available"),
	H("On hold"),
	R("Reserved");
	
	private final String description;
	
	SeatStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
