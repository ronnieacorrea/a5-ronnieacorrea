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
	
	public Ingredient getIngredient() {
		return ingredient;
	}

	
	public double getAmount() {
		return amount;
	
	}
	
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

	public String getName() {
		return ingredient.getName();
	}

	public double getCalories() {
		return ingredient.getCaloriesPerOunce() * amount;
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return ingredient.getPricePerOunce() * amount;
	}

	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return ingredient.getIsVegetarian();
	}

	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return ingredient.getIsRice();
	}

	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return ingredient.getIsShellfish();
	}
	}
