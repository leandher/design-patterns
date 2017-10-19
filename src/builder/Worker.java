package builder;

import java.util.ArrayList;

public class Worker {
	
	Pedido pedido = new Pedido();
	PatternBurgersDirector director;
	
	public Worker(PatternBurgersDirector director) {
		super();
		this.director = director;
	}

	public void generateRequest(ArrayList<String> pedido){
		for(String s:pedido){
			if(s.equals("Cheeseburguer") || s.equals("Hamburguer")){
				this.pedido.adicionarDentroDaCaixa(s);
				
			} else if(s.equals("Small French Fries") || s.equals("Medium French Fries") || s.equals("Large French Fries")){
				this.pedido.adicionarDentroDaCaixa(s);
				
			} else if(s.equals("Coca") || s.equals("Guarana")){
				this.pedido.adicionarForaDaCaixa(s);
				
			} else if(s.equals("Car Doll") || s.equals("Female Doll")){
				this.pedido.adicionarDentroDaCaixa(s);
			}
		}
	}

	public Pedido getPedido() {
		return pedido;
	}
	
	
}
