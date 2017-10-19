package builder;

public abstract class SodaBuilder {

	public Soda soda;
	
	public SodaBuilder(){
		soda = new Soda();
	}
	
	public abstract void buildPrice();
	
	public abstract void buildFlavor();
	
	public Soda getSoda(){
		return soda;
	}

}
