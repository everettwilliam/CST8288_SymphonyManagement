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
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class Test_Month extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Month(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Month
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Month.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Month End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Month Begin");		
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	


	/* ACCESSORS	-----------------------------------------------------	*/
	


	/* MODIFIERS	-----------------------------------------------------	*/
	


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	



	/* HELPER METHODS	--------------------------------------------------	*/




	/* ATTRIBUTES	-----------------------------------------------------	*/											



}	/*	End of CLASS:	Test_Month.java			*/
