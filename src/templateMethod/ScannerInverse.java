package templateMethod;

public class ScannerInverse extends ScannerTemplate{

	@Override
	public void transformar() {
		super.string = new StringBuilder(super.string).reverse().toString();
		System.out.println(super.string);
	}

}
