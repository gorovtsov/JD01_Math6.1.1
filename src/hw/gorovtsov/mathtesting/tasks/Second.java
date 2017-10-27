// Kufas.ru  6.1.1.2
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.*;
;

public class Second {
	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double[] vars = new double[4];

		double rez;

		NumSetFour s = new NumSetFour();
		vars = s.go();

		a = vars[0];
		b = vars[1];
		c = vars[2];
		d = vars[3];

		rez = (a * b) / (c * d) - ((a * b - c) / (c * d));
		
		System.out.println("Result: " + rez);
	}
}
