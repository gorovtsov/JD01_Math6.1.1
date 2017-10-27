// Kufas.ru  6.1.1.23
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.*;

public class TwentyThree {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.pow(x, 3) - 4 * x + (y - Math.sqrt(Math.abs(x)));

		System.out.println("Result: " + rez);
	}
}
