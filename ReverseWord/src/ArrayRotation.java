import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotateArray(arr, 2)));
	}

	private static int[] rotateArray(int[] arr, int i) {
		for (int z = 0; z < i; z++) {
			int last = arr[arr.length - 1];
			for (int x = arr.length - 2; x >= 0; x--) {
				arr[x + 1] = arr[x];
			}
			arr[0] = last;
		}
		return arr;
	}
}
