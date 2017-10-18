package command;

public class Joystick {
	
	private Command a;
	private Command b;
	
	public Joystick(Command a, Command b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void setCommands(Command a, Command b) {
		this.a = a;
		this.b = b;
	}
	
	public void acionarA() {
		this.a.execute();
	}
	
	public void acionarB() {
		this.b.execute();
	}
}
