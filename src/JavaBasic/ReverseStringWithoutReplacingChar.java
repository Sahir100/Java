package JavaBasic;

import java.util.Scanner;

public class ReverseStringWithoutReplacingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.nextLine();

		reverseStringWithoutChar(word);

	}

	private static void reverseStringWithoutChar(String word) {
		// TODO Auto-generated method stub

		int i = 0, j = word.length() - 1;
		char[] arr = word.toCharArray();

		while (i < j) {
			if (!(Character.isAlphabetic(word.charAt(i)))) {
				i++;
			} else if (!(Character.isAlphabetic(word.charAt(j)))) {
				j--;
			} else {
				char temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			}
		}
		System.out.print(arr);
	}
}
