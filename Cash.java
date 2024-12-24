//Taleed Hamadneh || #1220006 || Section 3L
package payment;

public class Cash extends CustomerPayment {
	private double discountRate;
	 
	public Cash() {
		
	}
	
	public Cash(String customerName, int customerId, double amount, double discountRate) {
		super(customerName,customerId,amount);
		this.discountRate=discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}
     
	public double getDiscountRate() {
		return this.discountRate;
	}
	
	
	public String toString() {
		return "Cash" +" [Discount Rate= " + getDiscountRate() + ", " + super.toString() + "]" ;
	}
	
	protected double calculatePayment() {
	     	return (super.getAmount() - ((getDiscountRate())/100)*super.getAmount());
           //if the amount =150,and rate=5, payment = 150 - (0.05*150)	

	}
	
}
