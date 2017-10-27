// Kufas.ru  6.1.1.14
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Fourteen {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.pow(2, -x) - Math.cos(x) + Math.sin(2 * x * y);

		System.out.println("Result: " + rez);
	}
}
