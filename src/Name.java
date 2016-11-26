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
 * @version   1.0.0 Date 11/17/2016
 */
public class Name {
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	public Name(){}

	/* ACCESSORS	-----------------------------------------------------	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/
	public String toString(){
		return "Name:" + getName();
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/											
	private String name;

}/*	End of CLASS:	Name.java			*/
