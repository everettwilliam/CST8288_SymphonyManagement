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
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/

/**
 * MovementBuilder is used to build Movement.
 * It makes use of Name and Identification. 
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-21
 */
public class MovementBuilder {

	/**
	 * The default constructor of MovementBuilder.
	 * Takes no parameters and returns nothing.
	 */
	public MovementBuilder() {
		
	}

	/**
	 * This method gets the Identification of the Movement.
	 * 
	 * @return	Idetification
	 */
	public Identification getID() {
		return movementID;
	}
	
	/**
	 * This method gets the Name of the Movement.
	 * 
	 * @return	Name
	 */
	public Name getName() {
		return movementName;
	}

	/**
	 * This method builds an instance of Movement using this MovementBuilder.
	 * 
	 * @return	Movement
	 */
	public Movement build() {
		return Movement.getMovement(this);
	}

	/**
	 * This method sets the Identification of the movement.
	 * 
	 * @param 	id	Identification
	 * @return	MovementBuilder
	 */
	public MovementBuilder movementID(Identification id) {
		this.movementID = id;
		return this;
	}

	/**
	 * This method sets the Name of the movement
	 * 
	 * @param 	name	Name
	 * @return	MovementBuilder
	 */
	public MovementBuilder movementName(Name name) {
		this.movementName = name;
		return this;
	}

	/**
	 * This holds the unique Identification of the movement.
	 */
	private Identification movementID;
	
	/**
	 * This holds the Name of the movement.
	 */
	private Name movementName;


}	/*	End of CLASS:	MovementBuilder.java			*/
