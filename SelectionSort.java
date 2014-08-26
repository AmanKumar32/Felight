package swingbenchmarking;

public class SelectionSort {
	public static int[] SelectionSearch(int[] source) {
		int[] target = source;
		int length = target.length;
		int temp = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				if (target[i] > target[j]) {
					temp = target[i];
					target[i] = target[j];
					target[j] = temp;
				}
			}
		}
		return target;
	}
}
