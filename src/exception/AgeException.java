package exception;

public class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	public AgeException(String message, int age) {
		super(message);
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Your age " + this.age + " is not correct, a person cannot live more than " + this.age + " years";
	}
	
}
