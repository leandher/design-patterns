package bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {
	protected List<String> list = new ArrayList<String>();
	protected Implementador impl;
	
	public Lista(Implementador impl) {
		this.impl = impl;
	}
	
	public abstract void adicionar(String s);
	
	public void imprimir() {
		impl.imprimirLista(list);
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
