package builder;

import java.util.ArrayList;

public class Cliente {
	
	private Worker worker;
	private Pedido pedido;
	
	public Cliente(Worker worker) {
		super();
		this.worker = worker;
	}

	public void makeRequest(ArrayList<String> pedido){
		worker.generateRequest(pedido);
		this.pedido = worker.getPedido();
	}

	public Pedido getPedido() {
		return pedido;
	}
	
	
}
