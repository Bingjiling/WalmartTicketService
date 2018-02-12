package com.lab.walmart.TicketService;

import com.lab.walmart.TicketService.model.SeatHold;
import com.lab.walmart.TicketService.service.TicketService;
import com.lab.walmart.TicketService.service.TicketServiceImpl;

import junit.framework.TestCase;

public class TicketServiceImplTest extends TestCase{
	TicketService ts = new TicketServiceImpl();
	
	public void testNumSeatsAvailable() {
		
		ts.initialize();
		assertTrue(TicketService.TOTAL_SEAT_NUMBER.equals(ts.numSeatsAvailable()));
		ts.findAndHoldSeats(4, "yz2690@columbia.edu");
		assertTrue(TicketService.TOTAL_SEAT_NUMBER.equals(ts.numSeatsAvailable() + 4));
		ts.findAndHoldSeats(3, "yz2690@columbia.edu");
		assertTrue(TicketService.TOTAL_SEAT_NUMBER.equals(ts.numSeatsAvailable() + 7));
	}
	
	public void testFindAndHoldSeats() {
		ts.initialize();
		SeatHold sh = ts.findAndHoldSeats(4, "yz2690@columbia.edu");
		assertTrue(sh.getSeatHoldID().equals(0));
	}
	
	public void testReserveSeats() {
		ts.initialize();
		SeatHold sh = ts.findAndHoldSeats(4, "yz2690@columbia.edu");
		assertTrue(sh.getSeatHoldID().equals(0));
		ts.reserveSeats(sh.getSeatHoldID(), "yz2690@columbia.edu");
	}
}
