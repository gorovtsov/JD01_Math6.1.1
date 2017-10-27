package hw.gorovtsov.mathtesting.input;

import java.util.Scanner;

public class NumSetThree {
	public double[] go() {
		
		double[] setNums = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число a: ");
		}
		setNums[0] = sc.nextInt();
		
		System.out.println("Введите число b: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число b: ");
		}
		setNums[1] = sc.nextInt();
		
		System.out.println("Введите число c: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число c: ");
		}
		
		setNums[2] = sc.nextInt();
		
		sc.close();
		
		return setNums;
	}
}
