package iterator;

import java.util.ArrayList;

public class IteratorPlayerA implements IteratorInterface {

	protected ArrayList<Card> cardsA = new ArrayList<Card>();
	protected int cont;
	
	public IteratorPlayerA(ArrayList<Card> cardsA) {
		this.cardsA = cardsA;
		cont = 0;
	}

	@Override
	public void next() {
		if(cont == cardsA.size()){
			cont = -1;
		}
		cont++;
	}

	@Override
	public boolean isDone() {
		return cont == cardsA.size();
	}

	@Override
	public void remove() {
		cardsA.remove(cont);
	}

	@Override
	public void putInEnd() {
		Card tempCard = cardsA.get(cont);
		this.remove();
		cardsA.add(tempCard);
	}

	@Override
	public Card getNext() {
		if(isDone()){
			cont = cardsA.size() - 1;
		} else if(cont < 0){
			cont = 0;
		}
		return cardsA.get(cont);
	}

}
