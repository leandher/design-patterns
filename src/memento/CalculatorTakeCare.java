package memento;

import java.util.ArrayList;

public class CalculatorTakeCare {

	protected ArrayList<CalculatorMemento> states;
	
	public ArrayList<CalculatorMemento> getStates() {
		return states;
	}

	public CalculatorTakeCare(){
		states = new ArrayList<CalculatorMemento>();
	}
	
	public void addingMemento(CalculatorMemento memento){
		states.add(memento);
	}
	
	public CalculatorMemento getLastState(){
		if(states.size() <= 0){
			return new CalculatorMemento("");
		}
		CalculatorMemento saveState = states.get(states.size() - 1);
		states.remove(states.size() - 1);
		return saveState;
	}
}
