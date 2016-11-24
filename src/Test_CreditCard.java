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
import symphony.domain.CreditCard;
import symphony.domain.Customer;
import symphony.domain.DebitCard;
import symphony.domain.Person;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.23
 */
public class Test_CreditCard extends TestCase{

	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_CreditCard(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_CreditCard
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_CreditCard.class);
	}

	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_CreditCard End");
	}

	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_CreditCard Begin");	

		card = new CreditCard(0010010100111111l);
		card.setCardHolder(new Customer());

	}

	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Test constructor
	 *************************************************************/
	@Test
	public void testCreditCardConstructor(){
		System.out.println("\t\t Test_CreditCard.testCreditCardConstructor");

		CreditCard test = new CreditCard(0000101001011111l);

		assertTrue("\tTesting CreditCard constructor", test instanceof CreditCard);
		assertNotNull("\tTesting CreditCard constructor", test);
	}


	/* ACCESSORS	-----------------------------------------------------	*/

	@Test
	public void testGetCardNumber(){
		System.out.println("\t\t Test_CreditCard.testGetCardNumber");		

		assertTrue("\tTesting CreditCard getCardNumber method", card.getCardNumber() == 0010010100111111l);
	}

	@Test
	public void testGetCardHolder(){
		System.out.println("\t\t Test_CreditCard.testGetCardHolder");		
		
		assertTrue("\tTesting CreditCard getCardHolder method", card.getCardHolder() instanceof Person);
	}

	/* MODIFIERS	-----------------------------------------------------	*/

	@Test
	public void testSetCardNumber(){
		System.out.println("\t\t Test_CreditCard.testSetCardNumber");		


	}

	@Test
	public void testSetCardHolder(){
		System.out.println("\t\t Test_CreditCard.testSetCardHolder");		


	}


	/* NORMAL BEHAVIOR --------------------------------------------------	*/	
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/											
	CreditCard card;


}	/*	End of CLASS:	Test_CreditCard.java			*/
