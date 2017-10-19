package iterator;

public interface IteratorInterface {
	public void next();
	public boolean isDone();
	public void remove();
	public void putInEnd();
	public Card getNext();
}
