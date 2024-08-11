package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class PrintOccuranceDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		HashMap result = printOccDig(str);

		System.out.println("Result: " + result);
	}

	private static HashMap printOccDig(String str) {
		// TODO Auto-generated method stub
		char[] strarr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (Character i : strarr) {
			if (Character.isDigit(i) && !hm.containsKey(i)) {
				hm.put(i, 1);
			} else if (Character.isDigit(i)) {
				hm.put(i, hm.get(i) + 1);
			}
		}

		return hm;
	}

}
