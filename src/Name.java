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
 * This class encapsulates a string that represents a
 * persons name.
 * @author    Tejasvi Jani
 * @version   1.0.0 Date 11/17/2016
 */
public class Name {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	/**
	 * Default constructor
	 *************************************************************/
	public Name(){}
	
	public Name(String name){
		this.name = name;
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Returns the string value for name
	 * @return name the string representing a name encapulated by this class
	 *************************************************************/
	public String getName() {
		return name;
	}
	/**
	 * Sets the value of name
	 * @param name the string representing a name encapulated by this class
	 *************************************************************/
	public void setName(String name) {
		this.name = name;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/
	/**
	 * Returns a string of the name
	 * @return name a formatted string representing a name encapulated by this class
	 *************************************************************/
	public String toString(){
		return "Name:" + getName();
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/		
    /** stores the value of a name*/
	private String name;

}/*	End of CLASS:	Name.java			*/
