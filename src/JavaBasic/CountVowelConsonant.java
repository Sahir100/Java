package JavaBasic;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine().toLowerCase();
		
		int vowel = 0, consonant = 0;
		char[] ch = str.toCharArray();
		
		for (char ch1 : ch) {
			if (ch1 >= 'a' && ch1 <= 'z') {
				if (ch1 == 'a' || ch1 == 'e'|| ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
					vowel++;
				}
				else {
					consonant++;
				}
			}
		}
		System.out.println("Vowel: " +vowel);
		System.out.println("Consonant: " +consonant);
		
	}

}
