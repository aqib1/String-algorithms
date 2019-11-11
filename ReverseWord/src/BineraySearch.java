
public class BineraySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(binerySearch(arr, 3));
	}

	private static int binerySearch(int[] arr, int i) {
		return recursiveApproach(arr, 0, arr.length, i);
	}

	private static int recursiveApproach(int[] arr, int start, int end, int k) {
		if (end < start)
			return -1;
		if (arr.length == 1)
			return arr[0];
		int med = (start + end) / 2;
		if (arr[med] == k) {
			return med;
		} else if (arr[med] < k) {
			return recursiveApproach(arr, med + 1, end, k);
		} else if (arr[med] > k) {
			return recursiveApproach(arr, start, med - 1, k);
		}

		return 0;
	}
}
