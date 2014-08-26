package swingbenchmarking;

public class InsertionSort {
	public static int[] doInsertionSort(int[] source) {

		int temp = 0;
		for (int i = 1; i < source.length; i++) {
			for (int j = i; j > 0; j--) {
				if (source[j] < source[j - 1]) {
					temp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = temp;

				}
			}
		}

		return source;
	}

}
