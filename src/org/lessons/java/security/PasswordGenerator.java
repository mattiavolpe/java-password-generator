package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		System.out.print("Type your last name: ");
		String lastName = sc.nextLine();
		System.out.print("Type your favorite color: ");
		String color = sc.nextLine();
		System.out.print("Type your day of birth: ");
		byte day = sc.nextByte();
		System.out.print("Type your month of birth (number): ");
		byte month = sc.nextByte();
		System.out.print("Type your year of birth: ");
		short year = sc.nextShort();
		
		sc.close();
		
		int sum = day + month + year;
		
		System.out.println("Generated passowrd is: " + name + "-" + lastName + "-" + color + "-" + sum);
	}
}
