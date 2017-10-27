// Kufas.ru  6.1.1.24
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class TwentyFour {
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

		rez = x - 10 * Math.sin(x) + Math.abs(Math.pow(x, 4) - Math.pow(x, 5));

		System.out.println("Result: " + rez);
	}
}
