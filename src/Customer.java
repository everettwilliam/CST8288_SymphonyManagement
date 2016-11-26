/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: EVERETT HOLDEN
 * Student #: 040812130
 * Network login name: hold0052
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.domain;
/**
 * Represents a Customer 
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.25
 */
public class Customer extends Person{

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Constructor sets name, address and phone
	 * @param name the name of the customer
	 * @param address the address where the customer resides
	 * @param phone the customers contact number
	 *************************************************************/
	public Customer(Name name, Address address, Phone phone){
		super(name, address, phone);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
}	/*	End of CLASS:	Customer.java			*/

