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
import symphony.domain.Debit;
import symphony.domain.DebitCard;
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
public class Test_Debit extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Debit(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Debit
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Debit.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Debit End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Debit Begin");	
		
		type = new Debit();
		type.setID(new Identification("test"));
		Date date = new DateBuilder(new Year(2016),new Month(11), new Day(23)).build();
		type.setDate(date);
		
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	


	/* ACCESSORS	-----------------------------------------------------	*/
	
	@Test
	public void testGetID(){
		System.out.println("\t\t Test_Debit.testGetID");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Debit getID method", type.getID() instanceof Identification );
		assertTrue("\tTesting Debit getID method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testGetDate(){
		System.out.println("\t\t Test_Debit.testGetDate");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Debit getDate method", type.getID() instanceof Identification );
		assertTrue("\tTesting Debit getDate method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testGetCard(){
		System.out.println("\t\t Test_Debit.testGetCard");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Debit getCard method", type.getID() instanceof Identification );
		assertTrue("\tTesting Debit getCard method", type.getID().getID().equals("test") );		
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	@Test
	public void testSetID(){
		System.out.println("\t\t Test_Debit.testSetID");
		type.setID(new Identification("test"));
		
		assertTrue("\tTesting Debit setID method", type.getID() instanceof Identification );
		assertTrue("\tTesting Debit setID method", type.getID().getID().equals("test") );		
	}
	
	@Test
	public void testSetDate(){
		System.out.println("\t\t Test_Debit.testSetDate");
		
		Date date = new DateBuilder(new Year(2016),new Month(11), new Day(23)).build();
		type.setDate(date);
		
		assertTrue("\tTesting Debit setDate method", type.getDate() instanceof Date );
		assertTrue("\tTesting Debit setDate method", date.toString().equals("20161123") );		
	}

	@Test
	public void testSetCard(){
		System.out.println("\t\t Test_Debit.testSetCard");		
		
		type.setCard(new DebitCard(0101011011110101l));   
		
		assertTrue("\tTesting Debit setCard method", type.getCard() instanceof DebitCard );		
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Debit type;
	
}	/*	End of CLASS:	Test_Debit.java			*/
