// Kufas.ru 6.1.1.25
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class TwentyFive {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = x - Math.pow(10, Math.sin(x)) + Math.cos(x - y);

		System.out.println("Result: " + rez);
	}
}
