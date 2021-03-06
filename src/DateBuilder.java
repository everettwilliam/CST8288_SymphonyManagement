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
 * This class helps to assemble all date components together and is used by Date
 * class
 * 
 * @author Nadia Chubarev
 * @version 1.0.0 November 20, 2016
 */
public class DateBuilder {

	/* CONSTRUCTORS ----------------------------------------------------- */
	/**
	 * constructor
	 * 
	 * @param year
	 *            of type Year
	 * @param month
	 *            of type Month
	 * @param day
	 *            of type Day
	 */
	public DateBuilder(Year year, Month month, Day day) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * method for setting time of Date object
	 * 
	 * @param time Time object
	 * @return the instance of the DateBuilder
	 */
	public DateBuilder time(Time time){
		this.time = time;
		return this;
	}
	
	/**
	 * get method for the Day class
	 * 
	 * @return day object
	 */
	public Day getDay() {
		return day;
	}

	/**
	 * get method for the Month class
	 * 
	 * @return month object
	 */
	public Month getMonth() {
		return month;
	}

	/**
	 * get method for the Year class
	 * 
	 * @return year object
	 */
	public Year getYear() {
		return year;
	}

	/**
	 * get method for the Time class
	 * 
	 * @return time object
	 */
	public Time getTime() {
		return time;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------- */
	/* HELPER METHODS -------------------------------------------------- */

	/**
	 * Instantiates a Date object
	 * 
	 * @return  an object of type Date
	 */

	public Date build() {
		return Date.getDate(this);
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

} /* End of CLASS: DateBuilder.java */