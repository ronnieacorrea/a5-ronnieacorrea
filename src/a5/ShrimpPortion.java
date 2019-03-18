package a5;

// creating ShrimpPortion, subclass of IngredientPortionImpl

public class ShrimpPortion extends IngredientPortionImpl implements IngredientPortion {
	// initializing new static Ingredient
	private static Shrimp shrimp = new Shrimp();
	private double amount;

	public ShrimpPortion(double amount) {
		super(shrimp, amount);
	}

	/* combining two portions
	 * input - ShrimpPortion
	 * summing up amounts and returning combined ShrimpPortion
	 */
	
	public ShrimpPortion combine(ShrimpPortion other) {
		this.amount += other.getAmount();
	return this;
}
}
