package memento;

import java.util.ArrayList;

public class Calculator {
	
	public CalculatorTakeCare calculatorTakeCare;
	public String operator;
	
	public Calculator(){
		calculatorTakeCare = new CalculatorTakeCare();
		operator = new String();
	}
	
	public void writeMathSentence(String newOperator){
		calculatorTakeCare.addingMemento(new CalculatorMemento(newOperator));
	    operator += newOperator;
	}
	
	public void undoMathSentence(){
		operator = calculatorTakeCare.getLastState().getMathSentenceState();
	}
	
	public void showSentence(){
		ArrayList<CalculatorMemento> lastsStates = calculatorTakeCare.getStates();
		String mathSentence = "";
		for(int i = 0;i<lastsStates.size();++i){
			mathSentence += lastsStates.get(i).getMathSentenceState();
		}
		System.out.println(mathSentence);
	}
	
	public double calculateSentence(){
		
		ArrayList<CalculatorMemento> operators = calculatorTakeCare.getStates();
		final int FIRST_OPERATOR = 0;
		final int OPERATION = 1;
		final int SECOND_OPERATOR = 2;
		
		if(calculatorTakeCare.getStates().size() == 0){
			System.out.println("Empty sentence!");
			return 0;
		}
		if(operators.get(operators.size() - 1).equals("-") || operators.get(operators.size() -1).equals("+")
		||operators.get(operators.size() - 1).equals("*") || operators.get(operators.size() -1).equals("/")){
			System.out.println("Incorrect Sentence! Sign at the end of the sentence!");
			return 0;
		}
		
		double calculatedNumber = 0;
		if(operators.get(OPERATION).getMathSentenceState().equals("+")){
			calculatedNumber = Double.parseDouble(operators.get(FIRST_OPERATOR).getMathSentenceState())
			+ Double.parseDouble(operators.get(SECOND_OPERATOR).getMathSentenceState());
		} else if(operators.get(OPERATION).getMathSentenceState().equals("-")){
			calculatedNumber = Double.parseDouble(operators.get(FIRST_OPERATOR).getMathSentenceState())
			- Double.parseDouble(operators.get(SECOND_OPERATOR).getMathSentenceState());
		} else if(operators.get(OPERATION).getMathSentenceState().equals("*")){
			calculatedNumber = Double.parseDouble(operators.get(FIRST_OPERATOR).getMathSentenceState())
			* Double.parseDouble(operators.get(SECOND_OPERATOR).getMathSentenceState());
		} else if(operators.get(OPERATION).getMathSentenceState().equals("/")){
			calculatedNumber = Double.parseDouble(operators.get(FIRST_OPERATOR).getMathSentenceState())
			/ Double.parseDouble(operators.get(SECOND_OPERATOR).getMathSentenceState());
		}
		
		for(int i =3;i<operators.size();i=i+2){
			if(operators.get(i).getMathSentenceState().equals("+")){
				calculatedNumber =+ Double.parseDouble(operators.get(i+1).getMathSentenceState()); 
			} else if(operators.get(i).getMathSentenceState().equals("-")){
				calculatedNumber =- Double.parseDouble(operators.get(i+1).getMathSentenceState()); 
			} else if(operators.get(i).getMathSentenceState().equals("*")){
				calculatedNumber = calculatedNumber * Double.parseDouble(operators.get(i+1).getMathSentenceState()); 
			} else if(operators.get(i).getMathSentenceState().equals("/")){
				calculatedNumber = calculatedNumber / Double.parseDouble(operators.get(i+1).getMathSentenceState()); 
			}
		}
		
		return calculatedNumber;
		
	}
}
