package builder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Worker worker = null;
		Cliente client = null;
		ArrayList<String> pedido = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		PatternBurgersDirector director = null;
		int cont = 0;
		
		do{
		System.out.println("Qual item você deseja?");
		System.out.println("1 - Hamburguer");
		System.out.println("2 - Cheeseburguer");
		System.out.println("3 - Coca");
		System.out.println("4 - Guarana");
		System.out.println("5 - Female Doll");
		System.out.println("6 - Car");
		System.out.println("7 - Small French Fries");
		System.out.println("8 - Medium French Fries");
		System.out.println("9 - Large French Fries");
		
		int escolha = scanner.nextInt();
		
		if(escolha == 1){
			director = new PatternBurgersDirector(new HamburguerBuilder());
			director.constructSandwich();
			Sandwich sandwich = director.getSandwich();
			pedido.add(sandwich.type);
			
		} else if(escolha == 2){
			director = new PatternBurgersDirector(new CheeseBurgerBuilder());
			director.constructSandwich();
			Sandwich sandwich = director.getSandwich();
			pedido.add(sandwich.type);
			
		} else if(escolha == 3){
			director = new PatternBurgersDirector(new CocaBuilder());
			director.constructSoda();
			Soda soda = director.getSoda();
			pedido.add(soda.flavor);
			
		} else if(escolha == 4){
			director = new PatternBurgersDirector(new GuaranaBuilder());
			director.constructSoda();
			Soda soda = director.getSoda();
			pedido.add(soda.flavor);
			
		} else if(escolha == 5){
			director = new PatternBurgersDirector(new CarBuilder());
			director.constructDoll();
			Doll doll = director.getDoll();
			pedido.add(doll.dollType);
			
		} else if(escolha == 6){
			director = new PatternBurgersDirector(new FemaleDollBuilder());
			director.constructDoll();
			Doll doll = director.getDoll();
			pedido.add(doll.dollType);
			
		} else if(escolha == 7){
			director = new PatternBurgersDirector(new SmallFrenchFriesBuilder());
			director.constructFrenchFries();
			FrenchFries frenchFries = director.getFrenchFries();
			pedido.add(frenchFries.size);
			
		} else if(escolha == 8){
			director = new PatternBurgersDirector(new MediumFrenchFriesBuilder());
			director.constructFrenchFries();
			FrenchFries frenchFries = director.getFrenchFries();
			pedido.add(frenchFries.size);
			
		} else if(escolha == 9){
			director = new PatternBurgersDirector(new LargeFrenchFriesBuilder());
			director.constructFrenchFries();
			FrenchFries frenchFries = director.getFrenchFries();
			pedido.add(frenchFries.size);
		}   
		
		worker = new Worker(director);
		client = new Cliente(worker);
		
		System.out.println("Deseja continuar? 1 ou 0");
		cont = scanner.nextInt();
		} while(cont == 1);
		
		client.makeRequest(pedido);
		System.out.println(client.getPedido().toString());
		
	}

}
