package composite;

public abstract class Participante  {
	protected String nome;
	
	public String getNome() {
		return nome;
	}
	
	public int getAssento() throws Exception{
		throw new Exception(this.nome+" não é um individuo");
	}
	
	public void adicionar(Participante participante) throws Exception{
		throw new Exception(this.nome+" não é uma Instituicao");
	}
	
	public void remover(Participante participante) throws Exception{
		throw new Exception(this.nome+" não é uma Instituicao");
	}
	
}
