package builder;

public abstract class DollBuilder {

	public Doll doll;
	
	public DollBuilder(){
		doll = new Doll();
	}
	
	public abstract void buildPrice();
	
	public abstract void buildDoll();
	
	public Doll getDoll(){
		return doll;
	}

}
