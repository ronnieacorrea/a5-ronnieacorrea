package a5;

// creating Crab, subclass of IngredientImpl

public class Crab extends IngredientImpl implements Ingredient {
	private String name;
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Crab() {
		// call to super constructor
		super("crab", 0.72, 37, false, false, true);
	}

	
}
