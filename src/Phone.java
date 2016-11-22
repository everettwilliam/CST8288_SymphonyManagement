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
	public Phone(){}

	/* ACCESSORS	-----------------------------------------------------	*/
	public String getPhone() {
		return phoneNumber;
	}
	
	/* MODIFIERS	-----------------------------------------------------	*/
	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/

	/* HELPER METHODS	--------------------------------------------------	*/

	//	public String toString(){}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/											
	private String phoneNumber;
}	/*	End of CLASS:	Phone.java			*/
