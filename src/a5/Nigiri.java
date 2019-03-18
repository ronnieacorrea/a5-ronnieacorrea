package a5;

// creating class Nigiri - 0.75 ounces of fish with 0.5 oz of rice

public class Nigiri implements Sushi {
	
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	private NigiriType type;
	private String name;
	private int calories;
	private double cost;
	private boolean hasRice;
	private boolean hasShellfish;
	private boolean isVegetarian;
	

	public Nigiri(NigiriType type) {
		this.type = type;
	}

	public String getName() {
		// convert type to string to get name
		return this.type.toString().toLowerCase() + " nigiri";
	}

	public IngredientPortion[] getIngredients() {
		/*
		 * creating array of ingredient portions
		 * first ingredient portion is type passed to constructor
		 * (0.75 oz)
		 * second ingredient portion is rice (0.5 oz)
		 */
	IngredientPortion[] arr = new IngredientPortion[2];
	arr[0] = new RicePortion(0.5);
	if (this.type.equals(type.TUNA)) {
		arr[1] = new TunaPortion(0.75);
	}
	if (this.type.equals(type.YELLOWTAIL)) {
		arr[1] = new YellowtailPortion(0.75);
	}
	if (this.type.equals(type.EEL)) {
		arr[1] = new EelPortion(0.75);
	}
	if (this.type.equals(type.CRAB)) {
		arr[1] = new CrabPortion(0.75);
	}
	if (this.type.equals(type.SHRIMP)) {
		arr[1] = new ShrimpPortion(0.75);
	}
	return arr;
	}


	public int getCalories() {
		// initializing calorie count 
		int calories = 0;
		RicePortion rice = new RicePortion(0.5);
		// calculating calories of fish, rounding to int
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
		// adding calories of rice to calories of fish
		calories += (int) Math.round(rice.getCalories());
		return calories;
	}

	public double getCost() {
		/* 
		 * initializing total cost
		 * going through to determine type in constructor
		 * then, finding total cost based on ounces given
		 */
		double cost = 0;
		RicePortion rice = new RicePortion(0.5);
		if (this.type.equals(type.TUNA)) {
			Ingredient Tuna = new Tuna();
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
		// adding cost of rice to cost of fish
		cost += rice.getCost();
		return cost;
	}


	public boolean getHasRice() {
		return true; // all Nigiri has rice
	}

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

	public boolean getIsVegetarian() {
		return false; // not vegetarian - has fish
	}

}
