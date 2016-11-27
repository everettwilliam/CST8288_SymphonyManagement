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
 * This interface specifies a payment method.
 * @author    EVERETT HOLDEN
 * @version   1.0.0 2016.11.22
 */
public interface PayMethod{	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	
	public Identification getID();
	public Date getDate();


	/* MODIFIERS	-----------------------------------------------------	*/
	
	public void setID(Identification id);
	public void setDate(Date date);

	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	/* HELPER METHODS	--------------------------------------------------	*/
	
	public String toString();
	
}	/*	End of INTERFACE:	PayMethod.java			*/



