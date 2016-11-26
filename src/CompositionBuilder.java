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

/**
 * CompositionBuilder is used to build Composition.
 * It makes use of Name, Identification, Soloist and Movement. 
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-21
 */
public class CompositionBuilder {
	
	/**
	 * The default constructor of CompositionBuilder.
	 * It sets the mandatory Identification and Name fields.
	 * 
	 * @param 	id		Identification
	 * @param 	name	Name
	 */
	public CompositionBuilder(Identification id, Name name) {
		this.compositionID = id;
		this.compositionName = name;
	}

	/**
	 * This method gets the Identification of the composition.
	 * 
	 * @return	Identification
	 */
	public Identification getID() {
		return this.compositionID;
	}

	/**
	 * This method gets the Name of the composition.
	 * 
	 * @return	Name
	 */
	public Name getName() {
		return this.compositionName;
	}
	
	/**
	 * This method gets the composer of the composition.
	 * 
	 * @return	String	composer
	 */
	public Composer getComposer() {
		return this.composer;
	}
	
	/**
	 * This method gets the soloists of the composition.
	 * 
	 * @return	Vector&lt;Soloist&gt; a vector with one or many soloists
	 */
	public Vector<Soloist> getSoloist() {
		return this.soloist;
	}
	
	/**
	 * This method gets the movements of the composition.
	 * 
	 * @return	Vector&lt;Movement&gt; a vector of one or many movements
	 */
	public Vector<Movement> getMovement() {
		return this.movement;
	}

	/**
	 *This method builds an instance of Composition using this CompositionBuilder.
	 * 
	 * @return	CompositionBuilder
	 */
	public Composition build() {
		return Composition.getComposition(this);
	}
	
	/**
	 * This method sets the composer of the Composition.
	 * 
	 * @param 	composer	String
	 * @return	CompositionBuilder
	 */
	public CompositionBuilder composer(Composer composer) {
		this.composer = composer;
		return this;
	}
	
	/**
	 * This method sets the soloists of the Composition.
	 * There can be 0 or more solosits.
	 * 
	 * @param 	soloist		Vector&lt;Soloist&gt; a vector of one or many soloists
	 * @return	CompositionBuilder the builder of the Composition class
	 */
	public CompositionBuilder soloist(Vector<Soloist> soloist) {
		this.soloist = soloist;
		return this;
	}
	
	/**
	 * This method sets the movements of the Composition.
	 * There can be 1 or more movements.
	 * 
	 * @param 	movement	Vector&lt;Movement&gt; a vector of one or many movements
	 * @return	CompositionBuilder the builder of the Composition class
	 */
	public CompositionBuilder movement(Vector<Movement> movement) {
		this.movement = movement;
		return this;
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

}	/*	End of CLASS:	CompositionBuilder.java			*/
