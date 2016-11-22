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
import symphony.domain.Address;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Address extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Address(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Address
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Address.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Address End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Address Begin");		
		address = new Address();
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testAddressConstructor(){
		System.out.println("\t\t Test_Address.testAddressConstructor");
		
		Address test = new Address();
		
		assertTrue("\tTesting Address default constructor", test instanceof Address);
		assertNotNull("\tTesting Address default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetAddress(){
		System.out.println("\t\t Test_Address.testGetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		address.setAddress(location);
		
		assertTrue("\tTesting Address getAddress method", address.getAddress().equals(location));
		
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetAddress(){
		System.out.println("\t\t Test_Address.testSetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		address.setAddress(location);
		
		assertTrue("\tTesting Address setAddress method", address.getAddress().equals(location));		
	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	



	/* HELPER METHODS	--------------------------------------------------	*/

	/**
	 * Test toString
	 *************************************************************/
	@Test
	public void testToString(){
		System.out.println("\t\t Test_Address.testToString");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		address.setAddress(location);
		
		assertTrue("\tTesting Address default constructor", address.toString().equals( "The address is: 1385 Woodroffe Ave, Nepean, ON K2G 1V8"));		
	
	}


	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Address address;

}	/*	End of CLASS:	Test_Address.java			*/
