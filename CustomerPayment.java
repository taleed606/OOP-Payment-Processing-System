//Taleed Hamadneh || #1220006 || Section 3L
package payment;
import java.lang.Comparable;
public abstract class CustomerPayment implements Comparable<CustomerPayment> {

	protected String customerName;
	protected int customerId;
	protected double amount;
	
	public CustomerPayment() {
		
	}
	
	public CustomerPayment(String customerName,int customerId, double amount) {
		this.customerName=customerName;
		this.customerId=customerId;
		this.amount=amount;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public int getCustomerId() {
		return this.customerId;
	}
	
	public void setamount(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	protected abstract double calculatePayment();
	
	
	public int compareTo(CustomerPayment obj) {
		if(this.calculatePayment()==obj.calculatePayment()) { 
			return 0;
		}
		else if(this.calculatePayment()>obj.calculatePayment()) {
			return 1; 
		}
		else {
			return -1; 
		}
		
	}
	
	void printPaymentInfo() {
		System.out.println(toString());
		System.out.println("Payment= " + calculatePayment());
	}
	
	public String toString() {
		return "Customer Name= "+ getCustomerName() +", Customer Id= " + getCustomerId()+ ", amount= " +getAmount();
	}
	
	
}
