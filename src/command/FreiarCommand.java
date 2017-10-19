package command;

public class FreiarCommand implements Command{
	private Corrida corrida = new Corrida();
	
	public FreiarCommand(Corrida corrida) {
		super();
		this.corrida = corrida;
	}



	@Override
	public void execute() {
		corrida.freiar();
	}
	
	
}
