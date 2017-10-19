package abstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PizzariaFactory fabrica = null;
		System.out.println("Bem vindo!");
		System.out.println("Qual cliente que deseja fazer o pedido? 1 ou 2?");
		int escolhaCliente = s.nextInt();
		
		if(escolhaCliente == 1){
			fabrica = new PizzaPrimeiroClienteFactory();
		} else if(escolhaCliente == 2){
			fabrica = new PizzaSegundoClienteFactory();
		}
		
		System.out.println("Qual a data do pedido?");
		String data = s.next();
		
		Pizzaiolo pizzaiolo = new Pizzaiolo(data);
		pizzaiolo.calculateTheDayOfPizzaiolo();
		
		if(pizzaiolo.getTypeOfDay() == 1){
			Calabresa pizzaCalabresa = fabrica.criarPizzaCalabresa();
			pizzaCalabresa.exibirIngredientesCalabresa();
		} else if(pizzaiolo.getTypeOfDay() == 2){
			Presunto pizzaPresunto = fabrica.criarPizzaPresunto();
			pizzaPresunto.exibirIngredientesPresunto();
		} else if(pizzaiolo.getTypeOfDay() == 3){
			System.out.println("Domingo! Nada criado");
		}
		
		s.close();
		
	}

}
