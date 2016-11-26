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
 * This class builds a full date by utilizing a DateBuilder class
 * 
 * @author Nadia Chubarev
 * @version 1.0.0 November 20, 2016
 */
public class Date {

	/* CONSTRUCTORS ----------------------------------------------------- */
	/**
	 * constructor for the day, month and year
	 * 
	 * @param builder
	 */
	private Date(DateBuilder builder) {
		this.day = builder.getDay();
		this.month = builder.getMonth();
		this.year = builder.getYear();

	}

	/* ACCESSORS ----------------------------------------------------- */

	/**
	 * get method for the Date
	 * 
	 * @param builder the builder of Date objects
	 * @return instance of date
	 */
	public static Date getDate(DateBuilder builder) {
		return new Date(builder);
	}
	/* MODIFIERS ----------------------------------------------------- */

	/* NORMAL BEHAVIOR -------------------------------------------------- */

	/* HELPER METHODS -------------------------------------------------- */
	
	/**
	 * 
	 * 
	 * @return string instance of date
	 */
	public String toString(){
		return String.format("%d%d%d", year.getYear(),month.getMonth(),day.getDay());
	}

	/* ATTRIBUTES ----------------------------------------------------- */
	/**
	 * Year is used for year input
	 */
	private Year year;

	/**
	 * Month is used for month input
	 */
	private Month month;

	/**
	 * Day is used for day input
	 */
	private Day day;

	/**
	 * Time is used for time input
	 */
	private Time time;

} /* End of CLASS: Date.java */
