package iterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class PlayerB implements CardGame {

	protected Deque<Card> cards;
	
	public PlayerB() {
		this.cards = new ArrayDeque<Card>();
		Random rand = new Random();
		int cont = 0;
		while(cont < 20){
			cards.add(new Card(rand.nextInt(20)));
			cont++;
		}
	}

	public Deque<Card> getCards() {
		return cards;
	}

	@Override
	public IteratorInterface createIterator() {
		return new IteratorPlayerB(cards);
	}

}
