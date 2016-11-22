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
import symphony.domain.Date;
import symphony.domain.DateBuilder;
import symphony.domain.Day;
import symphony.domain.Month;
import symphony.domain.Time;
import symphony.domain.Year;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.21
 */
public class Test_DateBuilder extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_DateBuilder(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_DateBuilder
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_DateBuilder.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_DateBuilder End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_DateBuilder Begin");	
		
		builder = new DateBuilder(new Year(2016), new Month(11), new Day(21));
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testDateBuilderConstructor(){
		System.out.println("\t\t Test_DateBuilder.testDateBuilderConstructor");		

		assertTrue("\tTesting DateBuilder default constructor", builder instanceof DateBuilder);
		assertNotNull("\tTesting DateBuilder default constructor", builder);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetYear(){
		System.out.println("\t\t Test_DateBuilder.testGetYear");	
		
		assertTrue("\tTesting DateBuilder getDateBuilder method", builder.getYear().getYear() == 2016);
	}
	
	@Test
	public void testGetMonth(){
		System.out.println("\t\t Test_DateBuilder.testGetMonth");	
		
		assertTrue("\tTesting DateBuilder getDateBuilder method", builder.getMonth().getMonth() == 11);
	}
	
	@Test
	public void testGetDay(){
		System.out.println("\t\t Test_DateBuilder.testGetDay");	
		
		assertTrue("\tTesting DateBuilder getDateBuilder method", builder.getDay().getDay() == 21);
	}
	
	@Test
	public void testGetTime(){
		System.out.println("\t\t Test_DateBuilder.testGetTime");	
		
		assertNull("\tTesting DateBuilder getDateBuilder method", builder.getTime());
		builder.time(new Time());
		assertNotNull("\tTesting DateBuilder getDateBuilder method", builder.getTime());
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	@Test
	public void testBuild(){
		System.out.println("\t\t Test_DateBuilder.testBuild");	
		
		
		assertTrue("\tTesting DateBuilder getDateBuilder method", builder.build() instanceof Date);
	}

	
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private DateBuilder builder;


}	/*	End of CLASS:	Test_DateBuilder.java			*/