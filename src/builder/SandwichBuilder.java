package builder;

public abstract class SandwichBuilder {

	public Sandwich sandwich;
	
	public SandwichBuilder(){
		sandwich = new Sandwich();
	}
	
	public abstract void buildPrice();
	
	public abstract void buildType();
	
	public Sandwich getSandwich(){
		return sandwich;
	}

}
