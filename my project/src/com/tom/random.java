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
		int min =1;
		int max=100;
		System.out.println(min + "to" + max + "Guess a number:");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		while(guess != secret) {
		if(guess>secret&&guess<=100) {
			max=guess;
		}
		else {
			min=guess;
		}
		System.out.println(min+"to"+max+"Guess a number:");
		guess = scanner.nextInt();
		}
        System.out.println("correct!");
		System.out.println(secret);
		
	}
}

