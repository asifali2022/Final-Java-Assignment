package q01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle implements Shape {
	private static final DecimalFormat df = new DecimalFormat("0.000");
	static int Height;
	static int Base;
	static int Side1;
	static int Side2;
	static String shapeName;
	@Override
	public String shapes(String shapeName) {
		
		return shapeName;
	}

	@Override
	public double area() {
		double a=(Base*Height)/2;
		return a;
	}

	@Override
	public double perimeter() {
		int a=Side1+Side2+Base;
		return a;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Shape::");
		shapeName = sc.nextLine();
		System.out.println("Shape Entered::"+shapeName);
		System.out.println("Enter The Height::");
		Height = sc.nextInt();
		System.out.println("Enter The Base::");
		Base = sc.nextInt();
		System.out.println("Enter The Side1::");
		Side1 = sc.nextInt();
		System.out.println("Enter The Side2::");
		Side2 = sc.nextInt();
		Triangle c = new Triangle();
		String cArea = df.format(c.area());
		String cPerimeter = df.format(c.perimeter());
        System.out.println("Area Of " +shapeName+" Is::" + cArea+" Square Units");
		System.out.println("Perimeter Of " +shapeName+" Is::" + cPerimeter+"  Units");

	}

}
