public class PremutationString {

	public static void main(String[] args) {
		String val = "ABCD";
		permutationString(val, 0, val.length());
	}

	// swap first character -> with remaining staring
	// recursive call to permutation
	// backtrack swap

	private static void permutation(String val, int i, int length) {
		// arr, start index, length
		// index==length then print val;
		// loop throw value -> start loop with index, limit length
		// swap char at index with loop x
		// recursive call (val,
		if (i == length) {
			System.out.print(val + " ");
			return;
		}

		for (int x = i; x < length; x++) {
			val = swap(val, i, x);
			permutation(val, i + 1, length);
			val = swap(val, i, x);
		}

	}

	// swap
	private static String swap(String val, int i, int x) {
		char[] arr = val.toCharArray();
		char temp = arr[i];
		arr[i] = arr[x];
		arr[x] = temp;
		return String.valueOf(arr);
	}

	//O(n^n!)
	public static void permutationString(String val, int start, int length) {
		// if start==end
		if (start == length) {
			System.out.print(val + " ");
			return;
		}
		for (int x = start; x < length; x++) {
			val = swap(val, start, x);
			permutation(val, start + 1, length);
			val = swap(val, start, x);
		}
	}
}
