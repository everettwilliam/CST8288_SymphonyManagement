/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: Tejasvi Jani
 * Student #: 040820690
 * Network login name: TejasviJani
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.domain;
/**
 * The year class encapsulates an integer that represents
 * a year.
 * @author    Tejasvi Jani	
 * @version   1.0.0 Date: 11/17/2016
 */
public class Year {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Constructor sets year
	 * @param year the value of the year encapsulated by this class
	 *************************************************************/
	public Year(int year){
		this.setYear(year);
	}
	
	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the year value
	 * @return year the value of the year encapsulated by this class
	 *************************************************************/
	public int getYear() {
		return year;
	}
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the value of year
	 * @param year the value of the year encapsulated by this class
	 *************************************************************/
	public void setYear(int year) {
		this.year = year;
	}
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/	
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/** stores a value representing a calendar year*/
	private int year;

}	/*	End of CLASS:	Year.java			*/