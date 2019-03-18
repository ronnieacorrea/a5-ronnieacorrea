package a5;

	// creating Eel, subclass of IngredientImpl

public class Eel extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Eel() {
		// call to super constructor
		super("eel", 2.15, 82, false, false, false);
	}
}


