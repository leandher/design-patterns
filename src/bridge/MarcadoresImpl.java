package bridge;

import java.util.List;

public class MarcadoresImpl implements Implementador{
	
	@Override
	public void imprimirLista(List<String> list) {
		char ch = '!';
		for(String s: list) {
			System.out.println(ch+" "+s);
			ch++;
		}
	}
	
//	@Override
//	public void imprimirLista(List<String> list) {
//		for(String s: list) {
//			System.out.println("- "+s);
//		}
//	}
}