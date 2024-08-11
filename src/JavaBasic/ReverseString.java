package JavaBasic;

import java.util.*;

public class ReverseString {

	public static String reverseString(String name) {

		StringBuffer sf = new StringBuffer(name);
		String result = sf.reverse().toString();

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();

		String result = reverseString(word);
		System.out.print(result);
	}

}
