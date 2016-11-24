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
import symphony.domain.Name;
import symphony.domain.Person;
import symphony.domain.Phone;
import symphony.domain.Address;
import symphony.domain.Composer;
import symphony.domain.Composition;
import symphony.domain.CompositionBuilder;
import org.junit.Test;
import org.junit.Before;
/**
 * Test class for CompositionBuilder
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.23
 */
public class Test_CompositionBuilder extends TestCase{
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_CompositionBuilder(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_CompositionBuilder
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_CompositionBuilder.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_CompositionBuilder End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_CompositionBuilder Begin");
		Identification id = new Identification("test");
		id.setID("01test");
		Name name = new Name();
		name.setName("test");
		builder = new CompositionBuilder(id, name);
		Person composer = new Composer(new Name(), new Address, new Phone(),);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testCompositionBuilderConstructor(){
		System.out.println("\t\t Test_CompositionBuilder.testCompositionBuilderConstructor");		

		assertTrue("\tTesting CompositionBuilder default constructor", builder instanceof CompositionBuilder);
		assertNotNull("\tTesting CompositionBuilder default constructor", builder);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Test accessor
	 *************************************************************/
	@Test
	public void testGetID(){
		System.out.println("\t\t Test_CompositionBuilder.testGetID");	
		
		assertTrue("\tTesting CompositionBuilder testGetID method", builder.getID().toString().equals("01test"));
	}
	
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_CompositionBuilder.testGetName");	
		
		assertTrue("\tTesting CompositionBuilder testGetName method", builder.getName().toString().equals("test"));
	}
	
	@Test
	public void testGetComposer(){
		
		builder.composer(new );
		System.out.println("\t\t Test_CompositionBuilder.testGetComposer");		
		assertTrue("\tTesting CompositionBuilder testGetComposer method");
	}
	
	@Test
	public void testGetSoloist(){
		System.out.println("\t\t Test_CompositionBuilder.testGetSoloist");	
		
		assertNull("\tTesting CompositionBuilder testGetSoloist method");
		
		assertNotNull("\tTesting CompositionBuilder testGetSoloist method");
	}
	
	@Test
	public void testGetMovement(){
		System.out.println("\t\t Test_CompositionBuilder.testGetMovement");	
		
		assertNull("\tTesting CompositionBuilder testGetMovement method");		
		assertNotNull("\tTesting CompositionBuilder testGetMovement method");
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	@Test
	public void testComposer(){
		System.out.println("\t\t Test_CompositionBuilder.testComposer");	
		
		assertNull("\tTesting CompositionBuilder testComposer method");		
		assertNotNull("\tTesting CompositionBuilder testComposer method");
	}
	
	@Test
	public void testSoloist(){
		System.out.println("\t\t Test_CompositionBuilder.testComposer");	
		
		assertNull("\tTesting CompositionBuilder testComposer method");		
		assertNotNull("\tTesting CompositionBuilder testComposer method");
	}
	
	@Test
	public void testMovement(){
		System.out.println("\t\t Test_CompositionBuilder.testComposer");	
		
		assertNull("\tTesting CompositionBuilder testComposer method");		
		assertNotNull("\tTesting CompositionBuilder testComposer method");
	}
	
	@Test
	public void testBuild(){
		System.out.println("\t\t Test_CompositionBuilder.testBuild");		
		
		assertTrue("\tTesting CompositionBuilder getCompositionBuilder method", builder.build() instanceof Composition);
	}

	
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											

	private CompositionBuilder builder;

}	/*	End of CLASS:	Test_CompositionBuilder.java			*/
