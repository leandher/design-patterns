package composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	String nome;
	Integer totalAssentos;
	List<Participante> participantes = new ArrayList<Participante>();
	
	public Congresso(String nome, Integer totalAssentos) {
		super();
		System.out.println("Criando congresso "+this.nome);
		this.nome = nome;
		this.totalAssentos = totalAssentos;
	}

	public Integer getTotalAssentos() {
		return totalAssentos;
	}
	
	public void adicionarParticipante(Participante participante){
		if(this.totalAssentos>0){
			if(participante instanceof Individuo){
				((Individuo) participante).setAssento(this.totalAssentos);
				System.out.println("Adicionando "+participante.getNome());
				participantes.add(participante);
				this.totalAssentos --;
			} else if(participante instanceof Instituicao){
				if(((Instituicao) participante).membros.size()<= this.totalAssentos){
					for(Participante p : ((Instituicao) participante).membros){
						((Individuo) p).setAssento(this.totalAssentos);
						this.totalAssentos --;
					}
					System.out.println("Adicionando "+participante.getNome());
					participantes.add(participante);
				} else {
					System.out.println("Instituição "+ participante.getNome() +" maior que o numero de vagas!");
				}
			}
		} else {
			System.out.println("Congresso sem vagas!");
		}
	}
	
	public void imprimeParticipantes(){
		try {
			for(Participante p: participantes){
				if(p instanceof Individuo){
						System.out.println(p.getNome()+" - "+p.getAssento());
					
				} else if(p instanceof Instituicao){
					((Instituicao) p).imprimeMembros();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
