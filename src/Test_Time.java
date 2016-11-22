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
import symphony.domain.Time;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.20
 */
public class Test_Time extends TestCase{

	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Time(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Time
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Time.class);
	}

	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Time End");
	}

	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Time Begin");	
		time = new Time();
		time.setHour(21);
		time.setMinute(45);
		time.setSecond(32);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testTimeConstructor(){
		System.out.println("\t\t Test_Time.testTimeConstructor");		

		assertTrue("\tTesting Time default constructor", time instanceof Time);
		assertNotNull("\tTesting Time default constructor", time);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetHour(){
		System.out.println("\t\t Test_Time.testGetHour");
				
		assertTrue("\tTesting Time getHour method", time.getHour() == 21);

	}

	@Test
	public void testGetMinute(){
		System.out.println("\t\t Test_Time.testGetMinute");	
			
		assertTrue("\tTesting Time getMinute method", time.getMinute() == 45);

	}

	@Test
	public void testGetSecond(){
		System.out.println("\t\t Test_Time.testGetSecond");		
		
		assertTrue("\tTesting Time getSecond method", time.getSecond() == 32);

	}

	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Test modifier
	 *************************************************************/
	@Test
	public void testSetHour(){
		System.out.println("\t\t Test_Time.testSetHour");		

		time.setHour(6);		
		assertFalse("\tTesting Time getHour method", time.getHour() == 21);

	}

	@Test
	public void testSetMinute(){
		System.out.println("\t\t Test_Time.testSetMinute");		

		time.setMinute(30);		
		assertFalse("\tTesting Time getMinute method", time.getMinute() == 45);

	}

	@Test
	public void testSetSecond(){
		System.out.println("\t\t Test_Time.testSetSecond");		

		time.setSecond(10);		
		assertFalse("\tTesting Time getSecond method", time.getSecond() == 32);

	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	
	@Test
	public void testToString(){
		System.out.println("\t\t Test_Time.testToString");		
					
		assertTrue("\tTesting Time getTime method", time.toString().equals("Time(Hour:Minute):21:45"));

	}
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private Time time;

}	/*	End of CLASS:	Test_Time.java			*/
