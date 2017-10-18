package command;

public class Corrida {
	private int velocidade = 0;
	
	public void acelerar() {
		velocidade+=10;
		System.out.println("Acelerar");
		System.out.println(velocidade+"Km/h");
	}
	
	public void freiar() {
		velocidade-=10;
		System.out.println("Freiar");
		System.out.println(velocidade+"Km/h");
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	
}
