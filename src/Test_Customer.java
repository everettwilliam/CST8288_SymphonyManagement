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


import symphony.domain.Address;
import symphony.domain.Customer;
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
public class Test_Customer extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Customer(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Customer
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Customer.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Customer End");
	}
	
	/**
	 * Set up the test class. 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Customer Begin");		
		customer = new Customer(null, null, null);
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testCustomerConstructor(){
		System.out.println("\t\t Test_Customer.testCustomerConstructor");
		
		Customer test = new Customer(null, null, null);
		
		assertTrue("\tTesting Customer default constructor", test instanceof Customer);
		assertNotNull("\tTesting Customer default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor getName
	 *************************************************************/
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_Customer.testGetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		customer.setName(name);
		
		assertTrue("\tTesting Customer getName method", customer.getName().equals(name));	
	}

	/**
	 * Test accessor getAddress
	 *************************************************************/
	@Test
	public void testGetAddress(){
		System.out.println("\t\t Test_Customer.testGetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		Address address = new Address();
		address.setAddress(location);
		customer.setAddress(address);
		
		assertTrue("\tTesting Customer getAddress method", customer.getAddress().equals(address));	
	}

	/**
	 * Test accessor getPhone
	 *************************************************************/
	@Test
	public void testGetPhone(){
		System.out.println("\t\t Test_Customer.testGetPhone");
		
		Phone phone = new Phone("555-111");
		customer.setPhone(phone);
		
		assertTrue("\tTesting Customer getPhone method", customer.getPhone().equals(phone));	
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Test modifier setName
	 *************************************************************/
	@Test
	public void testSetName(){
		System.out.println("\t\t Test_Customer.testSetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		customer.setName(name);
		
		assertTrue("\tTesting Customer setName method", customer.getName().equals(name));	
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
		customer.setAddress(address);
		
		assertTrue("\tTesting Customer setAddress method", customer.getAddress().equals(address));		
	}

	/**
	 * Test modifier setPhone
	 *************************************************************/
	@Test
	public void testSetPhone(){
		System.out.println("\t\t Test_Customer.testSetPhone");
		
		Phone phone = new Phone("555-111");
		customer.setPhone(phone);
		
		assertTrue("\tTesting Customer setPhone method", customer.getPhone().equals(phone));	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Customer customer;

}	/*	End of CLASS:	Test_Composer.java			*/
