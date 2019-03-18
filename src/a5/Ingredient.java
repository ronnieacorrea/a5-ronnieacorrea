package a5;

	// creating interface Ingredient

public interface Ingredient {
	
	String getName();

	double getCaloriesPerDollar();

	int getCaloriesPerOunce();

	double getPricePerOunce();

	boolean equals(Ingredient other);

	boolean getIsVegetarian();

	boolean getIsRice();

	boolean getIsShellfish();

}
