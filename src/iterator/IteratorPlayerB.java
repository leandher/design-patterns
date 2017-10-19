package iterator;

import java.util.ArrayDeque;
import java.util.Deque;

public class IteratorPlayerB implements IteratorInterface {

	protected Deque<Card> cardsB = new ArrayDeque<Card>();
	protected int cont;
	
	public IteratorPlayerB(Deque<Card> cardsB) {
		this.cardsB = cardsB;
		cont = 0;
	}

	@Override
	public void next() {
		cont++;
		cardsB.removeFirst();
	}

	@Override
	public boolean isDone() {
		return cont == cardsB.size();
	}

	@Override
	public void remove() {
		cardsB.removeFirst();
	}

	@Override
	public void putInEnd() {
		Card tempCard = cardsB.getFirst();
		cardsB.removeFirst();
		cardsB.addLast(tempCard);
	}

	@Override
	public Card getNext() {
		if(isDone()){
			cont = cardsB.size() - 1;
		} else if(cont < 0){
			cont = 0;
		}
		
		return cardsB.getFirst();
	}

}
