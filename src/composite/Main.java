package composite;

public class Main {

	public static void main(String[] args) {
		Congresso congresso = new Congresso("SugarLoafPlop", 30);
		
		Participante ind =  new Individuo("José");
		congresso.adicionarParticipante(ind);
		
		ind =  new Individuo("Maria");
		congresso.adicionarParticipante(ind);
		
		Participante inst = new Instituicao("UECE");
		
		for (int i = 0; i < 10; i++) {
			ind =  new Individuo("Aluno "+(i+1));
			try {
				inst.adicionar(ind);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		congresso.adicionarParticipante(inst);
		
		for (int i = 0; i < 12; i++) {
			ind =  new Individuo("Pessoa "+(i+1));
			congresso.adicionarParticipante(ind);
		}
		
		inst = new Instituicao("UFC");
		
		for (int i = 0; i < 15; i++) {
			ind =  new Individuo("Aluno "+(i+1));
			try {
				inst.adicionar(ind);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		congresso.adicionarParticipante(inst);

		inst = new Instituicao("IFCE");
		
		for (int i = 0; i < 6; i++) {
			ind =  new Individuo("Aluno "+(i+1));
			try {
				inst.adicionar(ind);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		congresso.adicionarParticipante(inst);
		
		congresso.imprimeParticipantes();
	}

}
