// Kufas.ru6.1.1.3
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Third {
	public static void main(String[] args) {
		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("Result: " + rez);
	}
}
