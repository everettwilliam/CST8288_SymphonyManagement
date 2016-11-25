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
import symphony.domain.Address;
import symphony.domain.CreditCard;
import symphony.domain.Customer;
import symphony.domain.Name;
import symphony.domain.Person;
import symphony.domain.Phone;

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
		customer = new Customer(new Name("test"),new Address("test"), new Phone("555-5555"));
		card.setCardHolder(customer);

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
		
		assertTrue("\tTesting CreditCard setCardNumber method", card.getCardNumber() == 0010010100111111l);
		card.setCardNumber(0110111100001010l);
		assertFalse("\tTesting CreditCard setCardNumber method", card.getCardNumber() == 0010010100111111l);
	}

	@Test
	public void testSetCardHolder(){
		System.out.println("\t\t Test_CreditCard.testSetCardHolder");		

		assertTrue("\tTesting CreditCard setCardHolder method", card.getCardHolder().equals(customer));
		Customer newCustomer = new Customer(new Name("different"), new Address("different"), new Phone("555-5555"));
		card.setCardHolder(newCustomer);
		assertFalse("\tTesting CreditCard setCardHolder method", card.getCardHolder().equals(customer));

	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/	
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/
	
	private CreditCard card;
	private Customer customer;


}	/*	End of CLASS:	Test_CreditCard.java			*/
