package command;

public class SocoCommand implements Command{
	private Luta luta = new Luta();
	
	
	public SocoCommand(Luta luta) {
		super();
		this.luta = luta;
	}


	@Override
	public void execute() {
		luta.socar();
	}

}
