package a5;

// creating Sashimi - sushi with 0.75 ounces of fish 

public class Sashimi implements Sushi {

	public enum SashimiType {
		TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP
	};

	private SashimiType type;
	private String name;
	private int calories;
	private double cost;
	private boolean hasRice;
	private boolean hasShellfish;
	private boolean isVegetarian;

	public Sashimi(SashimiType type) {
		this.type = type;
	}

	@Override 
	public String getName() {
		// convert type to string to get name
		return this.type.toString().toLowerCase() + " sashimi";
	}

	@Override 
	public IngredientPortion[] getIngredients() { 
		// creating array with type passed into constructor
		IngredientPortion[] arr = new IngredientPortion[1];
		if (this.type.equals(type.TUNA)) {
			arr[0] = new TunaPortion(0.75);
		}
		if (this.type.equals(type.YELLOWTAIL)) {
			arr[0] = new YellowtailPortion(0.75);
		}
		if (this.type.equals(type.EEL)) {
			arr[0] = new EelPortion(0.75);
		}
		if (this.type.equals(type.CRAB)) {
			arr[0] = new CrabPortion(0.75);
		}
		if (this.type.equals(type.SHRIMP)) {
			arr[0] = new ShrimpPortion(0.75);
		}
		return arr;
	}

	@Override 
	public int getCalories() {
		// getting calories of type passed to constructor
		int calories = 0;
		if (this.type.equals(type.TUNA)) {
			Ingredient Tuna = new Tuna();
			calories = (int) Math.round(Tuna.getCaloriesPerOunce() * 0.75);
		}
		if (this.type.equals(type.YELLOWTAIL)) {
			Ingredient Yellowtail = new Yellowtail();
			calories = (int) Math.round(Yellowtail.getCaloriesPerOunce() * 0.75);
		}
		if (this.type.equals(type.EEL)) {
			Ingredient Eel = new Eel();
			calories = (int) Math.round(Eel.getCaloriesPerOunce() * 0.75);
		}
		if (this.type.equals(type.CRAB)) {
			Ingredient Crab = new Crab();
			calories = (int) Math.round(Crab.getCaloriesPerOunce() * 0.75);
		}
		if (this.type.equals(type.SHRIMP)) {
			Ingredient Shrimp = new Shrimp();
			calories = (int) Math.round(Shrimp.getCaloriesPerOunce() * 0.75);
		}

		return calories;
	}

	@Override 
	public double getCost() {
		// getting cost of type passed to constructor
		double cost = 0;
		if (this.type.equals(type.TUNA)) {
			Ingredient Tuna = new Tuna();
			// multiplying price per ounce by ounces in sashimi
			cost = Tuna.getPricePerOunce() * 0.75;
		}
		if (this.type.equals(type.YELLOWTAIL)) {
			Ingredient Yellowtail = new Yellowtail();
			cost = Yellowtail.getPricePerOunce() * 0.75;
		}
		if (this.type.equals(type.EEL)) {
			Ingredient Eel = new Eel();
			cost = Eel.getPricePerOunce() * 0.75;
		}
		if (this.type.equals(type.CRAB)) {
			Ingredient Crab = new Crab();
			cost = Crab.getPricePerOunce() * 0.75;
		}
		if (this.type.equals(type.SHRIMP)) {
			Ingredient Shrimp = new Shrimp();
			cost = Shrimp.getPricePerOunce() * 0.75;
		}
		return cost;
	}
	
	@Override 
	public boolean getHasRice() {
		return false; // sashimi has no rice
	}
	
	@Override 
	public boolean getHasShellfish() {
		// checking if type passed to constructor is shellfish
		if (this.type.equals(type.TUNA)) {
			Ingredient Tuna = new Tuna();
			return Tuna.getIsShellfish();
		}
		if (this.type.equals(type.YELLOWTAIL)) {
			Ingredient Yellowtail = new Yellowtail();
			return Yellowtail.getIsShellfish();
		}
		if (this.type.equals(type.EEL)) {
			Ingredient Eel = new Eel();
			return Eel.getIsShellfish();
		}
		if (this.type.equals(type.CRAB)) {
			Ingredient Crab = new Crab();
			return Crab.getIsShellfish();
		}
		if (this.type.equals(type.SHRIMP)) {
			Ingredient Shrimp = new Shrimp();
			return Shrimp.getIsShellfish();
		}
		return false;
	}

	@Override 
	public boolean getIsVegetarian() {
		return false; // sashimi is not vegetarian
	}

}
