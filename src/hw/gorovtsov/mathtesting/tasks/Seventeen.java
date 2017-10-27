// Kufas.ru  6.1.1.17
package hw.gorovtsov.mathtesting.tasks;

import hw.gorovtsov.mathtesting.input.NumSetTwo;

public class Seventeen {
	public static void main(String[] args) {

		double x;
		double y;
		double[] vars = new double[2];

		double rez;

		NumSetTwo s = new NumSetTwo();
		vars = s.go();

		x = vars[0];
		y = vars[1];

		rez = Math.log10((y - Math.sqrt(Math.abs(x)) * (x - y / (x + Math.pow(x, 2) / 4))));

		System.out.println("Result: " + rez);
	}
}
