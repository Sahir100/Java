package JavaBasic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = sc.nextInt();
		
		int or = no;
		
		int sum = 0;
		while (no != 0) {
			int t = no % 10;
			sum  = sum * 10 + t;
			no = no / 10;
		}
		if (sum == or) {
			System.out.println("The no is palindrome");
		}
		else {
			System.out.println("The no is not palundrome");
		}
	}

}
