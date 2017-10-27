// Kufas.ru 6.1.1.5
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Five {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[4];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = (3 + Math.expm1(y)) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(x)));

		System.out.println("Result: " + rez);
	}
}