package a5;

public class PlatePriceException extends Exception {
	
	/*exception subclass 
	 * input: price 
	 * thrown if input price is greater than plate price
	 */
	
	private double illegal_price;
	
	public PlatePriceException(double price) {
		super("Illegal plate price");
		illegal_price = price;
	}
}
