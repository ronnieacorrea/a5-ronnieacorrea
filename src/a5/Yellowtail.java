package a5;

// creating Yellowtail, subclass of IngredientImpl

public class Yellowtail extends IngredientImpl implements Ingredient {
	private String name;
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Yellowtail() {
		// call to super constructor
		super("yellowtail", 0.74, 57, false, false, false);
	}

}
