// Kufas.ru 6.1.1.6
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Six {
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

		rez = x - Math.pow(x, 3) / 3 + Math.pow(x, 5) / 5;

		System.out.println("Result: " + rez);
	}
}
