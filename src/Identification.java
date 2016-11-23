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
 * This class verifies the identification (ID) of the person.
 * 
 * @author Nadia Chubarev
 * @version 1.0.0 November 20, 2016
 */
public class Identification {

	/* CONSTRUCTORS ----------------------------------------------------- */
	/**
	 * constructor for Identification class
	 */

	public Identification(String id) {
		this.id = id;
	}

	/* ACCESSORS ----------------------------------------------------- */

	/**
	 * get method for the id
	 * 
	 * @return id of type String
	 */

	public String getID() {
		return id;
	}

	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * set method for id
	 * 
	 * @param id
	 *            is an input to the function as a String
	 */

	public void setID(String id) {
		this.id = id;
	}
	/* NORMAL BEHAVIOR -------------------------------------------------- */
	/* HELPER METHODS -------------------------------------------------- */
	/* ATTRIBUTES ----------------------------------------------------- */

	/** String is used for id input */
	private String id;
	
} /* End of CLASS: Identification.java */
