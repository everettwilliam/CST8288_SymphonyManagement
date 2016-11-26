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
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.24
 */
public abstract class Person {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Default consturctor
	 *************************************************************/
	public Person(){
		
	}
	
	/**
	 * Constructor sets name, address and phone
	 * @param name the name of a person
	 * @param address the address where a person resided
	 * @param phone a persons contact number
	 *************************************************************/
	public Person(Name name, Address address, Phone phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the name object for the person
	 * @return name the name of a person
	 *************************************************************/
	public Name getName(){
		return name;
	}
	
	/**
	 * Returns the address object for the person
	 * @return address the address where a person resided
	 *************************************************************/
	public Address getAddress(){
		return address;
	}
	
	/**
	 * Returns the phone object for the person
	 * @return phone a persons contact number
	 *************************************************************/
	public Phone getPhone(){
		return phone;
	}
	
	/**
	 *Returns the id object for the person
	 *@return id a unique identifier for a person
	 *************************************************************/
	public Identification getIdentification(){
		return id;
	}
	


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the name of the person
	 * @param name the name of a person
	 *************************************************************/
	public void setName(Name name){
		this.name = name;
	}
	/**
	 * Sets the address of the person
	 * @param address the address where a person resides
	 *************************************************************/
	public void setAddress(Address address){
		this.address = address;
	}
	
	/**
	 * Sets the phone of the person
	 * @param phone a persons contect number
	 *************************************************************/
	public void setPhone(Phone phone){
		this.phone = phone;
	}
	
	/**
	 * Sets the id of the person
	 * @param id a unique identifier for a person
	 *************************************************************/
	public void setID(Identification id){
		this.id = id;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	/** the name of a person*/
	private Name name;
	/** the address where the person resides*/
	private Address address;
	/** the phone number of the person */
	private Phone phone;
	/** the persons unique id*/
	private Identification id;

}	/*	End of CLASS:	Person.java			*/
