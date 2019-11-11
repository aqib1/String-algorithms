import java.util.HashMap;
import java.util.Map.Entry;

public class LongestPalindrome {
	//Longest palindrome in string
	public static String logestPalindrome(String val) {
		HashMap<String, Integer> palidCal = new HashMap<>();
		for (int x = 0; x < val.length() - 1; x++) {
			String collect = val.charAt(x) + "";
			for (int y = x + 1; y < val.length(); y++) {
				collect += val.charAt(y);
				if (isPalindrome(collect)) {
					palidCal.put(collect, collect.length());
				}
			}
		}

		Entry<String, Integer> entity = palidCal.entrySet().stream().max((x, y) -> {
			return x.getValue().compareTo(y.getValue());
		}).orElseThrow(() -> new IllegalArgumentException("Illegal Values!!"));
		return entity.getKey();
	}

	private static boolean isPalindrome(String collect) {
		return collect.equals(new StringBuffer(collect).reverse().toString());
	}

	public static void main(String[] args) {
		String val = "aaaabbaa";
		System.out.println(logestPalindrome(val));
	}
}
