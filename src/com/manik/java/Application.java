package com.manik.java;

class Student{
	
	public String name;
	public static String studentClass;
	
	public void studentName() {
		System.out.println(name);
	}
	
}


public class Application {

	public static void main(String[] args) {
		Student.studentClass = "Java Developer";
		System.out.println(Student.studentClass);
		
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "Manik";
		student2.name = "Sagar";
		
		student1.studentName();
		student2.studentName();
		
		
	}

}
