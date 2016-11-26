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

import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.domain.Year;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Year extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Year(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Year
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Year.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Year End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Year Begin");		
		year = new Year(2016);
	}

/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testYearConstructor(){
		System.out.println("\t\t Test_Year.testYearConstructor");
		
		Year test = new Year(2012);
		
		assertTrue("\tTesting Year default constructor", test instanceof Year);
		assertNotNull("\tTesting Year default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetYear(){
		System.out.println("\t\t Test_Year.testGetYear");				
				
		assertTrue("\tTesting Year getYear method", year.getYear() == 2016);
		
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetYear(){
		System.out.println("\t\t Test_Year.testSetYear");		
	
		year.setYear(2005);		
		
		assertFalse("\tTesting Year setYear method", year.getYear() == 2016);		
	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Year year;	

}	/*	End of CLASS:	Test_Year.java			*/
