package builder;

public class PatternBurgersDirector {
	
	protected SandwichBuilder sandwichBuilder;
	protected FrenchFriesBuilder frenchFriesBuilder;
	protected SodaBuilder sodaBuilder;
	protected DollBuilder dollBuilder;
	
	public PatternBurgersDirector(SandwichBuilder sandwichBuilder){
		this.sandwichBuilder = sandwichBuilder;
	}
	
	public PatternBurgersDirector(FrenchFriesBuilder frenchFriesBuilder){
		this.frenchFriesBuilder = frenchFriesBuilder;
	}
	
	public PatternBurgersDirector(SodaBuilder sodaBuilder){
		this.sodaBuilder = sodaBuilder;
	}
	
	public PatternBurgersDirector(DollBuilder dollBuilder){
		this.dollBuilder = dollBuilder;
	}
	
	public void constructSandwich(){
		sandwichBuilder.buildPrice();
		sandwichBuilder.buildType();
	}
	
	public void constructSoda(){
		sodaBuilder.buildPrice();
		sodaBuilder.buildFlavor();
	}
	
	public void constructFrenchFries(){
		frenchFriesBuilder.buildPrice();
		frenchFriesBuilder.buildSize();
	}
	
	public void constructDoll(){
		dollBuilder.buildPrice();
		dollBuilder.buildDoll();
	}

	public Sandwich getSandwich(){
		return sandwichBuilder.sandwich;
	}
	
	public Soda getSoda(){
		return sodaBuilder.soda;
	}
	
	public Doll getDoll(){
		return dollBuilder.doll;
	}
	
	public FrenchFries getFrenchFries(){
		return frenchFriesBuilder.frenchFries;
	}
	
	
	
	
}
