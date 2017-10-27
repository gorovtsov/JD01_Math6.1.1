// Kufas.ru 6.1.1.21
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class TwentyOne {
	public static void main(String[] args) {
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enterå x: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter x: ");
		}
		x = sc.nextInt();
		sc.close();

		double rez;

		rez = 2 * (1 / Math.tan(3 * x)) - Math.log10(Math.cos(x)) / Math.log10(1 + Math.pow(x, 2));

		System.out.println("Result: " + rez);
	}
}
