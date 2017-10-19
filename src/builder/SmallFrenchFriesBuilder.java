package builder;

public class SmallFrenchFriesBuilder extends FrenchFriesBuilder {

	@Override
	public void buildPrice() {
		frenchFries.price = 3;
		
	}

	@Override
	public void buildSize() {
		frenchFries.size = "Small French Fries";
		
	}

}
