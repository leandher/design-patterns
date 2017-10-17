package visitor;

public class BubbleSortVisitor implements ArrayVisitor {

	@Override
	public void visit(Integer[] array) {
		for (int i = array.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j - 1] > array[j]) {
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }
        }
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}

}
