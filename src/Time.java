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
 * Description of this class.
 * @author    Tejasvi Jani	
 * @version   1.0.0 Date: 11/17/2016
 */
public class Time {

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	public Time(){}

	/* ACCESSORS	-----------------------------------------------------	*/

	public int getHour() {
		return hour;
	}	

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/

	public String toString(){
		return "Time(Hour:Minute):" + getHour() +":" + getMinute();
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	private int hour;
	private int minute;
	private int second;
	
}	/*	End of CLASS:	Time.java			*/
