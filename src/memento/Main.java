package memento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Welcome!");
		System.out.println("1. Begin operation");
		System.out.println("2. Leave");
		Scanner s = new Scanner(System.in);
		int intialChoice = s.nextInt();
		
		if(intialChoice == 2){
			System.out.println("Leaving...");
			return;
		}
		
		else if(intialChoice == 1){
			int cont = 0;
			do{
				System.out.println("1. Write operation");
				System.out.println("2. Delete last action");
				int writeOrDelete = s.nextInt();
				
				if(writeOrDelete == 1){
					System.out.println("Write operator or operation: ");
					String operationOrOperator = s.next();
					calculator.writeMathSentence(operationOrOperator);
				} else if(writeOrDelete == 2){
					calculator.undoMathSentence();
				}
				calculator.showSentence();
				System.out.println("Do you want continue? 1 to continue and 0 to stop ");
				cont = s.nextInt();
				
			} while(cont == 1);
			
			System.out.print("The sentence is: ");
			calculator.showSentence();
			System.out.print("result number is: ");
			System.out.println(calculator.calculateSentence());
		}
	}

}
