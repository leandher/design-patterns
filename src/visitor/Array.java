package visitor;

public class Array {
	private Integer[] array;
	
	
	public Array() {
		super();
		this.array =  new Integer[100];
	}

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.array[i] = numbers[i];
		}
		
	}
	
	public void acceptVisitor(ArrayVisitor visitor) {
		System.out.println("Array antes da ordenação ");
		
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i]+" ");
		}
		System.out.println(" ");
		visitor.visit(this.array);
	}
}
