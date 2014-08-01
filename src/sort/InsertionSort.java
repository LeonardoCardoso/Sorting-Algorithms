package sort;

public class InsertionSort {
	public static void sort(int[] v) {
		int i, j, temp, n = v.length;
		for (i = 1; i < n; i++) {
			temp = v[i];
			j = i - 1;
			while (j >= 0 && v[j] > temp) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = temp;
		}
	}
}
