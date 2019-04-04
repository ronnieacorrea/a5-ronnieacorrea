package a5;

public class BluePlate extends PlateImpl implements Plate {

	/* subclass BluePlate.
	 * initializing plate as empty
	 * initializing proper values for price, color
	 * calling to super constructor
	 */

	private Sushi contents = null;
	private static double price = 4.0;
	private static Color color = Color.BLUE;

	public BluePlate(Sushi contents) throws PlatePriceException {
		super(contents, price, color);
	}

}
