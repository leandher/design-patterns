package templateMethod;

public class ScannerUpperCase extends ScannerTemplate{

	@Override
	public void transformar() {
		super.string = super.string.toUpperCase();
		System.out.println(super.string);
	}
}
