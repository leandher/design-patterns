package mediator;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		MensagemMediator mediator = new MensagemMediator();
		
		System.out.println("Seja bem vindo!");
		
		int cont1 = 0;
		do{
			
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Entrar no bate-papo");
			System.out.println("3. Sair");
			int escolhaInicial = s.nextInt();
			
			if(escolhaInicial == 3){
				System.out.println("Saindo...");
				return;
			}
			
			else if(escolhaInicial == 1){
				System.out.println("Digite o nome: ");
				String nome = s.next();
				System.out.println("Digite a formação: ");
				String formacao = s.next();
				System.out.println("Digite o curso: ");
				String curso = s.next();
				Aluno a = new Aluno(mediator, nome, formacao, curso);
				mediator.adicionarPessoa(a);
				
			} else if(escolhaInicial == 2){
				System.out.println("Lista de alunos cadastrados");
				System.out.println("----------------------------");
				mediator.mostrarAlunosCadastrados();
				System.out.println("----------------------------");
				while(true){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Random rand = new Random();
					int action = rand.nextInt(3);
					if(action == 0){	
						int alunoIndex = rand.nextInt(mediator.pessoas.size());
						if(mediator.pessoas.get(alunoIndex).isDentroDaSala() == false){
							mediator.pessoas.get(alunoIndex).setDentroDaSala(true);
							System.out.println("["+mediator.pessoas.get(alunoIndex).name+"-"+mediator.pessoas.get(alunoIndex).formation+
											"-"+mediator.pessoas.get(alunoIndex).course+"]"+" entrou na sala");
						}
					} else if(action == 1){
						int alunoIndex = rand.nextInt(mediator.pessoas.size());
						if(mediator.pessoas.get(alunoIndex).isDentroDaSala() == true){
							mediator.pessoas.get(alunoIndex).setDentroDaSala(false);
							System.out.println("["+mediator.pessoas.get(alunoIndex).name+"-"+mediator.pessoas.get(alunoIndex).formation+
											"-"+mediator.pessoas.get(alunoIndex).course+"]"+" saiu da sala");
						}
					} else if(action == 2){
						int alunoIndex = rand.nextInt(mediator.pessoas.size());
						if(mediator.pessoas.get(alunoIndex).isDentroDaSala() == true){
							String mensagem = "Mensagem";
							int numMensagem = rand.nextInt(3) + 1;
							if(numMensagem == 1){
								mensagem = mensagem + " 1";
							} else if(numMensagem == 2){
								mensagem = mensagem + " 2";
							} else if(numMensagem == 3){
								mensagem = mensagem + " 3";
							}
							mediator.pessoas.get(alunoIndex).enviarMensagemEntreAlunos(mensagem);
							System.out.println("["+mediator.pessoas.get(alunoIndex).name+"-"+mediator.pessoas.get(alunoIndex).formation+
									"-"+mediator.pessoas.get(alunoIndex).course+"]"+" diz: "+mensagem);
						}
					}
				}
			}
			System.out.println("Voce deseja continuar? 1 para sim e 0 para não");
			cont1 = s.nextInt();
		} while(cont1 == 1);
	}
}
