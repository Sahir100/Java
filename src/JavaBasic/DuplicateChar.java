package JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		String s = name.toLowerCase().replaceAll("\\s", "");
		boolean duplicateFound = false;

		System.out.println("The string is: " + s);

		char arr[] = s.toCharArray();

		ArrayList<Character> al = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && !al.contains(arr[i])) {
					al.add(arr[i]);
					// System.out.print(arr[i] + ",") ;
					duplicateFound = true;
					break;

				}

			}

		}
		System.out.println("Duplicate Chars are:" + al);
		if (duplicateFound == false) {

			System.out.print("No Duplicate");
		}

	}
}
