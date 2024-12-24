//Taleed Hamadneh || #1220006 || Section 3L
package payment;

public class Check extends CustomerPayment implements Payable {
	public static final int CASHIER = 1; 
	public static final int CERTIFIED = 2;
	public static final int PERSONAL = 3;
	
	
	
	private int accountNumber;
	private double accountBalance;
	private int type;
	
	public Check() {
		
	}
	
	public Check (String customerName,int customerId,double amount,int accountNumber, double accountBalance, int type) {
		super(customerName,customerId,amount);
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		this.type=type;
		
	}
	
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public void setType(int type) {
		this.type=type;
	}
	
	public int getType() {
		return this.type;
	}
	
	public String toString() {
		return "Check" + "[Account Number=" + getAccountNumber() + ", Account Balance= " + getAccountBalance() + ", Type=" + getType()+ ", " +super.toString() + "]";
	}
	
	public void deductAmountFromBalance() {
		setAccountBalance(getAccountBalance()-super.getAmount());
	}

	protected double calculatePayment() {
		return super.getAmount();
		
	}
	
	public boolean isAuthorized() {
		if(this.type==1 || calculatePayment()<= getAccountBalance()) {     // if it's authorized, deduct the amount before adding to the list
			 if(getType()==Check.CERTIFIED || getType()==Check.PERSONAL) {
				   deductAmountFromBalance();
			   }
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
