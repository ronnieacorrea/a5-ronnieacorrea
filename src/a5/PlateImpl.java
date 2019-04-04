package a5;

public class PlateImpl implements Plate {

	// encapsulating variables and creating constructor
	private Sushi contents;
	private double price;
	private Color color;

	public PlateImpl(Sushi contents, double price, Color color) {
		this.contents = contents;
		this.price = price;
		this.color = color;
	}

	// getter for contents
	@Override
	public Sushi getContents() {
		return contents;
	}

	@Override 
	public Sushi removeContents() {
		Sushi prior_contents = contents; // storing initial contents
		if (contents == null) {
			return null;
		} else {
			contents = null; // removing initial contents
			return prior_contents;
		}
	}
	
	// checking if plate is empty 
	@Override 
	public boolean hasContents() {
		if (contents == null) {
			return false;
		} else {
			return true;
		}
	}

	// getter for price
	@Override 
	public double getPrice() {
		return price;
	}

	// getter for color
	@Override 
	public Color getColor() {
		return color;
	}
	
	// calculating profit from price, cost of contents
	@Override 
	public double getProfit() {
		if (contents == null) { 
			return 0.0; // no profit if plate is empty
		} else {
			double profit = price - contents.getCost();
			profit = Math.floor(profit * 100)/100; // rounding to two decimals
			return profit;
		}
	}

	/* setting contents to given input.
	 * throwing exception if input is null or if plate price is illegal
	 */
	@Override 
	public void setContents(Sushi s) throws PlatePriceException {
		if (s.equals(null)) {
			throw new IllegalArgumentException("sushi cannot be null");
		}
		if (price <= s.getCost()) {
			throw new PlatePriceException(price);
		}
		contents = s;
	}

}
