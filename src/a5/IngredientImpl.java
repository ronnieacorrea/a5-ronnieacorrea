package a5;

// creating class which implements Ingredient 

public class IngredientImpl implements Ingredient {

	private String name;
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	public IngredientImpl(String name, double pricePerOunce, int caloriesPerOunce, boolean isVegetarian, boolean isRice,
			boolean isShellfish) {
		this.name = name;
		this.pricePerOunce = pricePerOunce;
		this.caloriesPerOunce = caloriesPerOunce;
		this.isVegetarian = isVegetarian;
		this.isRice = isRice;
		this.isShellfish = isShellfish;
	}

	@Override 
	public String getName() {
		return name; // returns given name
	}

	@Override 
	public double getCaloriesPerDollar() {
		/*
		 * divides given calories by price result: calories per dollar
		 */
		return caloriesPerOunce / pricePerOunce;
	}

	@Override 
	public int getCaloriesPerOunce() {
		return caloriesPerOunce; // returns given calories per ounce
	}

	@Override 
	public double getPricePerOunce() {
		return pricePerOunce; // returns given price per ounce
	}

	@Override 
	public boolean equals(Ingredient other) {
		/*
		 * input - Ingredient 
		 * checking if name, calories per ounce and price (within
		 * 0.01) are equal if so, return true
		 */
		if (other.getName().equals(this.getName())) {
			if (other.getCaloriesPerOunce() == (this.getCaloriesPerOunce())) {
				if (Math.abs(other.getPricePerOunce() - this.getPricePerOunce()) < 0.01) {
					return true;
				}
			}
		}
		return false;
	}

	@Override 
	public boolean getIsVegetarian() {
		return isVegetarian; //returns true if is Vegetarian
	}

	@Override 
	public boolean getIsRice() {
		return isRice; // returns true if is Rice
	}

	@Override 
	public boolean getIsShellfish() {
		return isShellfish; // returns true if is Shellfish
	}

}
