package a5;

// creating RicePortion, subclass of IngredientPortionImpl

public class RicePortion extends IngredientPortionImpl implements IngredientPortion {
	// initializing new static Ingredient
	private static Rice rice = new Rice();
	private double amount;

	public RicePortion(double amount) {
		super(rice, amount);
	}
	
	/* combining two portions
	 * input - RicePortion
	 * summing up amounts and returning combined RicePortion
	 */
	public RicePortion combine(RicePortion other) {
		this.amount += other.getAmount();
	return this;
}

}
