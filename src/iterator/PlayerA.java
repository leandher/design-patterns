package iterator;

import java.util.ArrayList;
import java.util.Random;

public class PlayerA implements CardGame {
	
	protected ArrayList<Card> cards;

	public PlayerA() {
		this.cards = new ArrayList<Card>();
		Random rand = new Random();
		int cont = 0;
		while(cont < 20){
			cards.add(new Card(rand.nextInt(20)));
			cont++;
		}
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	@Override
	public IteratorInterface createIterator() {
		return new IteratorPlayerA(cards);
	}

}
