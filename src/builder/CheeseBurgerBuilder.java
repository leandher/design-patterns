package builder;

public class CheeseBurgerBuilder extends SandwichBuilder {

	@Override
	public void buildPrice() {
		sandwich.price = 12;
		
	}

	@Override
	public void buildType() {
		sandwich.type = "Cheeseburguer";
		
	}

}
