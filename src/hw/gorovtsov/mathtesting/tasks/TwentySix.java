// Kufas.ru  6.1.1.26
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class TwentySix {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));

		System.out.println("Result: " + rez);
	}
}
