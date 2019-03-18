package a5;

// creating AvocadoPortion, subclass of IngredientPortionImpl

public class AvocadoPortion extends IngredientPortionImpl implements IngredientPortion {
	// initializing static Ingredient, calling to super
	private static Avocado avocado = new Avocado();
	private double amount;
	public AvocadoPortion(double amount) {
		super(avocado, amount); 
		
	}
	
	/* combining two portions
	 * input - AvocadoPortion
	 * summing up amounts and returning initial AvocadoPortion
	 */
	public AvocadoPortion combine(AvocadoPortion other) {
			this.amount += other.getAmount();
		return this;
	}
	
}
	
