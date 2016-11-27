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
 * The DebitCard class represents the information related
 * to a physical debit card.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.22
 */
public class DebitCard{


	/* CONSTRUCTORS	-----------------------------------------------------	*/

	/**
	 * Default constructor 
	 * @param accountNumber a long representing the account number
	 *************************************************************/
	public DebitCard(long accountNumber){
		this.accountNumber = accountNumber;
	}


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the account number associated with the debit card
	 * @return accountNumber a long representing the account number
	 *************************************************************/
	public long getAccountNumber(){
		return accountNumber;
	}
	
	/**
	 * Returns the Person who owns the account and debit card
	 * @return accountHolder the person who owns the account
	 *************************************************************/
	public Person getAccountHolder(){
		return accountHolder;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the account number associated with the debit card
	 * @param accountNumber the account number of associated with the debit card
	 *************************************************************/
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Sets the Person who owns the account
	 * @param accountHolder the person who owns the account
	 *************************************************************/
	public void setAccountHolder(Person accountHolder){
		this.accountHolder = accountHolder;
	}


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	/** identifies the account */
	private long accountNumber;
	/** the person who owns the account*/
	private Person accountHolder;


}	/*	End of CLASS:	DebitCard.java			*/