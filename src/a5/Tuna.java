package a5;

	// creating class Tuna, subclass of IngredientImpl

public class Tuna extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public Tuna() {
		// call to super constructor
		super("tuna", 1.67, 42, false, false, false);
	}
	
}
