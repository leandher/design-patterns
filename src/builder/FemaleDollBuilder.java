package builder;

public class FemaleDollBuilder extends DollBuilder {

	@Override
	public void buildPrice() {
		doll.price = 8;
		
	}

	@Override
	public void buildDoll() {
		doll.dollType = "Female Doll";
	}
}
