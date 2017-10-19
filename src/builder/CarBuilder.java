package builder;

public class CarBuilder extends DollBuilder {

	@Override
	public void buildPrice() {
		doll.price = 5;
		
	}

	@Override
	public void buildDoll() {
		doll.dollType = "Car Doll";
		
	}

}
