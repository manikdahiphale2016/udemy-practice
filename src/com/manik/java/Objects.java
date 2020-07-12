package com.manik.java;

class Methods{
	
	String animal;
	int value;
	int month;
	void run() {
		System.out.println("Running");
		System.out.println("My"+animal+"is "+value+"years old.");
	}
	int calculateMonthsToBirthday() {
		int monthsLeft = 12 - month;
		return monthsLeft;
	}
	
	void walk (int speed) {
		System.out.println("walking"+speed+"KM per hour");
	}
}
public class Objects {

	public static void main(String[] args) {
		Methods name = new Methods();
		name.animal= "Cat";
		name.value = 9;
		name.run();
		
		name.month = 8;
		int monthsLeft = name.calculateMonthsToBirthday();
		System.out.println(monthsLeft);
	}

}
