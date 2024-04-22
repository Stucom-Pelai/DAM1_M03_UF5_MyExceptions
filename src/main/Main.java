package main;

import java.time.Year;
import java.util.Scanner;

import exception.AgeException;
import exception.DateIdentificationException;
import model.Person;

public class Main {

	public static final int CURRENT_YEAR = Year.now().getValue();

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		try {
			// age validation
			System.out.println("Give me your age: ");
			int age = sc.nextInt();
			Person p = new Person(age);
			
			try {
				// date of expiry validation
				System.out.println("Give me your expiry date of your personal Id ");
				int expiryDate = sc.nextInt();
				p.setExpiryDateId(expiryDate);
				System.out.println("Your data are correct!");
			} catch (DateIdentificationException e) {
				System.out.println(e.getMessage());
			}
		} catch (AgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			sc.close();			
		}
	}

}
