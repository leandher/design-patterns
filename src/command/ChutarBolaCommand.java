package command;

public class ChutarBolaCommand implements Command{

	private Futebol futebol = new Futebol();
	
	public ChutarBolaCommand(Futebol futebol) {
		super();
		this.futebol = futebol;
	}

	@Override
	public void execute() {
		futebol.chutarBola();		
	}

}
