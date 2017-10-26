package bridge;

import java.util.List;

public class LetrasImpl implements Implementador{
	
	@Override
	public void imprimirLista(List<String> list) {
		char ch = 'A';
		for(String s: list) {
			System.out.println(ch+". "+s);
			ch++;
		}
	}
	
}