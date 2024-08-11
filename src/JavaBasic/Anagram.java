package JavaBasic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String:");
		String str1 = sc.nextLine().toLowerCase();
		System.out.println("Enter 2nd String:");
		String str2 = sc.nextLine().toLowerCase();
		
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
