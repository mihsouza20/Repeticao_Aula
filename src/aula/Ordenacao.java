package aula;

public class Ordenacao {

	/*
	 * Algoritmo: o Percorra o vetor inteiro comparando elementos adjacentes (dois a
	 * dois) o Troque as posições dos elements se eles estiverem fora de ordem o
	 * Repita os dois passos acima com os primeiros n-1 itens, depois com os
	 * primeiros n-2 itens, até que reste apenas um item
	 */
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		Ordenacao ob = new Ordenacao();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
