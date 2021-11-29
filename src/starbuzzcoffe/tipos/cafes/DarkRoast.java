package starbuzzcoffe.tipos.cafes;

import starbuzzcoffe.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark Roast Coffe";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
