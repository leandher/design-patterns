package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class SensorConcrete implements Subject {
	private Boolean alertaSonoro = false;
	private ArrayList<Observer> observadores = new ArrayList<Observer>();

	public void alterarAlerta() {
		if (alertaSonoro)
			alertaSonoro = false;
		else
			alertaSonoro = true;
		notifyObservers();
	}

	public Boolean getAlerta() {
		return alertaSonoro;
	}

	public void adicionarObservador(Observer a) {

	observadores.add(a);
	}

	public void removerObservador(Observer a) {
		observadores.remove(a);
	}

	public void notifyObservers() {
		Iterator<Observer> i = observadores.iterator();

		while (i.hasNext()) {
			Observer a = (Observer) i.next();
			a.atualizar(this);
		}
	}
}
