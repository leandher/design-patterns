package memento;

public class CalculatorMemento {
	
	protected String mathSentenceState;

	public CalculatorMemento(String mathSentenceState) {
		this.mathSentenceState = mathSentenceState;
	}

	public String getMathSentenceState() {
		return mathSentenceState;
	}

}
