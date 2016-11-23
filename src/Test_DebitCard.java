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
import symphony.domain.DebitCard;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.23
 */
public class Test_DebitCard extends TestCase{

	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_DebitCard(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_DebitCard
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_DebitCard.class);
	}

	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_DebitCard End");
	}

	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_DebitCard Begin");	
		card = new DebitCard(0000101001011111l);
	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testDebitCardConstructor(){
		System.out.println("\t\t Test_DebitCard.testDebitCardConstructor");

		DebitCard test = new DebitCard(0000101001011111l);

		assertTrue("\tTesting DebitCard constructor", test instanceof DebitCard);
		assertNotNull("\tTesting DebitCard constructor", test);
	}

	/* ACCESSORS	-----------------------------------------------------	*/

	@Test
	public void testGetAccountNumber(){
		System.out.println("\t\t Test_DebitCard.testGetAccountNumber");		

		assertTrue("\tTesting DebitCard getAccountNumber method", card.getAccountNumber() == 0000101001011111l);
	}

	@Test
	public void testGetAccountHolder(){
		System.out.println("\t\t Test_DebitCard.testGetCardHolder");		


	}

	/* MODIFIERS	-----------------------------------------------------	*/

	@Test
	public void testSetAccountNumber(){
		System.out.println("\t\t Test_DebitCard.testSetAccountNumber");		


	}

	@Test
	public void testSetAccountHolder(){
		System.out.println("\t\t Test_CreditCard.testSetAccountHolder");		


	}

	/* MODIFIERS	-----------------------------------------------------	*/



	/* NORMAL BEHAVIOR --------------------------------------------------	*/




	/* HELPER METHODS	--------------------------------------------------	*/




	/* ATTRIBUTES	-----------------------------------------------------	*/											
	DebitCard card;


}	/*	End of CLASS:	Test_DebitCard.java			*/
