package templateMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String string = input.nextLine();
		ScannerTemplate t = new ScannerUpperCase();
		t.setString(string);
		t.printString();
		t = new ScannerLowerCase();
		t.setString(string);
		t.printString();
		t = new ScannerDuplicate();
		t.setString(string);
		t.printString();
		t = new ScannerInverse();
		t.setString(string);
		t.printString();
	}

}
