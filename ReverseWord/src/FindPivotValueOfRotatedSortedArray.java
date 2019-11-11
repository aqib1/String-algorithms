
public class FindPivotValueOfRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 1, 2 };
		System.out.println(findPivot(arr, 0, arr.length - 1));
	}
	
	public static int findPivot(int[] arr, int start, int end) {
		if (end < start)
			return -1;
		if (arr.length == 1)
			return arr[0];
		int mid = (start + end) / 2;
		if (mid == 0 && arr[mid] > arr[mid + 1]) {
			return arr[mid];
		} else {
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return arr[mid];
			} else if (arr[mid] > arr[end]) {
				return findPivot(arr, mid + 1, end);
			} else if (arr[mid] < arr[end]) {
				return findPivot(arr, start, mid - 1);
			}
		}
		return -1;
	}
}
