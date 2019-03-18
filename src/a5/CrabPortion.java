package a5;

	// creating CrabPortion, subclass of IngredientPortionImpl

public class CrabPortion extends IngredientPortionImpl implements IngredientPortion {
	private static Crab crab = new Crab();
	private double amount;

	public CrabPortion(double amount) {
		super(crab, amount);
	}
	/* combining two portions
	 * input - CrabPortion
	 * summing up amounts and returning initial CrabPortion
	 */
	public CrabPortion combine(CrabPortion other) {
		this.amount += other.getAmount();
		return this;
}

}
