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
package symphony.domain;

/**
 * This class uses MovementBuilder to create a Movement.
 * Movement is used by Composition.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-21
 */
public class Movement {

	/**
	 * This constructor sets the Movement variables using getters from MovementBuilder.
	 * 
	 * @param	builder		MovementBuilder
	 */
	private Movement(MovementBuilder builder) {
		this.movementNumber = builder.getID();
		this.movementName = builder.getName();
	}
	
	/**
	 * This method returns an instance of a Movement.
	 * 
	 * @param	builder		MovementBuilder
	 * @return	Movement
	 */
	public static Movement getMovement(MovementBuilder builder) {
		return new Movement(builder);
	}

	/**
	 * This uses the Identification class and holds the unique identifier of the movement.
	 */
	private Identification movementNumber;
	
	/**
	 * This uses the Name class and holds the name of the movement.
	 */
	private Name movementName;


}	/*	End of CLASS:	Movement.java			*/
