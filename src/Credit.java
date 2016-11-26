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
 * Represents a debit transaction
 * Has an identifer, a date and a debit cart associated with the transaction
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.22
 */
public class Credit implements PayMethod{
	
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	


	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the credit transaction id
	 * @return id
	 *************************************************************/
	@Override
	public Identification getID() {
		return id;
	}
	
	/**
	 * Returns the credit transaction date
	 * @return date
	 *************************************************************/
	@Override
	public Date getDate() {
		return date;
	}
	
	/**
	 * Returns the credit card associated with this transaction
	 * @return date
	 *************************************************************/
	public CreditCard getCard(){
		return creditCard;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Sets the credit transaction id
	 * @param id a unique identifier for a credit payment
	 *************************************************************/
	@Override
	public void setID(Identification id) {
		this.id = id;
	}

	/**
	 * Sets the credit transaction date
	 * @param date the date of the credit payment
	 *************************************************************/
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Sets the credit card associated with the transaction
	 * @param card the credit card associated with the credit payment
	 *************************************************************/
	public void setCard(CreditCard card){
		this.creditCard = card;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	
	/** identifies the credit transaction*/
	private Identification id;
	/** the date of the credit transaction*/
	private Date date;
	/** the credit card associated with the transaction */
	private CreditCard creditCard;


}	/*	End of CLASS:	Credit.java			*/