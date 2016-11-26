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
 * @version   1.0.0 Date 11/17/2016
 */
public class Phone {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Constructor sets phone number
	 * @param phoneNumber the phone number encapsulated by this class
	 *************************************************************/
	public Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the string for phone number
	 * @return phoneNumber the phone number encapsulated by this class
	 *************************************************************/
	public String getPhone() {
		return phoneNumber;
	}
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the string for phone number
	 * @param phoneNumber the phone number encapsulated by this class
	 *************************************************************/
	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	/** stores a string for phone number*/
	private String phoneNumber;
	
}	/*	End of CLASS:	Phone.java			*/
