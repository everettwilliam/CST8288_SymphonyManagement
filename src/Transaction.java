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
 * Description of this class.
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */

import java.util.Iterator;
import java.util.Vector;

public class Transaction {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	public Transaction(Identification id, Vector<Ticket> tickets, Date date) {
		this.id = id;
		this.tickets = tickets;
		this.date = date;
	}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Get a Vector of Tickets sold in this Transaction.
	 * 
	 * @return	Vector<Ticket>
	 */
	public Vector<Ticket> getTickets() {
		return tickets;
	}
	
	/**
	 * Get the total cost of this Transaction.
	 * @return	double
	 */
	public double getTotal() {
		return total;
	}
	
	/**
	 * Get the uniqiue Identification of this Transaction.
	 * 
	 * @return	Identification
	 */
	public Identification getId() {
		return id;
	}
	
	/**
	 * Get the PayMethod of this Transaction.
	 * 
	 * @return	PayMethod
	 */
	public PayMethod getPayment() {
		return payment;
	}
	
	/**
	 * Get the Date when this Transaction is performed.
	 *  
	 * @return	Date
	 */
	public Date getDate() {
		return date;
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Set the total cost of the transaction.
	 * 
	 * @param total
	 */
	public void setTotal(Vector<Ticket> tickets) {
		Iterator<Ticket> iterator = tickets.iterator();
		while (iterator.hasNext()) {
			total += iterator.next().getPrice();
		}
	}

	public void setPayment(PayMethod payment) {
		this.payment = payment;
	}
	
	/* HELPER METHODS	--------------------------------------------------	*/

	public String toString() {
		return "ID: " + id + ", Date: " + date + ", Tickets: " + tickets + ", Total: $" + total + ", Payment Method: " + payment;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This is a Vector of Ticket that holds the tickets purchased in this transaction.
	 */
	private Vector<Ticket> tickets;
	
	/**
	 * This is a double that holds the total cost of this transaction.
	 */
	private double total;

	/**
	 * This is an Identification object that holds unique identifier of this transaction.
	 */
	private Identification id;
	
	/**
	 * This is a PayMethod object which identifies the form of payment used.
	 */
	private PayMethod payment;
	
	/**
	 * This is a Date object that holds the date of the transaction.
	 */
	private Date date;


}	/*	End of CLASS:	Transaction.java			*/
