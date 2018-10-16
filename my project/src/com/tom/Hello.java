package com.tom;

public class Hello {
	
	public static void main(String[] args) {
		Student stu = new Student("Hank", 70, 90);
		stu.print();
		
		System.out.println(3 <= 5);
		String s = new String("abc");
		System.out.println(s);
		String s2 = new String("abc");
		System.out.println(s.equals(s2));
		
		System.out.println("Hello world");

		Person p = new Person(50f, 1.53f);
		// p.weight = 50f;
		// p.height = 1.53f;
		System.out.println(p.bmi());
		p.hello();
		Person hank = new Person(65.5f, 1.7f);
		// hank.weight = 65.5f;
		// hank.height = 1.7f;
		System.out.println(hank.bmi());
		// Person jack = null;
		// jack.hello();

		/* 
		 * int age = 18; float weight = 50f; float height = 1.53f;
		 * System.out.println(age); System.out.println(weight);
		 * System.out.println(height);
		 */

	}

}
