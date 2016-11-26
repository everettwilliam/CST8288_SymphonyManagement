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
import symphony.domain.Identification;
import org.junit.Test;
import org.junit.Before;
/**
 * Test class for Identification
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.23
 */
public class Test_Identification extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Identification(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Identification
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Identification.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Identification End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Identification Begin");	
		identification = new Identification("test");
	}
	
/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testIDConstructor(){
		System.out.println("\t\t Test_ID.testIdentificationConstructor");
		
		Identification test = new Identification("test");
		
		assertTrue("\tTesting ID default constructor", test instanceof Identification);
		assertNotNull("\tTesting ID default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetID(){
		System.out.println("\t\t Test_ID.testGetID");
		
		String id = "040812130";
		identification.setID(id);
		
		assertTrue("\tTesting ID getID method", identification.getID().equals(id));
		assertFalse("\tTesting ID getID method", identification.getID().equals("test"));
		
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetID(){
		System.out.println("\t\t Test_ID.testSetID");
		
		String id = "040812130";
		identification.setID(id);
		
		assertTrue("\tTesting ID setID method", identification.getID().equals(id));		
	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Identification identification;


}	/*	End of CLASS:	Test_Identification.java			*/
