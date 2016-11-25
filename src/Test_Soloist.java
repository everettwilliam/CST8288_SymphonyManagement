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
import symphony.domain.Address;
import symphony.domain.Name;
import symphony.domain.Phone;
import symphony.domain.Soloist;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.24
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
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Soloist Begin");	
		
		violinist = new Soloist(new Name(), new Address(), new Phone("555-5555"), "Violinist");
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	@Test
	public void testSoloistConstructor(){
		System.out.println("\t\t Test_Time.testSoloistConstructor");
		
		assertNotNull("\tTesting Time default constructor", violinist);
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	@Test
	public void testGetExpertise(){
		System.out.println("\t\t Test_Time.testGetExpertise");
		
		assertNotNull("\tTesting Time default constructor", violinist.getExpertise());
	}	

	/* MODIFIERS	-----------------------------------------------------	*/
	
	@Test
	public void testSetExpertise(){
		System.out.println("\t\t Test_Time.testSetExpertise");
		
		violinist.setExpertise("Celloist");
		
		assertFalse("\tTesting Time default constructor", violinist.getExpertise().equals("Violinist"));
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											
	
	Soloist violinist;


}	/*	End of CLASS:	Test_Soloist.java			*/
