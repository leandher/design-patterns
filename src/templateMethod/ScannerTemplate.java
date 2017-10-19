package templateMethod;

public abstract class ScannerTemplate {
	protected String string;
	
	final void printString(){
		transformar();
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public abstract void transformar();
	
}
