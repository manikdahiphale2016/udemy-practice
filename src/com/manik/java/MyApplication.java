package com.manik.java;

import java.util.Scanner;

public class MyApplication {

	public static void main(String[] args) {
		
		int number = 10;
		int[] numbers = new int[5];
		
		numbers[0] = 15;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
