package command;

public class AcelerarCommand implements Command{
	private Corrida corrida = new Corrida();
	
	public AcelerarCommand(Corrida corrida) {
		super();
		this.corrida = corrida;
	}



	@Override
	public void execute() {
		corrida.acelerar();
	}
	
	
}
