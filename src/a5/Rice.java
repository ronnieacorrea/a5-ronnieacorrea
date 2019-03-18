package a5;

	// creating Rice, subclass of IngredientImpl

public class Rice extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;


	public Rice() {
		// call to superconstructor
		super("rice", 0.13, 34, true, true, false);
	}
 

}



