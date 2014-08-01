package util;

public class Util {

	public static void swap(int[] v, int i, int j) {
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}

	public static void echo(int[] v) {
		System.out.print("{");
		for (int i : v) {
			System.out.print(" " + i + " ");
		}
		System.out.print("}");
	}

}
