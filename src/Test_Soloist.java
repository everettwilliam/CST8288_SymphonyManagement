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
import symphony.domain.Name;
import symphony.domain.Phone;
import symphony.domain.Soloist;
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
public class Test_Soloist extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Soloist(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Soloist
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Soloist.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Soloist End");
	}
	
	/**
	 * Set up the test class. 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Soloist Begin");		
		soloist = new Soloist(null, null, null, null);
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testSoloistConstructor(){
		System.out.println("\t\t Test_Address.testSoloistConstructor");
		
		Soloist test = new Soloist(null, null, null, null);
		
		assertTrue("\tTesting Soloist default constructor", test instanceof Soloist);
		assertNotNull("\tTesting Soloist default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor getExpertise
	 *************************************************************/
	@Test
	public void testGetExpertise(){
		System.out.println("\t\t Test_Soloist.testGetExpertise");
		
		String expertise = "test";
		soloist.setExpertise(expertise);
		
		assertTrue("\tTesting Soloist getCompositions method", soloist.getExpertise().equals(expertise));	
	}

	/**
	 * Test accessor getName
	 *************************************************************/
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_Soloist.testGetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		soloist.setName(name);
		
		assertTrue("\tTesting Soloist getName method", soloist.getName().equals(name));	
	}

	/**
	 * Test accessor getAddress
	 *************************************************************/
	@Test
	public void testGetAddress(){
		System.out.println("\t\t Test_Soloist.testGetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		Address address = new Address();
		address.setAddress(location);
		soloist.setAddress(address);
		
		assertTrue("\tTesting Soloist getAddress method", soloist.getAddress().equals(address));	
	}

	/**
	 * Test accessor getPhone
	 *************************************************************/
	@Test
	public void testGetPhone(){
		System.out.println("\t\t Test_Soloist.testGetPhone");
		
		Phone phone = new Phone("555-111");
		soloist.setPhone(phone);
		
		assertTrue("\tTesting Soloist getPhone method", soloist.getPhone().equals(phone));	
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier setCompositions
	 *************************************************************/
	@Test
	public void testSetCompositions(){
		System.out.println("\t\t Test_Soloist.testSetCompositions");
		
		String expertise = "test";
		soloist.setExpertise(expertise);
		
		assertTrue("\tTesting Address setAddress method", soloist.getExpertise().equals(expertise));		
	}

	/**
	 * Test modifier setName
	 *************************************************************/
	@Test
	public void testSetName(){
		System.out.println("\t\t Test_Soloist.testSetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		soloist.setName(name);
		
		assertTrue("\tTesting Soloist setName method", soloist.getName().equals(name));	
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
		soloist.setAddress(address);
		
		assertTrue("\tTesting Soloist setAddress method", soloist.getAddress().equals(address));		
	}

	/**
	 * Test modifier setPhone
	 *************************************************************/
	@Test
	public void testSetPhone(){
		System.out.println("\t\t Test_Soloist.testSetPhone");
		
		Phone phone = new Phone("555-111");
		soloist.setPhone(phone);
		
		assertTrue("\tTesting Soloist setPhone method", soloist.getPhone().equals(phone));	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Soloist soloist;

}	/*	End of CLASS:	Test_Soloist.java			*/
