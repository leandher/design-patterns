package iterator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Seja Bem vindo!");
		System.out.println("Escreva inicio e aperte enter para começar o jogo");
		String iniciar = s.next();
		PlayerA playerA = new PlayerA();
		PlayerB playerB = new PlayerB();
		IteratorInterface itA = playerA.createIterator();
		IteratorInterface itB = playerB.createIterator();
		int playedTimes = 0;
		while(!(playerB.getCards().size() == 0) || !(playerA.getCards().size() == 0)){
			playedTimes++;
			System.out.println("Jogada número: "+playedTimes);
			System.out.println("Número de cartas de A e B: "+playerA.cards.size()+"/"+playerB.cards.size());
			System.out.println("Carta A: "+itA.getNext().getPower()+"/ Carta B: "+itB.getNext().getPower());
			if(itA.getNext().getPower() > itB.getNext().getPower()){
				playerB.cards.addLast(itA.getNext());
				itA.remove();
				System.out.println("Carta atual A maior que carta B");
				System.out.println("Carta A adicionada em B");
			} else if(itA.getNext().getPower() < itB.getNext().getPower()){
				playerA.cards.add(itB.getNext());
				itB.remove();
				System.out.println("Carta atual B maior que carta A");
				System.out.println("Carta B adicionada em A");
			} else if(itA.getNext().getPower() == itB.getNext().getPower()){
				itA.putInEnd();
				itB.putInEnd();
				System.out.println("Carta atual A igual a B");
				System.out.println("Cartas A e B foram colocadas no final das listas");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			itA.next();
		}
		System.out.println("Fim de jogo!");
		if(playerB.getCards().size() == 0){
			System.out.println("Vencedor: B");
		} else if(playerA.getCards().size() == 0){
			System.out.println("Vencedor: A");
		}
	}
}
