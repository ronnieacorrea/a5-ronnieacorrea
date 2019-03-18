package a5;

public class GreenPlate extends PlateImpl implements Plate {
	
	/* subclass GreenPlate
	 * initializing plate as empty
	 * initializing proper values for price, color
	 * calling to super constructor
	 */
	
	private Sushi contents = null;
	private static double price = 2.0;
	private static Color color = Color.GREEN;

	public GreenPlate(Sushi contents) {
		super(contents, price, color);
	}

}
