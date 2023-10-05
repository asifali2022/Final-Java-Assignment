package q01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Square implements Shape{

	
		private static final DecimalFormat df = new DecimalFormat("0.000");
		static int side;
		static String shapeName;
		public static void main(String[] args) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Shape::");
			shapeName = sc.nextLine();
			System.out.println("Shape Entered::"+shapeName);
			System.out.println("Enter The Side::");
			side = sc.nextInt();
			Square c = new Square();
			String cArea = df.format(c.area());
			String cPerimeter = df.format(c.perimeter());
			System.out.println("Area Of " +shapeName+" Is::" + cArea+" Square Units");
			System.out.println("Perimeter Of " +shapeName+" Is::" + cPerimeter+"  Units");
	}

	@Override
	public String shapes(String shapeName) {
		
		return shapeName;
	}

	@Override
	public double area() {
		double a=side*side;
		return a;
	}

	@Override
	public double perimeter() {
		double s=4*side;
		return s;
	}

}
