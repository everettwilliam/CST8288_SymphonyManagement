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
 * This class extends Person to create Composer.
 * Composer adds Vector<Composition> to hold the Compositions by this Composer.
 * It includes the getter and setter for Vector<Composition>.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */
public class Composer extends Person {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Composer uses the super constructor from person to set Name, Address, and Phone.
	 * It makes use of Name, Address, Phone, and Composition.
	 * This constructor also sets compositions which is a Vector<Composition>.
	 * 
	 * @param 	name			Name
	 * @param 	address			Address
	 * @param 	phone			Phone
	 * @param 	compositions	Vector<Composition>
	 */
	public Composer(Name name, Address address, Phone phone, Vector<Composition> compositions) {
		super(name, address, phone);
		this.compositions = compositions;
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Get a Vector of Compositions created by this Composer.
	 * 
	 * @return	Vector<Composition>
	 */
	public Vector<Composition> getCompositions() {
		return this.compositions;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Set the Vector of Compositions created by this Composer.
	 * 
	 * @param 	compositions	Vector<Composition>
	 */
	public void setCompositions(Vector<Composition> compositions) {
		this.compositions = compositions;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This holds the Compositions created by this Composer.
	 */
	private Vector<Composition> compositions;


}	/*	End of CLASS:	Composer.java			*/

