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
import symphony.domain.Day;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.21
 */
public class Test_Day extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Day(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Day
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Day.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Day End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Day Begin");		
		day = new Day(21);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testDayConstructor(){
		System.out.println("\t\t Test_Day.testDayConstructor");

		Day test = new Day(12);

		assertTrue("\tTesting Day default constructor", test instanceof Day);
		assertNotNull("\tTesting Day default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetDay(){
		System.out.println("\t\t Test_Day.testGetDay");		

		assertTrue("\tTesting Day getDay method", day.getDay() == 21);

	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetDay(){
		System.out.println("\t\t Test_Day.testSetDay");		

		day.setDay(5);
		assertFalse("\tTesting Day setDay method", day.getDay() == 21);		

	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Day day;


}	/*	End of CLASS:	Test_Day.java			*/
