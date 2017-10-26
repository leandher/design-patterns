package bridge;

public class Main {

	public static void main(String[] args) {
		Lista list = new ListaOrdenada(new NumerosImpl());
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");
		
		list = new ListaOrdenada(new MarcadoresImpl());
		
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");
		
		list = new ListaOrdenada(new LetrasImpl());
		
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");
		
		list = new ListaNaoOrdenada(new NumerosImpl());
		
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");

		list = new ListaNaoOrdenada(new MarcadoresImpl());
		
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");
		
		list = new ListaNaoOrdenada(new LetrasImpl());
		
		list.adicionar("Jon Snow");
		list.adicionar("Sansa");
		list.adicionar("Daenerys");
		list.adicionar("Arya");
		list.adicionar("Tyrion");
		list.adicionar("Cersei");
		list.adicionar("Nedd Stark");
		list.adicionar("Jaime Lannister");
		list.adicionar("Joffrey");
		list.adicionar("Ramsey");
		list.imprimir();
		System.out.println(" ");
	}

}
