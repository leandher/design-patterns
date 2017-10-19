package templateMethod;

public class ScannerLowerCase extends ScannerTemplate{

	@Override
	public void transformar() {
		super.string = super.string.toLowerCase();
		System.out.println(super.string);
	}
}