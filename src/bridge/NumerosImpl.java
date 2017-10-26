package bridge;

import java.util.List;

public class NumerosImpl implements Implementador{

	@Override
	public void imprimirLista(List<String> list) {
		Integer i = 1;
		
		for(String s: list) {
			System.out.println(i+". "+s);
			i++;
		}
	}
	
}
