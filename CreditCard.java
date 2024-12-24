//Taleed Hamadneh || #1220006 || Section 3L
package payment;
import java.util.Date;
public class CreditCard extends CustomerPayment implements Payable {

	private double chargingFee;
	private Date expiryDate; 
	
	public CreditCard() {
		
	}
	
	public CreditCard(String customerName,int customerId,double amount, double chargingFee,Date expiryDate) {
		super(customerName,customerId,amount);
		this.chargingFee=chargingFee;
		this.expiryDate=expiryDate;
	}
	
	public void setChargingFee(double chargingFee) {
		this.chargingFee=chargingFee;
	}
	
	public double getChargingFee() {
		return this.chargingFee;
	}
	
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate=expiryDate;
	}
	
	public Date getExpiryDate() {
		return this.expiryDate;
	}
	
	protected double calculatePayment() {
		return super.getAmount()+ getChargingFee();
	}
	
	public boolean isAuthorized() {
	Date today=new Date();
	if(today.compareTo(getExpiryDate())<= 0 ) { //if today is before the expiry date then it's authorized
		return true;
	}
	else {
		return false;
	}
	
	}
	
	public String toString() {
		return "CreditCard" +"[Charging Fee=" + getChargingFee() + ", Expiry Date= " + getExpiryDate()+ " ," + super.toString() + "]";
	}
	
	
}
