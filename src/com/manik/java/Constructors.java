package com.manik.java;

class Program {
	int value;
	String tax;

	public Program() {
		this(4);
		System.out.println("First Constructors");

		value = 12;
	}

	public Program(int value) {
		this.value = value;
		System.out.println("Second Constructor");
	}

	public Program(int value, String tax) {
		this();
		this.value = value;
		this.tax = tax;

		System.out.println("Third Constructor");
	}

}

public class Constructors {

	public static void main(String[] args) {

		Program myProgram = new Program();

		Program myProgram1 = new Program(23);

		Program myProgram2 = new Program(10, "IT");
	}

}
