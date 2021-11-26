//Ameer Ahmed 

public class Bubblesort {

	void print(int a[]) {

		int n = a.length;
		int i;
		for (i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}

	void bubbleSort(int a[]) {

		int n = a.length;
		int i, j, temp;
		for (i = 0; i < n; i++) {

			for (j = i; j < n; j++) {

				if (a[j] < a[i]) {

					// the temp variable is the one that you use to swap the values with
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int a[] = { 11, 33, 5, 78, 9 };
		Bubblesort b1 = new Bubblesort();
		System.out.println("Before sorting the array elements: ");
		b1.print(a);
		b1.bubbleSort(a);

		System.out.println("After sorting the array elements: ");
		b1.print(a);
	}
}