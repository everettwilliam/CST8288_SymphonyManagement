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
/**
 * Ticket creates a ticket that belongs to a Venue and is used by Transaction.
 * It makes use of Identification and Venue classes.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */
public class Ticket {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * This constructor sets the mandatory fields of Ticket, Identification, price, and Venue.
	 * 
	 * @param	id		Identification
	 * @param 	price	double
	 * @param 	venue	Venue
	 */
	public Ticket(Identification id, double price, Venue venue) {
		this.identification = id;
		this.price = price;
		this.venue = venue;
	}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Get the price of the ticket.
	 * 
	 * @return	double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Get the unique identifier of the ticket.
	 * 
	 * @return	Identification
	 */
	public Identification getIdentification() {
		return identification;
	}

	/**
	 * Get the venue of the ticket.
	 * 
	 * @return	Venue
	 */
	public Venue getVenue() {
		return venue;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This is an double that holds the price of the ticket.
	 */
	private double price;

	/**
	 * This is an Identification object that holds unique identifier of this ticket.
	 */
	private Identification identification;

	/**
	 * This is Venue that holds a reference to the venue this ticket belongs to.
	 */
	private Venue venue;

}	/*	End of CLASS:	Ticket.java			*/
