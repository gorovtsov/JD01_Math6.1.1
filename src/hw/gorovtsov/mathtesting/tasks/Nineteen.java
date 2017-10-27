// Kufas.ru 6.1.1.19
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Nineteen {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.exp(x) - ((Math.pow(y, 2) + 12 * x * y - 3 * Math.pow(x, 2))) / (18 * y - 1);

		System.out.println("Result: " + rez);
	}
}
