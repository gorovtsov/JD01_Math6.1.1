// Kufas.ru  6.1.1.13
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Thirteen {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.cos(x) / (Math.PI - 2 * x) + 16 * x * Math.cos(x * y) - 2;

		System.out.println("Result: " + rez);
	}
}