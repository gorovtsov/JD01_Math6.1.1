// Kufas.ru  6.1.1.12
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Twelve {
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

		rez = (Math.pow(x, 2) - 7 * x + 10) / (Math.pow(x, 2) - 8 * x + 12);

		System.out.println("Result: " + rez);
	}
}
