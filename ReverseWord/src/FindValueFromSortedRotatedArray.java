
public class FindValueFromSortedRotatedArray {

	// Olog(n)
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 1, 2 };
		System.out.println(searchElement(arr, 6));
	}

	private static int searchElement(int[] arr, int k) {
		int pivot = getPivot(arr, 0, arr.length - 1);
		if (pivot == -1) {
			return binerySearch(arr, 0, arr.length, k);
		} else {
			if (k == arr[pivot]) {
				return pivot;
			} else if (k < arr[0]) {
				return binerySearch(arr, pivot + 1, arr.length, k);
			} else {
				return binerySearch(arr, 0, pivot - 1, k);
			}
		}
	}

	private static int binerySearch(int[] arr, int start, int end, int k) {
		if (end < start)
			return -1;
		if (arr.length == 1)
			return arr[0];
		int med = (start + end) / 2;
		if (arr[med] == k) {
			return med;
		} else if (arr[med] < k) {
			return binerySearch(arr, med + 1, end, k);
		} else if (arr[med] > k) {
			return binerySearch(arr, start, med - 1, k);
		}
		return 0;
	}

	private static int getPivot(int[] arr, int start, int end) {
		if (end < start)
			return -1;
		if (arr.length == 1)
			return arr[0];
		int med = (start + end) / 2;
		if (med == 0 && arr[med] > arr[med - 1])
			return med;
		else {
			if (arr[med] > arr[med + 1] && arr[med] > arr[med - 1]) {
				return med;
			} else if (arr[med] > arr[end]) {
				return getPivot(arr, med + 1, end);
			} else if (arr[med] < arr[end]) {
				return getPivot(arr, start, med - 1);
			}
		}
		return -1;
	}

}
