package starbuzzcoffe;

import starbuzzcoffe.decorators.Mocha;
import starbuzzcoffe.decorators.Soy;
import starbuzzcoffe.decorators.Whip;
import starbuzzcoffe.tipos.cafes.Expresso;
import starbuzzcoffe.tipos.cafes.HouseBlend;

public class Main {

	public static void main(String[] args) {
		
		Beverage beverage = new Expresso();
		System.out.println("(" + beverage.getDescription() + ") Valor total = $ " + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("(" + beverage2.getDescription() + ") Valor total = $ " + beverage2.cost());

	}

}
