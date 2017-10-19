package observer;

public class DelegaciaConcrete implements Observer{
	
	private AlarmeConcrete objetoObservado;

	public DelegaciaConcrete(AlarmeConcrete o) {
		this.objetoObservado = o;
		objetoObservado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar(Subject s) {
		if (s == objetoObservado) {
			if (objetoObservado.getAlerta()) {
				System.out.println("Delegacia foi notificada que o alarme disparou!");
			} else {
				System.out.println("Delegacia foi notificada que o alarme foi desativado!");
			}
		}
	}
}
