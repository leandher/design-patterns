package builder;

public class GuaranaBuilder extends SodaBuilder {

	@Override
	public void buildPrice() {
		soda.price = 5;
		
	}

	@Override
	public void buildFlavor() {
		soda.flavor = "Guarana";
	}
	
}
