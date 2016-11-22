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
import symphony.domain.Name;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Name extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Name(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Name
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Name.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Name End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Name Begin");	
		name = new Name();
		testName = "Tejasvi Jani";
	}
	
/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testNameConstructor(){
		System.out.println("\t\t Test_Name.testNameConstructor");
		
		Name test = new Name();
		
		assertTrue("\tTesting Name default constructor", test instanceof Name);
		assertNotNull("\tTesting Name default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_Name.testGetName");		
		
		name.setName(testName);		
		assertTrue("\tTesting Name getName method", name.getName().equals("Tejasvi Jani"));		
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetName(){
		System.out.println("\t\t Test_Name.testSetName");		
	
		name.setName(testName);
		Name test = new Name();
		test.setName("Tejasvi Jani");
		
		assertTrue("\tTesting Name setName method", name.getName() == test.getName());	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	
	/**
	 * Test toString
	 *************************************************************/
	@Test
	public void testToString(){
		System.out.println("\t\t Test_Name.testToString");		
	
		name.setName(testName);		
		
		assertTrue("\tTesting Name setName method", name.toString().equals("Name:Tejasvi Jani"));	
	}
	
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Name name;
	private String testName;

}	/*	End of CLASS:	Test_Name.java			*/
