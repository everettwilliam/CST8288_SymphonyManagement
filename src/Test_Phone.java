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
import symphony.domain.Phone;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Phone extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Phone(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Phone
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Phone.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Phone End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Phone Begin");
		phone = new Phone();
	}
	
/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testPhoneConstructor(){
		System.out.println("\t\t Test_Phone.testPhoneConstructor");
		
		phone = new Phone();
		
		assertTrue("\tTesting Phone default constructor", phone instanceof Phone);
		assertNotNull("\tTesting Phone default constructor", phone);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetPhone(){
		System.out.println("\t\t Test_Phone.testGetPhone");		
		
		phone.setPhone("555-5555");		
		assertTrue("\tTesting Phone getPhone method", phone.getPhone().equals("555-5555"));
		
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetPhone(){
		System.out.println("\t\t Test_Phone.testSetPhone");		
	
		phone.setPhone("555-5555");
		Phone test = new Phone();
		test.setPhone("555-5555");
		
		assertTrue("\tTesting Phone setPhone method", phone.getPhone() == test.getPhone());		
	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Phone phone;
	
}	/*	End of CLASS:	Test_Phone.java			*/
