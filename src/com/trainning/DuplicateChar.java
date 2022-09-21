package com.trainning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "Welcom to the Java Programming Language";

		char[] wordChar = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character word : wordChar) {

			if (charMap.containsKey(word)) {
				charMap.put(word, charMap.get(word) + 1);

			}

			else {

				charMap.put(word, 1);
			}

		}

		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " :" + entry.getValue());
			}
		}

	}
}
