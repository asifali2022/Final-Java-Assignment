package q04;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Depositor d = new Depositor();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Ineuron Bank Pvt Ltd");
		System.out.println("================================");
		System.out.print("Enter Your Name::");
		String name = sc.nextLine();
		d.setName(name);
		System.out.print("Enter Your Account Number::");
		long acn = sc.nextLong();
		d.setAccountNumber(acn);
		System.out.print("Enter Your Secret Pin::");
		int pin = sc.nextInt();
		d.setSecretPin(pin);
		System.out.println("Cross-Check Your Details::");
		System.out.println("Name::"+d.getName());
		System.out.println("AccountNumber::"+d.getAccountNumber());
		
		System.out.println("Correct Details::[Y/N]");
		String option = sc.next();
		if (option.equalsIgnoreCase("Y")) {
			
			System.out.println("Select Your Services");
			System.out.println("1. CHECK ACCOUNT BALANCE");
			System.out.println("2. DEPOSIT MONEY");
			System.out.println("3. WITHDRAW MONEY");
			System.out.println("4. Exit");
			Integer services = sc.nextInt();
			if (services.equals(1)) {
				
				Depositor.checkBalance(Depositor.accountBalance);
				
			} 
			else if(services.equals(2))
			{
				 Depositor.setAccountBalance(1250);
				System.out.print("Enter The Amount::");
				int amt = sc.nextInt();
				Depositor.depositMoney(Depositor.accountBalance,amt);
			}
			else if(services.equals(3))
			{
				System.out.print("Enter The Amount::");
				int amt = sc.nextInt();
				Depositor.withdrawMoney(Depositor.accountBalance, amt);
			}
			else if(services.equals(4))
			{
				System.out.println("Thank You For Using The Services !");
			}
			System.out.println(d);
		} 
		
		
		else 
		{
        System.out.println("Wrong Input!");
		}
		
		
		
	}

}
