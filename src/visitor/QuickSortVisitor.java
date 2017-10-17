package visitor;

public class QuickSortVisitor implements ArrayVisitor {

	@Override
	public void visit(Integer[] array) {
		quickSort(array, 0, array.length-1);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}

	public static void quickSort(Integer v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;
		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			quickSort(v, esquerda, dir);
		if (esq < direita)
			quickSort(v, esq, direita);
	}
}
