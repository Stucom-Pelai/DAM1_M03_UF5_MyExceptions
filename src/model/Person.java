package model;

import exception.AgeException;
import exception.DateIdentificationException;
import main.Main;

public class Person {
	private int age;
	private int expiryDateId;

	public Person(int age) throws AgeException{
		if (age < 0)
			throw new AgeException("The age is negative", age);
		if(age > 120)
			throw new AgeException("The age is more than limit allowed", age);

		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getExpiryDateId() {
		return expiryDateId;
	}

	public void setExpiryDateId(int date) throws DateIdentificationException {
		if (date < Main.CURRENT_YEAR)
			throw new DateIdentificationException("Date is older than current year", date);
		this.expiryDateId = date;
	}
}
