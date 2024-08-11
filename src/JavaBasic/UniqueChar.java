package JavaBasic;

import java.util.*;

public class UniqueChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();

		String s = word.toLowerCase();
		
		char arr[] = s.toCharArray();

		ArrayList<Character> al = new ArrayList<>();

		for (char ch : arr) {
			if (!al.contains(ch)) {
				al.add(ch);
			}

		}
		System.out.print(al);
	}

}
