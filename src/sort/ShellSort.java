package sort;

public class ShellSort {
	public static void sort(int[] v) {
		int n = v.length;
		int range = n / 2;
		int i, j, temp;
		int gap;
		while (range > 0) {
			for (i = range; i < n; i++) {
				temp = v[i];
				j = i;
				gap = j - range;
				while (j >= range && v[gap] > temp) {
					v[j] = v[gap];
					j -= range;
					gap = j - range;
				}
				v[j] = temp;
			}
			range /= 2;
		}
	}
}
