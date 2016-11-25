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

/** 
* Runs all JUnit test classes for symphony.domain package
* @author Everett Holden
* @version 2016.11.25
*************************************************************/
public class AllTests extends TestCase {
	
	/** 
	* Creates an instance of the AllTest class
	* @param name a string representing the test name
	*************************************************************/
	public AllTests(String name) {
		super(name);		
	}
	
	/** 
	* Creates an instance of TestSuite and adds the test cases from 
	* Test_ShannonsTheorem by calling that classes suite() method.
	* @return suite 
	*************************************************************/
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(Test_Address.suite());
		suite.addTest(Test_Composition.suite());
		suite.addTest(Test_CompositionBuilder.suite());
		//suite.addTest(Test_Concert.suite());
		//suite.addTest(Test_ConcertBuilder.suite());
		//suite.addTest(Test_Conductor.suite());
		//suite.addTest(Test_Controller.suite());
		suite.addTest(Test_Credit.suite());
		suite.addTest(Test_CreditCard.suite());
		suite.addTest(Test_Date.suite());
		suite.addTest(Test_DateBuilder.suite());
		suite.addTest(Test_Day.suite());
		suite.addTest(Test_Debit.suite());
		suite.addTest(Test_DebitCard.suite());
		suite.addTest(Test_Identification.suite());
		suite.addTest(Test_Month.suite());
		suite.addTest(Test_Movement.suite());
		suite.addTest(Test_MovementBuilder.suite());
		suite.addTest(Test_Name.suite());
		suite.addTest(Test_Performance.suite());
		suite.addTest(Test_Phone.suite());
		suite.addTest(Test_Soloist.suite());
		suite.addTest(Test_Time.suite());
		suite.addTest(Test_Year.suite());		
		
		return suite;
	}
	
	/** 
	* Main method, starting point of application required by JVM
	* Prints a status message then executes the run functions
	* of the JUnit runner. 
	* @param args String array of command line arguments
	*************************************************************/
	 public static void main(String[] args) {
        System.out.println("Executing AllTests ...");
        junit.textui.TestRunner.run(suite());
    }

}
