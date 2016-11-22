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
import symphony.domain.Identification;
import symphony.domain.Movement;
import symphony.domain.MovementBuilder;
import symphony.domain.Name;

import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN	
 * @version   1.0.0 2016.11.22
 */
public class Test_MovementBuilder extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_MovementBuilder(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_MovementBuilder
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_MovementBuilder.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_MovementBuilder End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_MovementBuilder Begin");	
		builder = new MovementBuilder();
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	@Test
	public void testMovementBuliderConstructor(){
		System.out.println("\t\t Test_MovementBuilder.testMovementBuliderConstructor");			
				
		assertTrue("\tTesting MovementBuilder MovementBulider Constructor", builder instanceof MovementBuilder );
	}
	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testBuild(){
		System.out.println("\t\t Test_MovementBuilder.testBuild");			
				
		assertTrue("\tTesting MovementBuilder build method", builder.build() instanceof Movement );
	}
	
	@Test
	public void testMovementID(){
		System.out.println("\t\t Test_MovementBuilder.testMovementID");			
				
		
		assertTrue("\tTesting MovementBuilder movementID method", builder.movementID(new Identification()) instanceof MovementBuilder );
	}
	
	@Test
	public void testMovementName(){
		System.out.println("\t\t Test_MovementBuilder.testMovementName");			
				
		assertTrue("\tTesting MovementBuilder movementName method", builder.movementName(new Name()) instanceof MovementBuilder );
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	private MovementBuilder builder;

}	/*	End of CLASS:	Test_MovementBuilder.java			*/
