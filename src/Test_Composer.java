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
import symphony.domain.Composer;
import symphony.domain.Composition;
import symphony.domain.CompositionBuilder;
import symphony.domain.Identification;
import symphony.domain.Name;
import symphony.domain.Phone;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.util.Vector;

import org.junit.Before;
/**
 * Test class for Composer.
 * 
 * @author    Victoria Sawyer
 * @version   1.0.0 2016-11-25
 */
public class Test_Composer extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Composer(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Composer
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Composer.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Composer End");
	}
	
	/**
	 * Set up the test class. 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Composer Begin");		
		composer = new Composer(null, null, null, null);
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testComposerConstructor(){
		System.out.println("\t\t Test_Address.testComposerConstructor");
		
		Composer test = new Composer(null, null, null, null);
		
		assertTrue("\tTesting Comoposer default constructor", test instanceof Composer);
		assertNotNull("\tTesting Composer default constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Test accessor getCompositions
	 *************************************************************/
	@Test
	public void testGetCompositions(){
		System.out.println("\t\t Test_Composer.testGetCompositions");
		
		CompositionBuilder builder = new CompositionBuilder(new Identification("test"), new Name());
		Composition composition = Composition.getComposition(builder);
		Vector<Composition> vector = new Vector<>();
		vector.add(composition);
		composer.setCompositions(vector);
		
		assertTrue("\tTesting Composer getCompositions method", composer.getCompositions().contains(composition));	
	}

	/**
	 * Test accessor getName
	 *************************************************************/
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_Composer.testGetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		composer.setName(name);
		
		assertTrue("\tTesting Composer getName method", composer.getName().equals(name));	
	}

	/**
	 * Test accessor getAddress
	 *************************************************************/
	@Test
	public void testGetAddress(){
		System.out.println("\t\t Test_Composer.testGetAddress");
		
		String location = "1385 Woodroffe Ave, Nepean, ON K2G 1V8";
		Address address = new Address();
		address.setAddress(location);
		composer.setAddress(address);
		
		assertTrue("\tTesting Composer getAddress method", composer.getAddress().equals(address));	
	}

	/**
	 * Test accessor getPhone
	 *************************************************************/
	@Test
	public void testGetPhone(){
		System.out.println("\t\t Test_Composer.testGetPhone");
		
		Phone phone = new Phone("555-111");
		composer.setPhone(phone);
		
		assertTrue("\tTesting Composer getPhone method", composer.getPhone().equals(phone));	
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Test modifier setCompositions
	 *************************************************************/
	@Test
	public void testSetCompositions(){
		System.out.println("\t\t Test_Composer.testSetCompositions");
		
		CompositionBuilder builder = new CompositionBuilder(new Identification("test"), new Name());
		Composition composition = Composition.getComposition(builder);
		Vector<Composition> vector = new Vector<>();
		vector.add(composition);
		composer.setCompositions(vector);
		
		assertTrue("\tTesting Address setAddress method", composer.getCompositions().contains(composition));		
	}

	/**
	 * Test modifier setName
	 *************************************************************/
	@Test
	public void testSetName(){
		System.out.println("\t\t Test_Composer.testSetName");
		
		String nameString = "Test Name";
		Name name = new Name();
		name.setName(nameString);
		composer.setName(name);
		
		assertTrue("\tTesting Composer setName method", composer.getName().equals(name));	
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
		composer.setAddress(address);
		
		assertTrue("\tTesting Composer setAddress method", composer.getAddress().equals(address));		
	}

	/**
	 * Test modifier setPhone
	 *************************************************************/
	@Test
	public void testSetPhone(){
		System.out.println("\t\t Test_Composer.testSetPhone");
		
		Phone phone = new Phone("555-111");
		composer.setPhone(phone);
		
		assertTrue("\tTesting Composer setPhone method", composer.getPhone().equals(phone));	
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	/* HELPER METHODS	--------------------------------------------------	*/

	/* ATTRIBUTES	-----------------------------------------------------	*/											

	Composer composer;

}	/*	End of CLASS:	Test_Composer.java			*/
