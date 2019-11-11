public class PremutationString {

	public static void main(String[] args) {
		String val = "ABCD";
		permut(val, 0, val.length());
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

	// O(n^n!)
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

	public static String swapStr(String s, int f, int se) {
		char[] arr = s.toCharArray();
		char temp = arr[f];
		arr[f] = arr[se];
		arr[se] = temp;
		return String.valueOf(arr);
	}

	public static void permut(String s, int start, int end) {
		if (start == end) {
			System.out.print(s +" ");
			return;
		}
		for (int x = start; x < end; x++) {
			s = swapStr(s, start, x);
			permut(s, start + 1, end);
			s = swapStr(s, start, x);
		}
	}
}
