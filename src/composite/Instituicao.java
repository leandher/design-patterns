package composite;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante{

	List<Participante> membros = new ArrayList<Participante>();
	
	public Instituicao(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionar(Participante participante){
		membros.add(participante);
	}
	
	public void remover(Participante participante){
		membros.remove(participante);
	}
	
	public void imprimeMembros() throws Exception{
		System.out.println("Participantes da Instituicao "+this.nome);
		for(Participante p : membros){
			System.out.println(p.getNome()+" - "+p.getAssento());
		}
	}
}