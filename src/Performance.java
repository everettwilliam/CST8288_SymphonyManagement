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
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.domain;

import java.util.ArrayList;

/**
 * Performance extends ArrayList with Composition as the generic.
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-24
 */
public class Performance extends ArrayList<Composition> {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * The default constructor for Performance.
	 */
	public Performance() {
		
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Get the Date of the Perormance.
	 * 
	 * @return	Date
	 */
	public Date getPerfomanceDate() {
		return performanceDate;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Set the Date of the Performance
	 * 
	 * @param 	performanceDate		Date
	 */
	public void setPerformanceDate(Date performanceDate) {
		this.performanceDate = performanceDate;
	}

	/* HELPER METHODS	--------------------------------------------------	*/

	/**
	 * Output the Date of the Performance to a string.
	 * 
	 * @return	String
	 */
	public String toString() {
		return "Performance is occuring on " + getPerfomanceDate() +  ".";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This holds a Date which is the date of the performance.
	 */
	private Date performanceDate;


}	/*	End of CLASS:	Performance.java			*/
