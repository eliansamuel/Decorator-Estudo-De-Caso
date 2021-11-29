package starbuzzcoffe.tipos.cafes;

import starbuzzcoffe.Beverage;

public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaffeinated";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
