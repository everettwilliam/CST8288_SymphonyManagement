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
 * **************************************************************/
package symphony.domain;

import java.util.Vector;

/**
 * This class extends Person to create Conductor.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-24
 */
public class Conductor extends Person {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Composer uses the super constructor from person to set Name, Address, and Phone.
	 * It makes use of Name, Address, and Phone.
	 * 
	 * @param 	name			Name
	 * @param 	address			Address
	 * @param 	phone			Phone
	 */
	public Conductor(Name name, Address address, Phone phone) {
		super(name, address, phone);
	}

}	/*	End of CLASS:	Conductor.java			*/

