package abstractFactory;

public class PizzaSegundoClienteFactory implements PizzariaFactory {

	@Override
	public Calabresa criarPizzaCalabresa() {
		return new PizzaCalabresa();
	}

	@Override
	public Presunto criarPizzaPresunto() {
		return new PizzaPresunto();
	}

}
