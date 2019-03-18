package a5;

import java.util.ArrayList;
import java.util.Arrays;

// creating class Roll

public class Roll implements Sushi {
	private String name;
	private IngredientPortion[] roll_ingredients;

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		if (roll_ingredients == (null)) {
			throw new RuntimeException("ingredients cannot be null");
		}
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i] == (null)) {
				throw new RuntimeException("ingredient cannot be null");
			}
		}
		this.name = name;
		ArrayList<IngredientPortion> ingredientList = new ArrayList<IngredientPortion>();

		for (int i = 0; i < roll_ingredients.length; i++) {
			// check if list already contains roll_ingredients[i]
			int index = ingredientIndexOf(ingredientList, roll_ingredients[i].getIngredient());
			if (index == -1) {
				ingredientList.add(roll_ingredients[i]);
			} else {
				// combining that index with w/e else is found in array
				ingredientList.set(index, roll_ingredients[i].combine(ingredientList.get(index)));
			}
		}
		// going through combined list and adding seaweed if not there
		Seaweed s = new Seaweed();
		for (int i = 0; i < roll_ingredients.length; i++) {
			int index = ingredientIndexOf(ingredientList, s);
			if (index == -1) {
				ingredientList.add(new SeaweedPortion(0.1));
			} else {
				// checking amount of seaweed if it does exist
				IngredientPortion ing = ingredientList.get(index);
				if (ing.getAmount() < 0.1) {
					// add enough seaweed so that amount is at least 0.1
					ingredientList.set(index, new SeaweedPortion(0.1));
				}
			}
		}
		// putting list back into array
		this.roll_ingredients = new IngredientPortion[ingredientList.size()];
		this.roll_ingredients = ingredientList.toArray(this.roll_ingredients);

	}

	// additional method to see index of ingredient portion in array list
	public int ingredientIndexOf(ArrayList<IngredientPortion> ingredients, Ingredient ing) {
		int temp = -1; // assuming ingredient not in array
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredients.get(i).getIngredient().equals(ing)) {
				// returns index 
				temp = i;
			}
		}
		return temp;
	}

	public String getName() {
		return name; // returns given name 
	}

	public IngredientPortion[] getIngredients() {
		// return copy of ingredient portion array passed to constructor
		return Arrays.copyOf(roll_ingredients, roll_ingredients.length);
	}

	public int getCalories() {
		/*
		 * going through array of roll ingredient portions
		 * adding up calories for each portion
		 */
		double calories = 0;
		for (int i = 0; i < roll_ingredients.length; i++) {
			calories += roll_ingredients[i].getCalories();
		}
		// rounding to next integer 
		calories = Math.floor(calories + 0.5);
		return (int) (calories);

	}

	public double getCost() {
		/*
		 * going through array of roll ingredient portions
		 * adding up cost for each portion
		 */
		double cost = 0;
		for (int i = 0; i < roll_ingredients.length; i++) {
			cost += roll_ingredients[i].getCost();
		}
		// round to two decimal places
		cost = Math.round(cost * 100.0) / 100.0;
		return cost;
	}

	public boolean getHasRice() {
		/*
		 * going through array of roll ingredient portions
		 * if one ingredient is rice, returns true
		 */
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsRice()) {
				return true;
			}
		}
		return false;
	}

	public boolean getHasShellfish() {
		/*
		 * going through array of roll ingredient portions
		 * if one ingredient is shellfish, returns true
		 */
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	public boolean getIsVegetarian() {
		/*
		 * going through array of roll ingredient portions
		 * if one ingredient is not vegetarian, returns false
		 */
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (!roll_ingredients[i].getIsVegetarian()) {
				return false;
			}
		}
		return true;
	}
}
