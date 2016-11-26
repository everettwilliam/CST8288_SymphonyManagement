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

/**
 * Description of this class.
 * @author    Tejasvi Jani	
 * @version   1.0.0 Date: 11/17/2016
 */
public class Month {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Constructor sets month
	 * @param month
	 *************************************************************/
	public Month(int month) {
		this.setMonth(month);
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the value for month
	 * @param year
	 *************************************************************/
	public int getMonth() {
		return month;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the value for month
	 * @param year
	 *************************************************************/
	public void setMonth(int month) {
		this.month = month;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/
	/** stores a value for month*/
	private int month;


}	/*	End of CLASS:	Month.java			*/