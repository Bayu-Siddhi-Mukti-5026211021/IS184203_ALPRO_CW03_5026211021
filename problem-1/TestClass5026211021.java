import java.util.Scanner;

public class TestClass5026211021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ComputeMethods5026211021 method = new ComputeMethods5026211021();

		System.out.print("Temperature value from fahrenheit = ");
		double fahrenheitValue = sc.nextDouble();
		double celciusValue = method.fToC(fahrenheitValue);
		
		System.out.print("Value of the opposite side of the triangle (A) = ");
		double a = sc.nextDouble();
		System.out.print("Value of the adjacent side of the triangle (B) = ");
		double b = sc.nextDouble();
		double c = method.hypotenuse(a, b);

		System.out.println();
		
		System.out.println("Temp in celcius is " + celciusValue);
		System.out.println("Hypotenuse (C) is " + c);
		System.out.println("The sum of the dice values is " + method.roll());
	}
}
