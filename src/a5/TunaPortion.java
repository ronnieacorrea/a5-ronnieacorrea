package a5;

	// creating TunaPortion, subclass of IngredientPortionImpl

public class TunaPortion extends IngredientPortionImpl implements IngredientPortion {
	// initializing new static Ingredient
	private static Tuna tuna = new Tuna();
	private double amount;

	public TunaPortion(double amount) {
		super(tuna, amount);
	}

	/* combining two portions
	 * input - TunaPortion
	 * summing up amounts and returning initial TunaPortion
	 */

	public TunaPortion combine(TunaPortion other) {
		this.amount += other.getAmount();
	return this;
}

}
