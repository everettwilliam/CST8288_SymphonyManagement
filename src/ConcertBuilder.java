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
package symphony.domain;
/**
 * ConcertBuilder is used to build Concert.
 * It makes use of Conductor, Identification,Performance, Date, and Venue classes.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-22
 */
public class ConcertBuilder {

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * The default constructor of ConcertBuilder.
	 * Sets the mandatory fields Identification, Date, and Venue.
	 * 
	 * @param	id		Identification
	 * @param	date	Date
	 * @param	venue	Venue
	 */
	public ConcertBuilder(Identification id, Date date, Venue venue) {
		this.concertNumber = id;
		this.date = date;
		this.venue = venue;
	}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * This method gets the Identification of the Concert.
	 * 
	 * @return	Idetification
	 */
	public Identification getID() {
		return this.concertNumber;
	}

	/**
	 * This method gets the Conductor of the Concert.
	 * 
	 * @return	Conductor
	 */
	public Conductor getConductor() {
		return this.conductor;
	}

	/**
	 * This method gets the Performance of the Concert.
	 * Performance is an ArrayList of Composition. 
	 * 
	 * @return	Performance
	 */
	public Performance getPerformances() {
		return this.performances;
	}

	/**
	 * This method gets the Date of the Concert.
	 * 
	 * @return	Date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * This method gets the Venue of the Concert.
	 * 
	 * @return	Venue
	 */
	public Venue getVenue() {
		return this.venue;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/

	/**
	 * This method builds an instance of Concert using this ConcertBuilder.
	 * 
	 * @return	Concert
	 */
	public Concert build() {
		return Concert.getConcert(this);
	}
	
	/**
	 * This method sets the Conductor of the Concert.
	 * 
	 * @param 	conductor		Conductor
	 * @return	ConcertBuilder
	 */
	public ConcertBuilder conductor(Conductor conductor) {
		this.conductor = conductor;
		return this;
	}
	
	/**
	 * This method sets the Performance of the concert.
	 * 
	 * @param 	performances	Performance
	 * @return	ConcertBuilder
	 */
	public ConcertBuilder performance(Performance performances) {
		this.performances = performances;
		return this;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	/**
	 * This holds a reference to the conductor of the concert.
	 */
	private Conductor conductor;

	/**
	 * This holds the unique Identification of the concert.
	 */
	private Identification concertNumber;

	/**
	 * This holds a reference to the performance which is an ArrayList of Compositions to be performed.
	 */
	private Performance performances;

	/**
	 * This holds the date on which the Concert will be performed.
	 */
	private Date date;

	/**
	 * This holds the Venue in which the Concert will be performed.
	 */
	private Venue venue;


}	/*	End of CLASS:	ConcertBuilder.java			*/
