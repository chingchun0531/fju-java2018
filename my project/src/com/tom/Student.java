package com.tom;

public class Student {
String name;
int math;
int english;

public Student(String name, int english, int math){
	this.name = name;
	this.english = english;
	this.math = math;
	
}
public void print(){
	System.out.println(name + "\t" + english + "\t" + math + "\t" + (math+english)/2);
	
}

}
