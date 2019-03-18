package a5;

// creating SeaweedPortion, subclass of IngredientPortionImpl

public class SeaweedPortion extends IngredientPortionImpl implements IngredientPortion {
	// initializing new static Ingredient
	private static Seaweed seaweed = new Seaweed();
	private double amount;

	public SeaweedPortion(double amount) {
		super(seaweed, amount);
	}

	/*
	 * combining two portions 
	 * input - SeaweedPortion summing up amounts and
	 * returning combined SeaweedPortion
	 */

	public SeaweedPortion combine(SeaweedPortion other) {
		this.amount += other.getAmount();
		return this;
	}

}
