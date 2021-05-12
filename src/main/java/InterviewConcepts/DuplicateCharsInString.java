package InterviewConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharsInString {

	public static void main(String[] args) {

		String s = "Java";

		char chars[] = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println(chars[i]);
				}
			}
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : chars) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}

			else {
				map.put(c, 1);
			}
		}

		Iterator<Character> it = map.keySet().iterator();

		while (it.hasNext()) {
			Character key = it.next();
			String value = map.get(key).toString();
			System.out.println(key + " contains " + value);
		}

	}

}
