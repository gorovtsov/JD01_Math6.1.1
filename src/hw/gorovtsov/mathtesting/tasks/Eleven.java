// Kufas.ru  Задание 6.1.1.11
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Eleven {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = (1 + 1 / Math.pow(x, 2)) - 12 * Math.pow(x, 2) * y;

		System.out.println("Result: " + rez);
	}
}
