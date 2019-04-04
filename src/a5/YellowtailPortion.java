package a5;

// creating YellowtailPortion, subclass of IngredientImpl

public class YellowtailPortion extends IngredientPortionImpl implements IngredientPortion {
	private static Yellowtail yellowtail = new Yellowtail();
	private double amount;

	public YellowtailPortion(double amount) {
		super(yellowtail, amount);
	}


	/* combining two portions
	 * input - YellowtailPortion
	 * summing up amounts and returning combined YellowtailPortion
	 */
	public YellowtailPortion combine(YellowtailPortion other) {
		this.amount += other.getAmount();
		return this;
	}

}
