import java.util.Scanner;

public class TestClass5026211021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ComputeMethods5026211021 method = new ComputeMethods5026211021();

		System.out.println("INPUT");
		System.out.print("Temperature value in fahrenheit = ");
		double fahrenheitValue = sc.nextDouble();
		double celciusValue = method.fToC(fahrenheitValue);
		
		System.out.print("Value of the opposite side (A) of the triangle = ");
		double a = sc.nextDouble();
		System.out.print("Value of the adjacent side (B) of the triangle = ");
		double b = sc.nextDouble();
		double c = method.hypotenuse(a, b);

		System.out.println("\nOUTPUT");
		System.out.println("Temp in celcius is " + celciusValue);
		System.out.println("Hypotenuse (C) is " + c);
		System.out.println("The sum of the dice values is " + method.roll());
	}
}
