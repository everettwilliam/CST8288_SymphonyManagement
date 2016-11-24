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
	 * @param name
	 * @param address
	 * @param phone
	 *************************************************************/
	public Person(Name name, Address address, Phone phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the name object for the person
	 * @return name
	 *************************************************************/
	public Name getName(){
		return name;
	}
	
	/**
	 * Returns the address object for the person
	 * @return address
	 *************************************************************/
	public Address getAddress(){
		return address;
	}
	
	/**
	 * Returns the phone object for the person
	 * @return phone
	 *************************************************************/
	public Phone getPhone(){
		return phone;
	}
	
	/**
	 *Returns the id object for the person
	 *@return id
	 *************************************************************/
	public Identification getIdentification(){
		return id;
	}
	


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the name of the person
	 * @param name
	 *************************************************************/
	public void setName(Name name){
		this.name = name;
	}
	/**
	 * Sets the address of the person
	 * @param address
	 *************************************************************/
	public void setAddress(Address address){
		this.address = address;
	}
	
	/**
	 * Sets the phone of the person
	 * @param phone
	 *************************************************************/
	public void setPhone(Phone phone){
		this.phone = phone;
	}
	
	/**
	 * Sets the id of the person
	 * @param id
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
