package sort;

import util.Util;

public class QuickSort {
	private static int i;
	private static int j;

	public static void sort(int[] v) {
		quickSort(v, 0, v.length - 1);
	}

	private static void quickSort(int[] v, int low, int high) {
		partition(v, low, high);
		if (low < j)
			quickSort(v, low, j);
		if (high > i)
			quickSort(v, i, high);
	}

	private static void partition(int[] v, int low, int high) {
		i = low;
		j = high;
		int x = v[(i + j) / 2];
		while (i <= j) {
			while (v[i] < x)
				i++;
			while (v[j] > x)
				j--;
			if (i <= j) {
				Util.swap(v, j, i);
				i++;
				j--;
			}
		}
	}
}
