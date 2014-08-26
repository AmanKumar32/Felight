package calc;
public class Calculator {

	// A method accepts length of array and returns random values.
	public static double[] Insert(double[] num) {
		double[] array = num;
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 100;

		}
		num = array;
		return num;
	}

	// A method which accepts from and to and return an array filled with odd
	// number.
	public static int[] findodd(int from, int to) {

		int length = to / 2;
		int j = 0;
		int[] array = new int[length];
		for (int i = from; i <= to; i++) {

			if (i % 2 != 0) {
				if (i > 0) {
					array[j] = i;
					j++;
				}
			}

		}
		return array;
	}

	// A method which accepts from and to and return an array filled with even
	// number.
	public static int[] findeven(int from, int to) {

		int length = to / 2;
		int j = 0;
		int[] array = new int[length];
		for (int i = from; i <= to; i++) {

			if (i % 2 == 0) {
				if (i > 0) {
					array[j] = i;
					j++;
				}
			}

		}
		return array;
	}

	// A method which accepts char array and returns number of vowels.
	public static int CountVowels(char[] array) {

		char[] target = array;
		int total = 0;
		for (int i = 0; i < target.length; i++) {

			if ((array[i] == 'a') || (array[i] == 'e') || (array[i] == 'i')
					|| (array[i] == 'o') || (array[i] == 'u')) {
				total += 1;
			}
		}
		return total;
	}

	// A method which accepts from and to and return an array filled with prime
	// number.
	public static int[] findprime(int from, int to) {

		System.out.println("Prime numbers between " + from + " and " + to);
		int[] array = new int[to];
		int k = 0;
		for (int i = from; i < array.length; i++) {

			boolean isPrime = true;

			for (int j = from + 1; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				array[k] = i;
			k++;
			// System.out.print(i + " ");

		}
		return array;
	}

	// A method using Linear search and returns the position.
	public static int LinearSearch(int[] num, int value) {
		int[] array = num;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}

		}
		return -1;
		// return Index;
	}

	// A method returns char array filled with random characters.
	public static char[] MethodReturnCharArray(int size) {

		char[] array = new char[size];

		for (int i = 65, j = 0; i >= 127; i++, j++) {

			array[j] = (char) (i);
		}
		return array;
	}

	// A method which accepts variable number of argument of type double and
	// returns sum of all the elements.
	public static double VariableArgumentSum(double... source) {
		double[] target = source;
		double total = 0;
		for (int i = 0; i < target.length; i++) {
			total += target[i];
		}
		return total;
	}

	// A method to reverse a string without using StringBuffer or StringBuilder.
	public char[] reverse(String Source) {
		char[] chrArray2 = new char[Source.length()];
		char[] chrArray1 = Source.toCharArray();
		int lengthString = Source.length();
		System.out.println(lengthString);
		int j = lengthString - 1;
		for (int i = 0; i < Source.length(); i++, j--) {

			chrArray2[j] = chrArray1[i];

		}
		return chrArray2;
	}

	// A method which accepts a string as argument and returns
	// the first letter of every word clubbed into a string.
	public char[] searchFirst(String Source) {
		char[] chrArray2 = new char[Source.length()];
		char[] chrArray1 = Source.toCharArray();
		chrArray2[0] = chrArray1[0];
		int j = 1;
		for (int i = 1; i < Source.length() - 1; i++) {

			if (chrArray1[i] == (int) 32) {
				System.out.println(chrArray1[i]);
				chrArray2[j] = chrArray1[i + 1];
				j++;
			}

		}
		return chrArray2;

	}
	
	//
}
