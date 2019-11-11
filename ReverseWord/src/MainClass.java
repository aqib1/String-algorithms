
public class MainClass {
	public static String reverseWordString(String val) {
		String words[] = val.split("\\.");
		String result = "";
		for (int x = words.length - 1; x >= 0; x--) {
			result += words[x];
			if (x != 0)
				result += ".";
		}
		return result;
	}

	public static void main(String[] args) {
		String val = "much.very.program.this.like.i";
		System.out.println(reverseWordString(val));
	}

}
