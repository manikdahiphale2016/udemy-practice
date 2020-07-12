package com.manik.inheritance;

public class Application {

	public static void main(String[] args) {

		Factory factory1 = new Factory();
		
		factory1.design();
		factory1.build();
		
		Car car1 = new Car();
		
		car1.design();
		car1.build();
		car1.brand();
		
	}

}
