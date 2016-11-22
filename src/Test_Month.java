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
import symphony.domain.Month;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Month extends TestCase{

	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Month(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Month
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Month.class);
	}

	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Month End");
	}

	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Month Begin");		

		month = new Month(12);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testMonthConstructor(){
		System.out.println("\t\t Test_Month.testMonthConstructor");

		Month test = new Month(12);

		assertTrue("\tTesting Month default constructor", test instanceof Month);
		assertNotNull("\tTesting Month default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetMonth(){
		System.out.println("\t\t Test_Month.testGetMonth");		

		month.setMonth(12);		
		assertTrue("\tTesting Month getMonth method", month.getMonth() == 12);

	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetMonth(){
		System.out.println("\t\t Test_Month.testSetMonth");		

		month.setMonth(5);
		Month test = new Month(5);

		assertTrue("\tTesting Month setMonth method", month.getMonth() == test.getMonth());		

	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Month month;										



}	/*	End of CLASS:	Test_Month.java			*/
