package exception;

import main.Main;

public class DateIdentificationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int date;
	
	public DateIdentificationException(String message, int date) {
		super(message);
		this.date = date;
	}
	@Override
	public String toString() {
		return "The year is wrong, the current year is "+ Main.CURRENT_YEAR + " and your expiry date is " + this.date + ", it is older, renew your personal id";
	}
}
