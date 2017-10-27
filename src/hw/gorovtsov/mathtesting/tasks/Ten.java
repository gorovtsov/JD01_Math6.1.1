// Kufas.ru 6.1.1.10
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Ten {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.pow((x + 1) / (x - 1), x) + 18 * x * Math.pow(y, 2);

		System.out.println("Result: " + rez);
	}
}
