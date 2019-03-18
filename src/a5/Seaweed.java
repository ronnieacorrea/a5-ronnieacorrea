package a5;


public class Seaweed extends IngredientImpl implements Ingredient {
	private String name; 
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;


	public Seaweed() {
		super("seaweed", 2.85, 105, true, false, false);
	}
	

}





