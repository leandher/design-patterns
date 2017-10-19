package builder;

public class HamburguerBuilder extends SandwichBuilder {

	@Override
	public void buildPrice() {
		sandwich.price = 10;
		
	}

	@Override
	public void buildType() {
		sandwich.type = "Hamburguer";
		
	}
 
}
