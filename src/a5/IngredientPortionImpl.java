package a5;


public class IngredientPortionImpl implements IngredientPortion {
	private Ingredient ingredient;
	private double amount;

	
	/*this constructor should only take in an ingredient and an amount
	 *and this class should only encapsulate an ingredient and an amount*/

	public IngredientPortionImpl(Ingredient ingredient, double amount) {
		this.ingredient = ingredient;
		this.amount = amount;
		if (amount <= 0) {
			throw new RuntimeException("amount must be positive");
		}
		
	}
	
	@Override 
	public Ingredient getIngredient() {
		return ingredient; // returns given ingredient 
	}

	@Override 
	public double getAmount() {
		return amount; //returns amount 
	
	}
	
	@Override 
	/* sums amounts of identical ingredients 
	 * input: ingredient that is same as this
	 * output: new ingredient portion with combined amounts
	 */
	public IngredientPortion combine(IngredientPortion other) {
		double temp = 0.0;
		if (!this.getIngredient().equals(other.getIngredient())) {
			throw new RuntimeException("must be same Ingredient");
		}
		if (this.getIngredient().equals(other.getIngredient())) {
			temp = this.amount + other.getAmount();	
		}
		return new IngredientPortionImpl(ingredient, temp); 
	}

	@Override 
	public String getName() {
		return ingredient.getName(); // returns ingredient's name
	}

	@Override 
	// returns ingredient's amount
	public double getCalories() {
		return ingredient.getCaloriesPerOunce() * amount; 
	}

	@Override 
	// returns ingredient's cost 
	public double getCost() {
		return ingredient.getPricePerOunce() * amount;
	}

	@Override 
	// returns if ingredient is vegetarian
	public boolean getIsVegetarian() {
		return ingredient.getIsVegetarian();
	}

	@Override
	// returns if ingredient is rice
	public boolean getIsRice() {
		return ingredient.getIsRice();
	}

	@Override 
	// returns if ingredient is shellfish
	public boolean getIsShellfish() {
		return ingredient.getIsShellfish();
	}
	}
