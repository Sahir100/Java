package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = sc.nextLine().toLowerCase();

		printRepeatedChar(str);
	}

	private static void printRepeatedChar(String str) {
		// TODO Auto-generated method stub
		char[] arr = str.toCharArray();

		HashMap<Character, Integer> mp = new HashMap<>();
		for (Character i : arr) {
			if (!mp.containsKey(i)) {
				mp.put(i, 1);
			} else {
				mp.put(i, mp.get(i) + 1);
			}

		}

		for (Character i : mp.keySet()) {
			if (mp.get(i) > 1) {
				System.out.println(i + " repeated " + mp.get(i) + " times");
			}
		}
	}

}
