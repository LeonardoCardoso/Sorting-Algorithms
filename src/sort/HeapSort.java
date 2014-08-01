package sort;

import util.Util;

public class HeapSort {
	public static void sort(int[] v) {
		int n = v.length, i;
		int low = n / 2 - 1, high = n - 1;
		// Build initial heap
		for (i = low; i >= 0; i--) {
			heapify(v, i, n);
		}
		for (i = high; i > 0; i--) {
			Util.swap(v, 0, i);
			heapify(v, 0, i);
		}
	}

	private static void heapify(int[] v, int pos, int n) {
		int low = 2 * pos + 1;
		int high = 2 * pos + 2;
		int largest, temp;
		if (low < n && v[low] > v[pos])
			largest = low;
		else
			largest = pos;
		if (high < n && v[high] > v[largest])
			largest = high;
		if (largest != pos) {
			temp = v[largest];
			v[largest] = v[pos];
			v[pos] = temp;
			heapify(v, largest, n);
		}
	}
}
