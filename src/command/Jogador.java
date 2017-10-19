package command;

public class Jogador {

	private String nome;
	Joystick joystick = new Joystick();
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void main(String[] args) {
		Luta luta = new Luta();
		Corrida corrida = new Corrida();
		Futebol futebol = new Futebol();
		
		ChuteCommand chuteCmd = new ChuteCommand(luta);
		SocoCommand socoCmd = new SocoCommand(luta);
		
		AcelerarCommand acelerarCmd = new AcelerarCommand(corrida);
		FreiarCommand freiarCmd = new FreiarCommand(corrida);
		
		CorrerCommand correrCmd = new CorrerCommand(futebol);
		ChutarBolaCommand chutarBolaCmd = new ChutarBolaCommand(futebol);
		
		Jogador j = new Jogador("Player 1");
		System.out.println("Bem vindo, "+j.getNome()+"!");
		System.out.println("-----------------------Iniciando jogo de Luta-----------------------");
		j.joystick.setCommands(chuteCmd, socoCmd);
		j.joystick.acionarA();
		j.joystick.acionarB();
		j.joystick.acionarA();
		j.joystick.acionarA();
		j.joystick.acionarB();
		System.out.println("Adversário nocauteado");
		
		System.out.println("-----------------------Iniciando jogo de Corrida-----------------------");
		j.joystick.setCommands(acelerarCmd, freiarCmd);
		j.joystick.acionarA();
		j.joystick.acionarB();
		j.joystick.acionarA();
		j.joystick.acionarA();
		j.joystick.acionarB();
		System.out.println("Corrida finalizada");
		
		System.out.println("-----------------------Iniciando jogo de Futebol-----------------------");
		j.joystick.setCommands(correrCmd, chutarBolaCmd);
		j.joystick.acionarA();
		j.joystick.acionarB();
		System.out.println("Goleiro Defendeu");
		j.joystick.acionarA();
		j.joystick.acionarA();
		System.out.println("FALTA MARCADA!");
		j.joystick.acionarB();
		System.out.println("Gooool!!");
		System.out.println("Partida encerrada!");
		
		
	}
}
