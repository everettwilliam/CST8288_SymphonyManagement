/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: EVERETT HOLDEN
 * Student #: 040812130
 * Network login name: hold0052
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
import symphony.domain.Composition;
import symphony.domain.CompositionBuilder;
import symphony.domain.Date;
import symphony.domain.DateBuilder;
import symphony.domain.Day;
import symphony.domain.Identification;
import symphony.domain.Month;
import symphony.domain.Name;
import symphony.domain.Performance;
import symphony.domain.Year;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.24
 */
public class Test_Performance extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Performance(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Performance
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Performance.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Performance End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Performance Begin");	
		
		Composition composition = new CompositionBuilder(new Identification("test"), new Name()).build();
		Date date = new DateBuilder(new Year(2016), new Month(11), new Day(24)).build();
		performance = new Performance();
		performance.setPerformanceDate(date);
		performance.add(composition);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	@Test
	public void testPerformanceConstructor(){
		System.out.println("\t\t Test_Performance.testPerformanceConstructor");		

		assertNotNull("\tTesting Performance constructor", performance);
		assertTrue("\tTesting Performance constructor", performance instanceof Performance);
	}	

	/* ACCESSORS	-----------------------------------------------------	*/
	
	@Test
	public void testGetPerformanceDate(){
		System.out.println("\t\t Test_Performance.testGetPerformanceDate");		

		assertTrue("\tTesting Performance  method", performance.getPerfomanceDate().toString().equals("20161124"));
	}
	

	/* MODIFIERS	-----------------------------------------------------	*/
	
	@Test
	public void testSetPerformanceDate(){
		System.out.println("\t\t Test_Performance.testSetPerformanceDate");		
		
		performance.setPerformanceDate(new DateBuilder(new Year(2016), new Month(12), new Day(31)).build());
		assertFalse("\tTesting Performance  method",  performance.getPerfomanceDate().toString().equals("20161124"));
	}


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	Performance performance;


}	/*	End of CLASS:	Test_Performance.java			*/
