// Kufas.ru 6.1.1.22
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class TwentyTwo {
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

		rez = Math.exp(x) - x - 2 + (1 + Math.pow(x, 2));

		System.out.println("Result: " + rez);
	}
}
