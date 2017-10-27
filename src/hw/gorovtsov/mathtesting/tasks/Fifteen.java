// Kufas.ru 6.1.1.15
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Fifteen {
	public static void main(String[] args) {
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Enter x: ");
		}
		x = sc.nextInt();
		sc.close();

		double rez;

		rez = 2 * (1 / Math.tan(3 * x)) - 1 / (12 * Math.pow(x, 2) + 7 * x - 5);

		System.out.println("Result: " + rez);
	}
}
