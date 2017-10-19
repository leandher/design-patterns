package builder;

public class MediumFrenchFriesBuilder extends FrenchFriesBuilder {

	@Override
	public void buildPrice() {
		frenchFries.price = 6;
		
	}

	@Override
	public void buildSize() {
		frenchFries.size = "Medium French Fries";
		
	}
}
