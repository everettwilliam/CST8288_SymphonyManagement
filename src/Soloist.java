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


/**
 * This class extends Person to create Soloist.
 * Soloist adds a String to hold the expertise of this Soloist.
 * It includes the getter and setter for expertise.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-24
 */
public class Soloist extends Person {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Soloist uses the super constructor from person to set Name, Address, and Phone.
	 * It makes use of Name, Address, and Phone.
	 * This constructor also sets expertise which is a String.
	 * 
	 * @param 	name			Name
	 * @param 	address			Address
	 * @param 	phone			Phone
	 * @param 	expertise		String
	 */
	public Soloist(Name name, Address address, Phone phone, String expertise) {
		super(name, address, phone);
		this.expertise = expertise;
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Get a String that holds the expertise of the Soloist.
	 * 
	 * @return	String
	 */
	public String getExpertise() {
		return this.expertise;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Set the String that holds the expertise of the Soloist.
	 * 
	 * @param 	expertise	String
	 */
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This holds the expertise of the Soloist.
	 */
	private String expertise;


}	/*	End of CLASS:	Soloist.java			*/
