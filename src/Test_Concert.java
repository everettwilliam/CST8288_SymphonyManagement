/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: 
 * Student #: 
 * Network login name: 
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class Test_Concert extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Concert(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Concert
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Concert.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Concert End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Concert Begin");	
		
		Identification id = new Identification("test");
		Date date = new DateBuilder(new Year(2016), new Month(11), new Day(24)).build();
		Venue venue = new Venue(new Address("testVenue"), 10);
		builder = new ConcertBuilder(id, date, venue);	
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test getConcert method
	 *************************************************************/
	@Test
	public void testGetConcert(){
		System.out.println("\t\t Test_Concert.testGetConcert");			
				
		assertTrue("\tTesting Composition getComposition method", Concert.getConcert(builder) instanceof Concert );
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	ConcertBuilder builder;

}	/*	End of CLASS:	Test_Concert.java			*/
