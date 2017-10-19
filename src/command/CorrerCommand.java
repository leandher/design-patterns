package command;

public class CorrerCommand implements Command{

	private Futebol futebol = new Futebol();
	
	public CorrerCommand(Futebol futebol) {
		super();
		this.futebol = futebol;
	}



	@Override
	public void execute() {
		futebol.correr();
	}

}
