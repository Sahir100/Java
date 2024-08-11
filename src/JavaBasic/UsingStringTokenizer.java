package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UsingStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine().toLowerCase();

		countWords(str);
		splitWords(str);
		reverseWord(str);
		printRepeatedWords(str);
	}

	private static void splitWords(String str) {
		// TODO Auto-generated method stub

		// count words using split method
		String[] arr = str.split(" ");
		System.out.println("No of words using split: " + arr.length);
	}

	private static void countWords(String str) {
		// TODO Auto-generated method stub

		// count words using StringTokenizer
		StringTokenizer cwords = new StringTokenizer(str);
		System.out.println("No of words using StringTokenizer " + cwords.countTokens());

	}

	private static void reverseWord(String str) {
		// TODO Auto-generated method stub
		StringTokenizer cwords1 = new StringTokenizer(str);

		System.out.println("Reverse words are: ");

		while (cwords1.hasMoreTokens()) {
			String revstr = cwords1.nextToken();
			StringBuffer sbf = new StringBuffer(revstr);
			System.out.println(sbf.reverse());
		}
	}

	private static void printRepeatedWords(String str) {
		// TODO Auto-generated method stub

		System.out.println("Repeated words: ");

		HashMap<String, Integer> mp = new HashMap<>();
		String[] arr = str.split(" ");

		for (String i : arr) {
			if (!mp.containsKey(i)) {
				mp.put(i, 1);
			} else {
				mp.put(i, mp.get(i) + 1);
			}
		}

		for (String j : mp.keySet()) {
			if (mp.get(j) > 1) {
				System.out.println("'" + j + "'" + " repeated " + mp.get(j) + " times.");
			}
		}

	}

}
