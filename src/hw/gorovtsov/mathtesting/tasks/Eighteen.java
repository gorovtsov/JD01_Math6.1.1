// Kufas.ru  Задание 6.1.1.18
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Eighteen {
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

		rez = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));

		System.out.println("Result: " + rez);
	}
}
