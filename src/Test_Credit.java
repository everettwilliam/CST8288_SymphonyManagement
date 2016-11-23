/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: 
 * Student #: 
 * Network login name: 
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
import symphony.domain.Credit;
import symphony.domain.CreditCard;
import symphony.domain.Date;
import symphony.domain.DateBuilder;
import symphony.domain.Day;
import symphony.domain.Identification;
import symphony.domain.Month;
import symphony.domain.Year;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class Test_Credit extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Credit(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Credit
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Credit.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Credit End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Credit Begin");	
		
		type = new Credit();
		type.setID(new Identification("test"));
		Date date = new DateBuilder(new Year(2016),new Month(11), new Day(23)).build();
		type.setDate(date);
		
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	


	/* ACCESSORS	-----------------------------------------------------	*/
	
	@Test
	public void testGetID(){
		System.out.println("\t\t Test_Credit.testGetID");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Credit getID method", type.getID() instanceof Identification );
		assertTrue("\tTesting Credit getID method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testGetDate(){
		System.out.println("\t\t Test_Credit.testGetDate");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Credit getDate method", type.getID() instanceof Identification );
		assertTrue("\tTesting Credit getDate method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testGetCard(){
		System.out.println("\t\t Test_Credit.testGetCard");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Credit getCard method", type.getID() instanceof Identification );
		assertTrue("\tTesting Credit getCard method", type.getID().getID().equals("test") );		
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	@Test
	public void testSetID(){
		System.out.println("\t\t Test_Credit.testSetID");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Credit setID method", type.getID() instanceof Identification );
		assertTrue("\tTesting Credit setID method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testSetDate(){
		System.out.println("\t\t Test_Credit.testSetDate");
		
		Date date = new DateBuilder(new Year(2016),new Month(11), new Day(23)).build();
		type.setDate(date);
		
		assertTrue("\tTesting Credit setDate method", type.getDate() instanceof Date );
		assertTrue("\tTesting Credit setDate method", date.toString().equals("20161123") );		
	}

	@Test
	public void testSetCard(){
		System.out.println("\t\t Test_Credit.testSetCard");		
		
		type.setCard(new CreditCard(0000101001011111l));   
		
		assertTrue("\tTesting Credit setCard method", type.getCard() instanceof CreditCard );		
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Credit type;

}	/*	End of CLASS:	Test_Credit.java			*/
