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
import symphony.domain.Address;
import symphony.domain.Concert;
import symphony.domain.ConcertBuilder;
import symphony.domain.Conductor;
import symphony.domain.Date;
import symphony.domain.Identification;
import symphony.domain.Month;
import symphony.domain.Performance;
import symphony.domain.Venue;
import symphony.domain.Year;
import symphony.domain.DateBuilder;
import symphony.domain.Day;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class Test_ConcertBuilder extends TestCase {
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_ConcertBuilder(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_ConcertBuilder
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_ConcertBuilder.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_ConcertBuilder End");
	}
	
	/**
	 * Set up ConcertBuider.
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_ConcertBuilder Begin");

		Identification id = new Identification("test");
		Date date = new DateBuilder(new Year(2016), new Month(11), new Day(24)).build();
		Venue venue = new Venue(new Address("testVenue"), 10);
		builder = new ConcertBuilder(id, date, venue);
		
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor.
	 *************************************************************/
	@Test
	public void testConcertBuilderConstructor(){
		System.out.println("\t\t Test_ConcertBuilder.testConcertBuilderConstructor");			
		
		assertTrue("\tTesting ConcertBuilder default constructor", builder instanceof ConcertBuilder);
		assertNotNull("\tTesting ConcertBuilder default constructor", builder);
	}
	
	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test getID
	 *************************************************************/
	@Test
	public void testGetID(){
		System.out.println("\t\t Test_ConcertBuilder.testGetID");			
		
		assertTrue("\tTesting Composition getComposition method", builder.getID() instanceof Identification );
	}
	
	/**
	 * Test getConductor
	 *************************************************************/
	@Test
	public void testGetConductor(){
		System.out.println("\t\t Test_ConcertBuilder.testGetConductor");			

		builder.conductor(new Conductor(null, null, null));
		
		assertTrue("\tTesting Composition getComposition method", builder.getConductor() instanceof Conductor );
	}
	
	/**
	 * Test getPerformances
	 *************************************************************/
	@Test
	public void testGetPerformances(){
		System.out.println("\t\t Test_ConcertBuilder.testGetConductor");			
		
		builder.performance(new Performance());
		
		assertTrue("\tTesting Composition getComposition method", builder.getPerformances() instanceof Performance );
	}
	
	/**
	 * Test getDate
	 *************************************************************/
	@Test
	public void testGetDate(){
		System.out.println("\t\t Test_ConcertBuilder.testGetConductor");			

		assertTrue("\tTesting Composition getComposition method", builder.getDate() instanceof Date );
	}
	
	/**
	 * Test getVenue
	 *************************************************************/
	@Test
	public void testGetVenue(){
		System.out.println("\t\t Test_ConcertBuilder.testGetConductor");			

		assertTrue("\tTesting Composition getComposition method", builder.getVenue() instanceof Venue );
	}
	/* MODIFIERS	-----------------------------------------------------	*/
	
	/* NORMAL BEHAVIOR --------------------------------------------------	*/

	/**
	 * Test conductor method
	 *************************************************************/
	@Test
	public void testConductor(){
		System.out.println("\t\t Test_ConcertBuilder.testConductor");
		
		Conductor conductor = new Conductor(null, null, null);
		
		assertTrue("\tTesting ConcertBuilder testComposer method", builder.conductor(conductor) instanceof ConcertBuilder);	
	}
	
	/**
	 * Test performance method
	 *************************************************************/
	@Test
	public void testPerformance(){
		System.out.println("\t\t Test_ConcertBuilder.testPerformance");
		
		Performance performance = new Performance();
		
		assertTrue("\tTesting ConcertBuilder testPerformance method", builder.performance(performance) instanceof ConcertBuilder);	
	}
	
	/**
	 * Test build method
	 *************************************************************/
	@Test
	public void testBuild(){
		System.out.println("\t\t Test_ConcertBuilder.testBuild");		
		
		assertTrue("\tTesting ConcertBuilder getCompositionBuilder method", builder.build() instanceof Concert);
	}

	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	ConcertBuilder builder;

}	/*	End of CLASS:	Test_ConcertBuilder.java			*/
