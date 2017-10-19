package composite;

public class Individuo extends Participante {
	private int assento;

	public Individuo(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}
	
	
}
