package a5;

	// creating Shrimp, subclass of IngredientImpl

public class Shrimp extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Shrimp() {
		// call to super constructor
		super("shrimp", 0.65, 32, false, false, true);
	}

}
