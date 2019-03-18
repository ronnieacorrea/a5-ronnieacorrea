package a5;

import a5.Plate.Color;

/*subclass RedPlate
 * initializing plate as empty
 * initializing proper values for price, color
 * call to super
 */

public class RedPlate extends PlateImpl implements Plate {

	private Sushi contents = null;
	private static double price = 1.0;
	private static Color color = Color.RED;

	public RedPlate(Sushi contents) {
		super(contents, price, color);
	}

}
