package command;

public class ChuteCommand implements Command{
	private Luta luta = new Luta();
	
	
	public ChuteCommand(Luta luta) {
		super();
		this.luta = luta;
	}


	@Override
	public void execute() {
		luta.chutar();
	}
}
