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
import symphony.domain.Person;
import symphony.domain.Phone;
import symphony.domain.Soloist;
import symphony.domain.Address;
import symphony.domain.Composer;
import symphony.domain.Composition;
import symphony.domain.CompositionBuilder;
import org.junit.Test;

import java.util.Vector;

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
		Name name = new Name();
		name.setName("test");
		builder = new CompositionBuilder(id, name);
		Vector<Soloist> soloists = new Vector<>();
		Vector<Composition> composition = new Vector<>();
		Vector<Movement> movements = new Vector<>();
		Movement movement = new MovementBuilder().build();
		movements.add(movement);
		Composer composer = new Composer(new Name(), new Address(), new Phone("test"), composition );
		Soloist soloist = new Soloist(new Name(), new Address(), new Phone("test"), "Violinist");
		soloists.add(soloist);
		builder.composer(composer).soloist(soloists).composer(composer).movement(movements);
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
		
		assertTrue("\tTesting CompositionBuilder testGetID method", builder.getID().getID().equals("test"));
	}
	
	@Test
	public void testGetName(){
		System.out.println("\t\t Test_CompositionBuilder.testGetName");	
		
		assertTrue("\tTesting CompositionBuilder testGetName method", builder.getName().getName().equals("test"));
	}
	
	@Test
	public void testGetComposer(){		
		System.out.println("\t\t Test_CompositionBuilder.testGetComposer");	
		
		assertTrue("\tTesting CompositionBuilder testGetComposer method", builder.getComposer() instanceof Person);
		assertNotNull("\tTesting CompositionBuilder testGetSoloist method", builder.getComposer());
	}
	
	@Test
	public void testGetSoloist(){
		System.out.println("\t\t Test_CompositionBuilder.testGetSoloist");	
		
		assertTrue("\tTesting CompositionBuilder testGetSoloist method", builder.getComposer() instanceof Person);		
		assertNotNull("\tTesting CompositionBuilder testGetSoloist method", builder.getComposer());
	}
	
	@Test
	public void testGetMovement(){
		System.out.println("\t\t Test_CompositionBuilder.testGetMovement");	
		
		assertTrue("\tTesting CompositionBuilder testGetMovement method", builder.getMovement().get(0) instanceof Movement);		
		assertNotNull("\tTesting CompositionBuilder testGetMovement method", builder.getMovement().get(0));
	}

	/* MODIFIERS	-----------------------------------------------------	*/
	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	
	@Test
	public void testComposer(){
		System.out.println("\t\t Test_CompositionBuilder.testComposer");
		
		Vector<Composition> composition = new Vector<>();
		Composer composer = new Composer(new Name(), new Address(), new Phone("test"), composition);
		
		assertTrue("\tTesting CompositionBuilder testComposer method", builder.composer(composer) instanceof CompositionBuilder);	
	}
	
	@Test
	public void testSoloist(){
		System.out.println("\t\t Test_CompositionBuilder.testSoloist");	
		
		Vector<Soloist> soloists = new Vector<>();
		
		assertTrue("\tTesting CompositionBuilder testComposer method", builder.soloist(soloists) instanceof CompositionBuilder);	
	}
	
	@Test
	public void testMovement(){
		System.out.println("\t\t Test_CompositionBuilder.testMovement");	
		
		Vector<Movement> movements = new Vector<>();
		
		assertTrue("\tTesting CompositionBuilder testComposer method", builder.movement(movements) instanceof CompositionBuilder);		
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
