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

package symphony.domain;
/**
 * Description of this class.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.22
 */
public class CreditCard{
	
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	
	/**
	 * Default constructor 
	 * 
	 *************************************************************/
	public CreditCard(long cardNumber){
		this.cardNumber = cardNumber;
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the account number associated with the credit card
	 *@return accountNumber 
	 *************************************************************/
	public long getCardNumber(){
		return cardNumber;
	}
	
	/**
	 * Returns the Person who owns the credit card
	 *@return accountHolder 
	 *************************************************************/
	public Person getCardHolder(){
		return cardHolder;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the account number associated with the credit card
	 * @param accountNumber 
	 *************************************************************/	
	public void setCardNumber(long cardNumber){
		this.cardNumber = cardNumber;
	}
	
	/**
	 * Sets the Person who owns the credit card
	 * @param accountHolder
	 *************************************************************/
	public void setCardHolder(Person cardHolder){
		this.cardHolder = cardHolder;
	}


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	/** identifies the credit card */
	private long cardNumber;
	/** the person who owns the card*/
	private Person cardHolder;


}	/*	End of CLASS:	CreditCard.java			*/