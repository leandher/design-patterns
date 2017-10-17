package visitor;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Array a = new Array();
		Random generator = new Random();
		Integer[] array =  new Integer[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(100);
        }
		
		System.out.println("Bubblesort ");
		a.setArray(array);
		a.acceptVisitor(new BubbleSortVisitor());
		
		System.out.println("Quicksort ");
		a.setArray(array);
		a.acceptVisitor(new QuickSortVisitor());

		System.out.println("Mergesort ");
		a.setArray(array);
		a.acceptVisitor(new MergeSortVisitor());
	}

}
