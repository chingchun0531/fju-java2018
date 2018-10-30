package com.tom;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		int a=1;
		while(a>0){
			System.out.println("ABCDE");
			a=a-1;
		}
		
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.print("Guess a number between 1 to 100 :");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
        
		System.out.println(secret);
		
		

	}

}
