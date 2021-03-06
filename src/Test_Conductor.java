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

import symphony.domain.Address;
import symphony.domain.Conductor;
import symphony.domain.Name;
import symphony.domain.Phone;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import org.junit.Before;
/**
 * Test class for Composer.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-25
 */
public class Test_Conductor extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Conductor(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Conductor
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Conductor.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Conductor End");
	}
	
	/**
	 * Set up the test class. 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Conductor Begin");		
		conductor = new Conductor(null, null, null);
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testConductorConstructor(){
		System.out.println("\t\t Test_Conductor.testConductorConstructor");
		
		Conductor test = new Conductor(null, null, null);
		
		assertTrue("\tTesting Conductor default constructor", test instanceof Conductor);
		assertNotNull("\tTesting Conductor default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor getName
	 *************************************************************/
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_Conductor.testGetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		conductor.setName(name);
		
		assertTrue("\tTesting Conductor getName method", conductor.getName().equals(name));	
	}

	/**
	 * Test accessor getAddress
	 *************************************************************/
	@Test
	public void testGetAddress(){
		System.out.println("\t\t Test_Conductor.testGetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		Address address = new Address();
		address.setAddress(location);
		conductor.setAddress(address);
		
		assertTrue("\tTesting Conductor getAddress method", conductor.getAddress().equals(address));	
	}

	/**
	 * Test accessor getPhone
	 *************************************************************/
	@Test
	public void testGetPhone(){
		System.out.println("\t\t Test_Conductor.testGetPhone");
		
		Phone phone = new Phone("555-111");
		conductor.setPhone(phone);
		
		assertTrue("\tTesting Conductor getPhone method", conductor.getPhone().equals(phone));	
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Test modifier setName
	 *************************************************************/
	@Test
	public void testSetName(){
		System.out.println("\t\t Test_Conductor.testSetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		conductor.setName(name);
		
		assertTrue("\tTesting Conductor setName method", conductor.getName().equals(name));	
	}

	/**
	 * Test modifier setAddress
	 *************************************************************/
	@Test
	public void testSetAddress(){
		System.out.println("\t\t Test_Address.testSetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		Address address = new Address();
		address.setAddress(location);
		conductor.setAddress(address);
		
		assertTrue("\tTesting Conductor setAddress method", conductor.getAddress().equals(address));		
	}

	/**
	 * Test modifier setPhone
	 *************************************************************/
	@Test
	public void testSetPhone(){
		System.out.println("\t\t Test_Conductor.testSetPhone");
		
		Phone phone = new Phone("555-111");
		conductor.setPhone(phone);
		
		assertTrue("\tTesting Conductor setPhone method", conductor.getPhone().equals(phone));	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Conductor conductor;

}	/*	End of CLASS:	Test_Conductor.java			*/
