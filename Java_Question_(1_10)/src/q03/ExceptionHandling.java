package q03;

import java.util.Scanner;


public class ExceptionHandling  {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The Number");
	    int num = sc.nextInt();
	    if(num<0)
	    {
	    	throw new NegativeNumberException("Number Is Negative!");
	    }
}
}
 class NegativeNumberException extends RuntimeException{
	 
	
	private static final long serialVersionUID = -111568266160135847L;

	public NegativeNumberException(String s) {
		super(s);
		
		
	}
	
}