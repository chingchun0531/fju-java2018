package com.tom;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		System.out.print("Enter temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		double f = c*(9/5.0)+32;
		System.out.printf("%.1f C = %.1f F",c ,f);
		

	}

}
