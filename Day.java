/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: 
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
 * This class builds a Day parameter
 * 
 * @author Nadia Chubarev
 * @version 1.0.0 November, 2016
 */
public class Day {

	/* CONSTRUCTORS ----------------------------------------------------- */

	/**
	 * constructor for Day class
	 * 
	 */

	public Day(int day) {
		this.day = day;
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * get method for the day
	 * 
	 * @return day of type integer
	 */

	public int getDay() {
		return day;
	}
	/* MODIFIERS ----------------------------------------------------- */

	/**
	 * set method for the day
	 * 
	 * @param day
	 *            is an integer input to the function
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/* NORMAL BEHAVIOR -------------------------------------------------- */

	/* HELPER METHODS -------------------------------------------------- */

	/* ATTRIBUTES ----------------------------------------------------- */
	/**
	 * integer is used for day input
	 */
	private int day;

} /* End of CLASS: Day.java */
