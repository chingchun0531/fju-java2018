package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("*" + line + "*");
		boolean adult = line.toUpperCase().equals("Y");
		if (adult){
			System.out.println("Your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Your name?");
			String name = scanner.nextLine();
			System.out.println("Your nick name?");
			String nickname = scanner.nextLine();
			System.out.println(age + "/" + name + "/" + nickname);
			
		}
		else {
			System.out.println("xxxxxx, bye");
			
		}
		
	}

}
