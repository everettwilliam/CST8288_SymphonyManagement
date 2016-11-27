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
package symphony.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.Date;
import symphony.domain.DateBuilder;
import symphony.domain.Day;
import symphony.domain.Month;
import symphony.domain.Season;
import symphony.domain.Year;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.24
 */
public class Test_Season extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Season(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Season
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Season.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Season End");
	}
	
	/**
	 * Set up the test class.
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Season Begin");	
		
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test getOpeningDate method.
	 */
	@Test
	public void testGetOpeningDate(){
		System.out.println("\t\t Test_Season.testGetPerformanceDate");		

		assertTrue("\tTesting Season getOpeningDate method", season.getOpeningDate().toString().equals("20161124"));
	}
	
	/**
	 * Test getSeasonLength method.
	 */
	@Test
	public void testGetSeasonLength(){
		System.out.println("\t\t Test_Season.testGetSeasonLength");		

		assertTrue("\tTesting Season getSeasonLength method", season.getSeasonLength() == 1);
	}
	

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test setLength method.
	 */
	@Test
	public void testSetLength(){
		System.out.println("\t\t Test_Season.testSetLength");		
		
		season.setLength(2);
		assertFalse("\tTesting Season setSeasonLength method",  season.getSeasonLength() == 2);
	}


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	
	/**
	 * Test toString method.
	 */
	@Test
	public void testToString(){
		System.out.println("\t\t Test_Season.testToString");	

		assertFalse("\tTesting Season setSeasonLength method",  season.toString().equals(""));
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	Season season;


}	/*	End of CLASS:	Test_Performance.java			*/
