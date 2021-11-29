package starbuzzcoffe;

public abstract class Beverage {
	
	protected String description = "Bebida Desconhecida";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
