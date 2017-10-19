package mediator;

public class Aluno extends Pessoa {
	
	public Aluno(Mediator mediator, String name, String formation, String course) {
		super(mediator, name, formation, course);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("["+this.name+"-"+this.formation+
				"-"+this.course+"]"+" recebeu: "+mensagem);
		
	}

}
