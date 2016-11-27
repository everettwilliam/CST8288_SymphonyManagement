/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: Nadia Chubarev
 * Student #: 
 * Network login name: 
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.domain;

/**
 * This class encapsulates address information 
 * @author Nadia Chubarev
 * @version 1.0.0 November 20, 2016
 */
public class Address{

	/* CONSTRUCTORS ----------------------------------------------------- */

	/** Default constructor */
	public Address() {
		
	}
	
	public Address(String address){
		this.address = address;
	}

	/* ACCESSORS ----------------------------------------------------- */

	/**
	 * get method for address
	 * 
	 * @return address of type String
	 */
	public String getAddress() {
		return address;
	}

	/* MODIFIERS ----------------------------------------------------- */

	/**
	 * set method for address
	 * 
	 * @param address
	 *            is an input to the function as a String
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------- */

	/**
	 * toString method is a string representation of a the data
	 * 
	 * @return displays the address
	 */
	public String toString() {
		return "The address is: " + address;
	}

	/* HELPER METHODS -------------------------------------------------- */

	/* ATTRIBUTES ----------------------------------------------------- */
	/**
	 * String is used for address input
	 */

	private String address;

} /* End of CLASS: Address.java */
