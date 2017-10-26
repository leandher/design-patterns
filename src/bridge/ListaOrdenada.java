package bridge;

import java.util.Collections;

public class ListaOrdenada extends Lista{
	
	public ListaOrdenada(Implementador impl) {
		super(impl);
	}

	@Override
	public void adicionar(String s) {
		list.add(s);
		Collections.sort(list);
		
	}

}
