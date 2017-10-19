package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class AlarmeConcrete implements Observer, Subject {

	private Boolean alerta = false;
	private ArrayList<Observer> observadores = new ArrayList<Observer>();

	private ArrayList<SensorConcrete> objetosObservados = new ArrayList<SensorConcrete>();

	public void adicionarSensor(SensorConcrete o) {
		o.adicionarObservador(this);
		this.objetosObservados.add(o);
	}
	
	@Override
	public void adicionarObservador(Observer a) {

		observadores.add(a);
	}

	@Override
	public void removerObservador(Observer a) {
		observadores.remove(a);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> i = observadores.iterator();

		while (i.hasNext()) {
			Observer a = (Observer) i.next();
			a.atualizar(this);
		}
	}

	@Override
	public void atualizar(Subject subject) {
		for(SensorConcrete s : this.objetosObservados) {
			if (subject == s) {
				if (s.getAlerta()) {
					System.out.println("Alarme Acionado!");
					this.alterarAlerta(s.getAlerta());
				} else {
					System.out.println("Alarme desativado!");
					this.alterarAlerta(s.getAlerta());
				}
			}
		}
	}

	public Boolean getAlerta() {
		return alerta;
	}

	public void alterarAlerta(Boolean b) {
		alerta =  b;
		notifyObservers();
	}

}
