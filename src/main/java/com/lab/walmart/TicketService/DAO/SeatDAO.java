package com.lab.walmart.TicketService.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * SeatDAO to access the seat table in DB
 *
 */

public class SeatDAO {
	
	/**
	 * In reality, seatTable would be a DB table with various attributes The
	 * priority column will be a indexed column so find largest would be logk(n)
	 * time Here we use a priority queue to mimic the DB
	 */

	final private static PriorityQueue<Integer> seatTableIndex = new PriorityQueue<>(200);

	/**
	 * Initialize the DAO with 200 available seats and an empty seat order table
	 */
	static{
		initialize();
	}
	
	public static void initialize() {
		seatTableIndex.clear();
		for (int i = 0; i < 200; i++) {
			seatTableIndex.add(i);
		}
	}

	public Integer getAvailableSeatNumber() {
		return seatTableIndex.size();
	}

	public List<Integer> takeAvailableSeatIds(int numSeats) {

		List<Integer> seatIDs = new ArrayList<>();
		for (int i = 0; i < numSeats; i++) {
			seatIDs.add(seatTableIndex.poll());
		}
		return seatIDs;
	}
	
	/**
	 * If tickets on hold timed out or customer cancel hold
	 * Seat IDs will be released to the queue
	 * 
	 * (The scenario will not happen under the current interface
	 * The method is here for future usage)
	 * 
	 * @param seatIDs
	 */
	public void releaseAvailableSeatIds(List<Integer> seatIDs) {
		
		for (Integer i : seatIDs) {
			seatTableIndex.add(i);
		}
	}

}
