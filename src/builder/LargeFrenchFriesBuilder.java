package builder;

public class LargeFrenchFriesBuilder extends FrenchFriesBuilder {

	@Override
	public void buildPrice() {
		frenchFries.price = 10;
		
	}

	@Override
	public void buildSize() {
		frenchFries.size = "Large French Fries";
		
	}
}
