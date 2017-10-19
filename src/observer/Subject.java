package observer;

public interface Subject {
	public void adicionarObservador(Observer o);
	public void removerObservador(Observer o);
	public void notifyObservers();
}
