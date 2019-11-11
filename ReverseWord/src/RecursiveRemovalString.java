
public class RecursiveRemovalString {

	public static String removeRepitition(String s) {
		return removeR("", s, 0, s.length());
	}

	public static String removeR(String last, String s, int start, int end) {
		if (start >= end) {
			if (last.length() > 1) {
				return removeAt(s, last);
			}
			return s;
		}
		char lastC = s.charAt(start);
		if (last.contains(lastC + "")) {
			last += lastC;
		} else {
			if (last.length() > 1) {
				s = removeAt(s, last);
				start -= last.length();
			}
			last = lastC + "";
		}
		return removeR(last, s, start + 1, s.length());
	}

	private static String removeAt(String s, String toRemove) {
		return s.replace(toRemove, "");
	}

	public static String removeByLoop(String s) {
		String bucket = Character.toString(s.charAt(0));
		for (int x = 1; x < s.length(); x++) {
			String current = Character.toString(s.charAt(x));
			if (bucket.contains(current)) {
				bucket += current;
			} else {
				if (bucket.length() > 1) {
					s = removeAt(s, bucket);
					x -= bucket.length();
				}
				bucket = current;
			}
		}
		if (bucket.length() > 1)
			s = removeAt(s, bucket);
		return s;
	}

	public static void main(String[] args) {
		String str = "acaaabbbacdddd";
		System.out.println(removeRepitition(str));

	}
}
