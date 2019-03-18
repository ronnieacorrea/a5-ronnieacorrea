package a5;

//creating interface for Plate with required methods 

public interface Plate {
	
	public enum Color {
		RED, GREEN, BLUE, GOLD
	};

	Sushi getContents();

	Sushi removeContents();

	void setContents(Sushi s) throws PlatePriceException;

	boolean hasContents();

	double getPrice();

	Plate.Color getColor();

	double getProfit();
}
