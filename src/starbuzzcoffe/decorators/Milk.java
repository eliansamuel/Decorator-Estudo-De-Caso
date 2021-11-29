package starbuzzcoffe.decorators;

import starbuzzcoffe.Beverage;
import starbuzzcoffe.condimentos.CondimentDecorator;

public class Milk extends CondimentDecorator{
	
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + Milk";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
