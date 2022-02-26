import java.lang.Math;
import java.util.Random;

public class ComputeMethods5026211021 {
	public double fToC(double degreesF) {
		return (5.0/9.0)*(degreesF-32);
	}

	public double hypotenuse(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public int roll() {
		Random rand = new Random();
		int firstDice = rand.nextInt(6) + 1;
		int secondDice = rand.nextInt(6) + 1;
		int total = firstDice + secondDice;
		return total;
	}
}
