package a5;

public class GoldPlate extends PlateImpl implements Plate {
	
	/* creating subclass GoldPlate.
	 * initializing plate as empty
	 * initializing proper values for price, color
	 * calling to super constructor
	 */
	
	private Sushi contents = null;
	private static double price = 5.0;
	private static Color color = Color.GOLD;

	public GoldPlate(Sushi contents, double price) throws PlatePriceException {
		super(contents, price, color);
		if (price < 5.0) {
			throw new IllegalArgumentException("illegal price");
		}
	}

}
