package mediator;

public abstract class Pessoa {
	
	protected Mediator mediator;
	protected String name;
	protected boolean dentroDaSala = false;
	protected String formation;
	protected String course;
	
	public Pessoa(Mediator mediator, String name, String formation, String course) {
		super();
		this.mediator = mediator;
		this.name = name;
		this.formation = formation;
		this.course = course;
	}

	
	
	public boolean isDentroDaSala() {
		return dentroDaSala;
	}



	public void setDentroDaSala(boolean dentroDaSala) {
		this.dentroDaSala = dentroDaSala;
	}

	public void enviarMensagemEntreAlunos(String mensagem){
		mediator.enviarEntreAlunos(mensagem, this);
	}
	
	public abstract void receberMensagem(String mensagem);
}
