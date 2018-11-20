package com.tom;

public class Student {
	String name;
	int math;
	int english;

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;

	}

	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + highest() + "\t" + getGrading() + "\t");
		if (getAverage() < 60) {
			System.out.print("FAILED");
		} else {
			System.out.print("PASS");
		}
	}

	public int getAverage() {
		return (english + math) / 2;

	}

	public int highest() {
		if (english > math) {
			return english;

		} else {
			return math;
		}
	}
public char getGrading(){
	int average = getAverage();
	char grading = 'F';
	switch(average/10){
	case 10:
	case 9:
		grading = 'A';
		break;
	case 8:
		grading ='B';
		break;
	case 7:
		grading = 'C';
		break;
	case 6:
		grading = 'D';
		break;
	default:
		grading = 'F';
	
	}
	return grading;
}
}
