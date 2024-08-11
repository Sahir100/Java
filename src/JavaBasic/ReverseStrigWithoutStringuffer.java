package JavaBasic;

import java.util.*;

public class ReverseStrigWithoutStringuffer {

	public static String reverseStringWithoutStringBuffer(String name) {

		String reverseString = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}

		return reverseString;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();

		String result = reverseStringWithoutStringBuffer(word);
		System.out.print(result);
	}

}
