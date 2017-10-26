package bridge;

public class ListaNaoOrdenada extends Lista{	
	
	public ListaNaoOrdenada(Implementador impl) {
		super(impl);
	}

	@Override
	public void adicionar(String s) {
		list.add(s);		
	}

}
