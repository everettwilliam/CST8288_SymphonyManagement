/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: Victoria Sawyer
 * Student #: 040633981
 * Network login name: sawy0025
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 * **************************************************************/
package symphony.domain;

import java.util.Vector;

/**
 * Venue creates a venue to be used by Concert and Ticket.
 * It makes use of Address, Concert, and Ticket.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */
public class Venue {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * This constructor sets the mandatory Address and number of seats.
	 * 
	 * @param	location	Address
	 * @param 	seats		int
	 */
	public Venue(Address location, int seats) {
		this.location = location;
		this.seats = seats;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Get the concerts that happen in this venue.
	 * 
	 * @return	Vector<Concert>
	 */
	public Vector<Concert> getConcerts() {
		return this.concerts;
	}
	
	/**
	 * Get the location of the venue.
	 * 
	 * @return	Address
	 */
	public Address getLocation() {
		return this.location;
	}
	
	/**
	 * Get the number of seats in the venue.
	 * 
	 * @return	int
	 */
	public int getSeats() {
		return this.seats;
	}
	
	/**
	 * Get the tickets for this venue.
	 * 
	 * @return	Vector<Ticket>
	 */
	public Vector<Ticket> getTickets() {
		return this.tickets;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Add the concerts that are happening in the venue.
	 * 
	 * @param	concerts	Vector<Concert>
	 */
	public void setConcerts(Vector<Concert> concerts) {
		this.concerts = concerts;
	}
	
	/**
	 * Add the tickets for this venue.
	 * 
	 * @param	tickets		Vector<Ticket>
	 */
	public void setTickets(Vector<Ticket> tickets) {
		this.tickets = tickets;
	}

	/* HELPER METHODS	--------------------------------------------------	*/

	/**
	 * This returns a string with information about the location of the venue and the number of seats.
	 * 
	 * @return	String
	 */
	public String toString() {
		return "Venue located at " + location + " has " + seats + " seats.";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This is a Vector of Concert that holds the concerts happening in this venue.
	 */
	private Vector<Concert> concerts;
	
	/**
	 * This is an Address that holds the location of this venue.
	 */
	private Address location;
	
	/**
	 * This is an int that holds the number of seats in this venue.
	 */
	private int seats;
	
	/**
	 * This is a Vector of Ticket that holds the tickets available for this venue.
	 */
	private Vector<Ticket> tickets;


}	/*	End of CLASS:	Venue.java			*/
