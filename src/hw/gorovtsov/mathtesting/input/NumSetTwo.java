package hw.gorovtsov.mathtesting.input;

import java.util.Scanner;

public class NumSetTwo {
	public double[] go() {

		double[] setNums = new double[4];

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число x: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число x: ");
		}
		setNums[0] = sc.nextInt();

		System.out.println("Введите число y: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число y: ");
		}
		setNums[1] = sc.nextInt();

		sc.close();

		return setNums;
	}
}
