package q04;

public class Depositor {

	 String Name;
	 
	 long accountNumber;
	 
	 static long accountBalance;
	 
	 public static long setAccountBalance(long accountBalance) {
		return Depositor.accountBalance = accountBalance;
	}
     public static long getAccountBalance() {
		return accountBalance;
	}
	
	int secretPin;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long acn) {
		this.accountNumber = acn;
	}
	public int getSecretPin() {
		return secretPin;
	}
	public void setSecretPin(int secretPin) {
		this.secretPin = secretPin;
	}
	static public void depositMoney(  long accountBalance,long amt) {
		accountBalance=setAccountBalance(amt);
		System.out.println("Amount "+amt+" Successfully Deposited");
		
		
	}
	static public void withdrawMoney(long accountBalance,long amt) {
		if(amt<accountBalance)
		{
			System.out.println("Insufficient Fund !");
		}
		else
		{
		System.out.println("Amount Withdrawn is INR::"+amt);
		}
		accountBalance=accountBalance-amt;
		
		
	}
	static public void checkBalance(long accountBalance) {
		System.out.println("Current Balance In The Account is::"+accountBalance);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name+"\n"+accountNumber+"\n"+accountBalance;
	}

}
