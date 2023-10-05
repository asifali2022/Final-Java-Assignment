package q01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle implements Shape {
	private static final DecimalFormat df = new DecimalFormat("0.000");
	static int rad;
	static String shapeName;
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Shape::");
		shapeName = sc.nextLine();
		System.out.println("Shape Entered::"+shapeName);
		System.out.println("Enter The Radius::");
		rad = sc.nextInt();
		Circle c = new Circle();
		String cArea = df.format(c.area());
		String cPerimeter = df.format(c.perimeter());
		System.out.println("Area Of " +shapeName+" Is::" + cArea+" Square Units");
		System.out.println("Perimeter Of " +shapeName+" Is::" + cPerimeter+"  Units");
	}
	public String shapes(String name)
	{
		return shapeName;
	}

	public double area() {
		double a = Math.PI * 2 * rad * rad;
		return a;

	}

	public double perimeter() {
		double a = Math.PI * 2 * rad;
		return a;
	}
}
