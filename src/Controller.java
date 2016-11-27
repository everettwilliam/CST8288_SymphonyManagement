/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: VICTORIA SAWYER & EVERETT HOLDEN
 * Student #: 
 * Network login name: 
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
 * Controller builds objects from data in the symphony management database
 * and builds them to add to a concert and add concerts to the Season.
 * @author    VICTORIA SAWYER, EVERETT HOLDEN
 * @version   1.0.0 2016.11.26
 */
public class Controller {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	/* ACCESSORS	-----------------------------------------------------	*/
	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/**
	 * Calls Seasons addConcert static method
	 * @param concert a concert object
	 * @return boolean returns true if sucessful
	 */
	public static boolean addConcert(Concert concert){
		return Season.season().add(concert);
	}

	/* HELPER METHODS	--------------------------------------------------	*/

	public static void main(String[] args){
		
		//create a movement
		Movement movement = new MovementBuilder().movementName(new Name("squirrels dance")).movementID(new Identification("_test_id")).build();
		//add movement to a list
		Vector<Movement> list = new Vector<Movement>();
		list.add(movement);
		//create a compostion and add add movement to it
		Composition composition = new CompositionBuilder(new Identification("_compositon_id"),new Name("Everett's 5th")).movement(list).build();
		//create performacnce
		Performance<Composition> performance = new Performance<>();
		//create date for the performance
		Date date = new DateBuilder(new Year(2016), new Month(11), new Day(30)).build();
		//add data of performance
		performance.setPerformanceDate(date);
		//add composition to performance
		performance.add(composition);
		//hire a conductor
		Conductor conductor = new Conductor(new Name("Con Ductor"), new Address("50 Rideau Street"), new Phone("555-5555"));
		//select a venue
		Venue queenVictoriaHall = new Venue(new Address("algonquin college"),200);		
		//build the concert
		concert = new ConcertBuilder(new Identification("_concert_id"), date, queenVictoriaHall).conductor(conductor).performance(performance).build();
		addConcert(concert);//add concert to season
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											
	/** an instance of a concert */
	private static Concert concert;


}	/*	End of CLASS:	Controller.java			*/
