package exam;

import java.util.Random;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
Random random = new Random();
int secret = random.nextInt(10)+1;
System.out.println("Your guess: ");
Scanner scanner = new Scanner(System.in);
int guess = scanner.nextInt();
while(guess!=secret){
	if(guess>secret&&guess<=10){
		System.out.println("lower");
		guess = scanner.nextInt();
	}
	else{
		System.out.println("higher");
		guess = scanner.nextInt();
	}
	if(count>2){
		System.out.println("Great ! The secret number is " + secret);
	}
	else{
		System.out.println("Excellent ! The secret number is " + secret);
	}
}
	}

}
