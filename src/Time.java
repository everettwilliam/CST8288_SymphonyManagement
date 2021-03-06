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
 * The time class encapsulated data used to represent
 * a time stamp
 * @author    Tejasvi Jani	
 * @version   1.0.0 Date: 11/17/2016
 */
public class Time {

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Default consturctor
	 *************************************************************/
	public Time(){}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Returns the value for hour
	 * @return hour the value representing the hours in a time stamp
	 *************************************************************/
	public int getHour() {
		return hour;
	}	

	/**
	 * Returns the value for minute
	 * @param minute the value representing the minutes in a time stamp
	 *************************************************************/
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * Returns the value for second
	 * @return second the value representing the seconds in a time stamp
	 *************************************************************/
	public int getSecond() {
		return second;
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Sets the value for hour
	 * @param hour the value representing the hours in a time stamp
	 *************************************************************/
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * Sets the value for minute
	 * @return minute the value representing the minutes in a time stamp
	 *************************************************************/
	public int getMinute() {
		return minute;
	}

	/**
	 * Sets the value for second
	 * @param second the value representing the seconds in a time stamp
	 **************************************************************/
	public void setSecond(int second) {
		this.second = second;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/

	/**
	 * toString method returns a string representation of the time
	 * @return string formatted string representing the time
	 *************************************************************/
	public String toString(){
		return "Time(Hour:Minute):" + getHour() +":" + getMinute();
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	/** stores the value for hour*/
	private int hour;
	/** stores the value for minute*/
	private int minute;
	/** stores the value for second*/
	private int second;
	
}	/*	End of CLASS:	Time.java			*/
