package sort;

import util.Util;

public class SelectionSort {
	public static void sort(int[] v) {
		int i, j, min, n = v.length;
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (v[min] > v[j])
					min = j;
			}
			Util.swap(v, min, i);
		}
	}
}
