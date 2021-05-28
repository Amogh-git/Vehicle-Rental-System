package com.rental.utils;
import java.util.Scanner;

public class IOUtility {

	static Scanner s = new Scanner(System.in);
	public static void displayMenu() {
		System.out.println("1.Add a vehicle\n2.Find a vehicle\n3.Book a vehicle.\n4.Unbook a vehicle.\n5.Exit\nEnter your choice");
	}
	public static int getIntegerInput() {
		return s.nextInt();
	}
	public static String getStringInput() {
		return s.next();
	}
}
