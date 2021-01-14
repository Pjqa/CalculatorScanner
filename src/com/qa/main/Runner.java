package com.qa.main;

import java.util.Scanner;

public class Runner {
	
	static Scanner numb = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Calculator.test();
		
		numb.close();
		System.out.println("\nALL GONE");


	}

}
