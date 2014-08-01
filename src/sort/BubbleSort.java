package sort;

import util.Util;

public class BubbleSort {
	public static void sort(int[] v) {
		int i, j, n = v.length;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (v[i] > v[j]) {
					Util.swap(v, i, j);
				}
			}
		}
	}
}
