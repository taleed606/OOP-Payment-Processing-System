//Taleed Hamadneh || #1220006 || Section 3L
package payment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class Driver {

	public static void main (String [] args) {
	
		ArrayList<CustomerPayment> list = new ArrayList<>() ;
	  
	 
	CustomerPayment check1 =new Check("Rania",7777,600.0,1111,750,Check.CERTIFIED);
	   if (((Check)check1).isAuthorized()) {
			list.add(check1);
		}
		
	CustomerPayment cash1= new Cash("Ahmad",4444,150,5.0);
	      list.add(cash1);
	
	CustomerPayment creditCard1 = new CreditCard("Randa",9999,170,20, new Date(124,05,03));
		if (((CreditCard)creditCard1).isAuthorized())
			list.add(creditCard1);

	  
	   
		Collections.sort(list,Collections.reverseOrder());	// sorting in descending order	
	    for(int i=0;i<list.size();i++) {
	    	list.get(i).printPaymentInfo(); 
	    	System.out.println();
	    }
		
	
	}
		
	
}
