/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: VICTORIA SAWYER
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

import java.util.ArrayList;
/**
 * The season class represents a season that has scheduled
 * a number of concerts.
 * @author    VICTORIA SAWYER
 * @version   1.0.0 2016.11.26
 */
public class Season extends ArrayList<Concert> {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * The default constructor of Season sets openingDate, a Date object,
	 * and sets seasonLength, an int.
	 * 
	 * @param openingDate	Date
	 * @param length		int
	 */
	private Season() {
		
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Get the openingDate of the season.
	 * 
	 * @return	Date
	 */
	public Date getOpeningDate() {
		return openingDate;
	}

	/**
	 * Get the length of the season.
	 * 
	 * @return int
	 */
	public int getSeasonLength() {
		return seasonLength;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Set the length of the season.
	 * 
	 * @param days	int
	 */
	public void setLength(int days) {
		seasonLength = days;
	}

	/* HELPER METHODS	--------------------------------------------------	*/
	
	/**
	 * Method returns the static Season variable, the only instance
	 * of the Season class
	 * @return season the only instance of season
	 */
	public static Season season(){
		return season;
	}
	
	/**
	 * Adds a concert to the season.
	 * 
	 * @param concert the concert object to add to the season
	 * @return boolean
	 */
	public boolean addConcert(Concert concert){		
		return super.add(concert);
	}

	/**
	 * Outpus a string that gives the opening date of the season and its length in days.
	 * 
	 * @return String
	 */
	public String toString() {
		return "The concert season begins on " + openingDate + " and is " + seasonLength + " days long.";
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * A Date object representing the opening date of the season.
	 */
	private Date openingDate;
	
	/**
	 * An int object that represents the length of the season in days.
	 */
	private int seasonLength;
	
	/**
	 * The only instance of Season available
	 */
	private static Season season = new Season();

}	/*	End of CLASS:	Season.java			*/
