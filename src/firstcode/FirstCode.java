package firstcode;

/**
 * This is our first coding thingee.
 * @author KENME
 *
 */
public class FirstCode {
	public static void main(String[] args) {
		System.out.println("This is " + "way" + " to cool!");
		
		int myAge = 40;
		double cashAvailable = 82.00;
		
		// This turns the double into a decimal with 2 places
		String cash = String.format("%.2f", cashAvailable);
		
		
		
		System.out.println("My age is " + myAge);
		System.out.println("My cash = " + cash);
		
	}
}
