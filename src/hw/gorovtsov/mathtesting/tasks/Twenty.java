// Kufas.ru  6.1.1.20
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Twenty {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = (1 + Math.sin(Math.sqrt(x + 1))) / Math.cos(12 * y - 4);

		System.out.println("Result: " + rez);
	}
}
