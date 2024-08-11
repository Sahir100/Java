package JavaBasic;

import java.util.Scanner;

public class ConvertNumToChar {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.nextLine();

		convertNumToChar(word);

	}

	public static void convertNumToChar(String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) {
			if (Character.isAlphabetic(word.charAt(i))) {
				System.out.print(word.charAt(i));
			} else {
				int a = Character.getNumericValue(word.charAt(i));
				for (int j = 1; j < a; j++) {
					System.out.print(word.charAt(i - 1));
				}
			}
		}
	}

}
