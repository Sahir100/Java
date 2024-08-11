package JavaBasic;

import java.util.*;

public class CountNonSpaceChar {

	public static int CountNonSpaceChar(String name) {

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();

		int result = CountNonSpaceChar(word);
		System.out.print(result);
	}

}
