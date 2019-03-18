package a5;

// creating Avocado, subclass of IngredientImpl

public class Avocado extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Avocado() {
		// call to super constructor
		super("avocado", 0.24, 42, true, false, false);
	}


}
