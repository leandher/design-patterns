package builder;

public abstract class FrenchFriesBuilder {
	
	public FrenchFries frenchFries;
	
	public FrenchFriesBuilder(){
		frenchFries = new FrenchFries();
	}
	
	public abstract void buildPrice();
	
	public abstract void buildSize();
	
	public FrenchFries getFrenchFries(){
		return frenchFries;
	}
	



	

}
