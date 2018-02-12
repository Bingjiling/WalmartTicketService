package com.lab.walmart.TicketService.DAO;

import java.util.ArrayList;
import java.util.List;

import com.lab.walmart.TicketService.model.SeatHold;
import com.lab.walmart.TicketService.service.TicketService;

public class SeatHoldDAO {
	
	/**
	 * Store seats on hold in a list since the best seat in one seatHold
	 * is unique across all seatHolds and is in the range 0-199
	 */
	private static final List<SeatHold> seatHoldingTable = new ArrayList<>();

	static {
		initialize();
	}
	public static void initialize() {
		seatHoldingTable.clear();
		for (int i = 0; i < TicketService.TOTAL_SEAT_NUMBER; i++) {
			seatHoldingTable.add(null);
		}
	}
	
	public SeatHold saveSeatHold(SeatHold sh) {

		// One seat can only be in one seatHold object at one time
		// So using the first seatID as key is safe
		seatHoldingTable.set(sh.getSeatHoldID(), sh);
		return sh;
	}

	public SeatHold getSeatHold(Integer seatHoldId) {
		return seatHoldingTable.get(seatHoldId);
	}
}
