package observer;

public class CiaSegurancaConcrete implements Observer{
	
	private AlarmeConcrete objetoObservado;

	public CiaSegurancaConcrete(AlarmeConcrete o) {
		this.objetoObservado = o;
		objetoObservado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar(Subject s) {
		if (s == objetoObservado) {
			if (objetoObservado.getAlerta()) {
				System.out.println("Cia. de Seguranca foi notificada que o alarme disparou!");
			} else {
				System.out.println("Cia. de Seguranca foi notificada que o alarme foi desativado!");
			}
		}
	}

}
