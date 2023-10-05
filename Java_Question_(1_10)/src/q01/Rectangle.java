package q01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle implements Shape {
	private static final DecimalFormat df = new DecimalFormat("0.000");
	static int Length;
	static int Breadth;
	static String shapeName;
	@Override
	public String shapes(String shapeName) {
		return shapeName;
	}

	@Override
	public double area() {
		double a=Length*Breadth;
		return a;
	}

	@Override
	public double perimeter() {
		double a=2*(Length+Breadth);
		return a;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Shape::");
		shapeName = sc.nextLine();
		System.out.println("Shape Entered::"+shapeName);
		System.out.println("Enter The Length::");
		Length = sc.nextInt();
		System.out.println("Enter The Breadth::");
		Breadth = sc.nextInt();
		Rectangle c = new Rectangle();
		String cArea = df.format(c.area());
		String cPerimeter = df.format(c.perimeter());
        System.out.println("Area Of " +shapeName+" Is::" + cArea+" Square Units");
		System.out.println("Perimeter Of " +shapeName+" Is::" + cPerimeter+"  Units");
	}

}
