package mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

	protected ArrayList<Pessoa> pessoas;
	
	public MensagemMediator(){
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(Pessoa p){
		pessoas.add(p);
	}
	
	public void removerPessoa(Pessoa p){
		pessoas.remove(p);
	}
	
	public void mostrarAlunosCadastrados(){
		for(Pessoa p : pessoas){
			System.out.println(p.name);
		}
	}
	
	public Pessoa pegarAluno(String name){
		for(int i =0;i<pessoas.size();++i){
			if(pessoas.get(i).name.equals(name)){
				return pessoas.get(i);
			}
		}
		return null;
	}
	
	public void mostrarAlunosDentroDaSala(){
		for(Pessoa p : pessoas){
			if(p.dentroDaSala == true){
				System.out.println(p.name);
			}
		}
	}

	@Override
	public void enviarEntreAlunos(String mensagem, Pessoa p) {
		for(Pessoa p1 : pessoas){
			if(p1 != p){
				if(p instanceof Aluno){
					if(p1 instanceof Aluno){
						p1.receberMensagem(mensagem);
					}
				}
			}
		}
		
	}

}
