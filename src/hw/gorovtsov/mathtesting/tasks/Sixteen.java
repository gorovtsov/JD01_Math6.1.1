// Kufas.ru 6.1.1.16
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Sixteen {
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

		rez = Math.abs(Math.pow(x, 2) - Math.pow(x, 3)) - (7 * x) / (Math.pow(x, 3) - 15 * x);

		System.out.println("Result: " + rez);
	}
}
