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
 * This class uses ConcertBuilder to create a Concert.
 * Concert is used by Season.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */
public class Concert {

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * This constructor sets the Concert variables that are mandatory in building a concert.
	 * @param id
	 * @param venue
	 */
	private Concert(Identification id, Date date, Venue venue) {
		this.concertNumber = id;
		this.venue = venue;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/**
	 * This method returns and instance of a concert Concert. 
	 * @param	builder		ConcertBuilder
	 * @return	Concert
	 */
	public static Concert getConcert(ConcertBuilder builder) {
		return new Concert(builder.getID(), builder.getDate(), builder.getVenue());
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This uses the Conductor class and holds the information about the conductor.
	 */
	private Conductor conductor;

	/**
	 * This uses the Identification class and holds the unique identification of the concert.
	 */
	private Identification concertNumber;

	/**
	 * This uses the Performance class and holds an ArrayList of compositions to be performed.
	 */
	private Performance performance;

	/**
	 * This uses the Date class and holds the date of the concert.
	 */
	private Date date;

	/**
	 * This uses the Venue class and holds the venue location of the concert.
	 */
	private Venue venue;
	

}	/*	End of CLASS:	Concert.java			*/
