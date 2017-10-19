package templateMethod;

public class ScannerDuplicate  extends ScannerTemplate{

	@Override
	public void transformar() {
		super.string= super.string+super.string;
		System.out.println(super.string);
	}
}