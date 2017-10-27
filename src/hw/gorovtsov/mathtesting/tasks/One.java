// Kufas.ru  6.1.1.1
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.*;


public class One {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double[] vars = new double[3];

		double rez;

		NumSetThree s = new NumSetThree();
		vars = s.go();

		a = vars[0];
		b = vars[1];
		c = vars[2];

		rez = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
		rez = rez - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Result: " + rez);
	}
}
