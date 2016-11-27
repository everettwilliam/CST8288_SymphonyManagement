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

import java.util.Vector;

import symphony.domain.CompositionBuilder;
import symphony.domain.Identification;

/**
 * This class encapsulates information related to pieces of
 * music, specifically a composition of one or more movements. 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-21
 */

public class Composition {

	/**
	 * This method sets the Composition variables using getters from CompositionBuilder.
	 * 
	 * @param	builder		CompositionBuilder
	 */
	private Composition(CompositionBuilder builder) {
		
		this.compositionID = builder.getID();
		this.compositionName = builder.getName();
		this.composer = builder.getComposer();
		this.soloist = builder.getSoloist();
		this.movement = builder.getMovement();
	}

	/**
	 * This method returns the current composition.
	 * 
	 * @param 	builder		Composition Builder
	 * @return	Composition
	 */
	public static Composition getComposition(CompositionBuilder builder) {
		return new Composition(builder);
	}

	/**
	 * This uses the Identification class and holds the unique identifier of the composition.
	 */
	private Identification compositionID;

	/**
	 * This uses the Name class and holds the name of the composition.
	 */
	private Name compositionName;
	
	/**
	 * This holds the name of the Composer for this composition.
	 */
	private Composer composer;
	
	/**
	 * This holds a reference to the soloists of this composition.
	 * There may be 0 or more soloists.
	 */
	private Vector<Soloist> soloist;

	/**
	 * This holds a reference to the movements of this composition. 
	 * There may be more than one movement.
	 */
	private Vector<Movement> movement;


}	/*	End of CLASS:	Composition.java			*/
