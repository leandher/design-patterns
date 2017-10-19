package adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> listOfInteger = new ArrayList<Integer>();
		for(int i=0;i<vetor.length;++i){
			listOfInteger.add(vetor[i]);
		}
		int resultOfSum = somaLista(listOfInteger);
		return resultOfSum;
	}

}
