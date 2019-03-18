package a5;

	// creating EelPortion, subclass of IngredientPortionImpl

public class EelPortion extends IngredientPortionImpl implements IngredientPortion {
	private static Eel eel = new Eel();
	private double amount;

	public EelPortion(double amount) {
		super(eel, amount);
		
	}

	/* combining two portions
	 * input - EelPortion
	 * summing up amounts and returning initial EelPortion
	 */
	public EelPortion combine(EelPortion other) {
		this.amount += other.getAmount();
	return this;
}

}
