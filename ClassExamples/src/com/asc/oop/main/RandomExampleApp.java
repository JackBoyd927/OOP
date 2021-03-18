package com.asc.oop.main;

import java.util.Scanner;

public class RandomExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inpt = "";
		String fName = "";
		String lName = "";
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the program \nPlease enter your name in the following format (first last)");
		
		inpt = sc.nextLine();
		
		// Jack Boyd
		fName = inpt.substring(0,4);
		System.out.println("First name is " + fName);
		
		System.out.println("new output xd");
	}

}
