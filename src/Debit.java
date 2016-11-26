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
public class Debit implements PayMethod{


	/* CONSTRUCTORS	-----------------------------------------------------	*/



	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * The debit trasaction id
	 * @return id
	 *************************************************************/
	@Override
	public Identification getID() {
		return id;
	}
	
	/**
	 * The date of the debit transaction 
	 * @return date
	 *************************************************************/
	@Override
	public Date getDate() {
		return date;
	}
	
	/**
	 * Returns the DebitCard associated with this transaction
	 * @return date
	 *************************************************************/
	public DebitCard getCard(){
		return debitCard;
	}


	/* MODIFIERS	-----------------------------------------------------	*/
	
	/**
	 * Set the debit transaction id
	 * @param id a unique identifier for the debit payment
	 *************************************************************/
	@Override
	public void setID(Identification id) {
		this.id = id;
	}

	/**
	 * Set the date of the debit transaction 
	 * @param date the date of the debit payment
	 *************************************************************/
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Set the debit card associated with the debit transaction
	 * @param card the debit card associated with the debit payment
	 *************************************************************/
	public void setCard(DebitCard card){
		this.debitCard = card;
	}

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	/* ATTRIBUTES	-----------------------------------------------------	*/	
	/** identifies the debit transaction*/
	private Identification id;
	/** specifies the date the transaction occured*/
	private Date date;
	/** the debit card associated with the transaction*/
	private DebitCard debitCard;
	
}	/*	End of CLASS:	Debit.java			*/