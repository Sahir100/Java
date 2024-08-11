package JavaBasic;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = sc.nextInt();
		int original = no;

		int digit = order(no);
		// System.out.println(digit);

		if (armstrong(original, digit)) {
			System.out.println("The no is armstron");
		} else {
			System.out.println("The no is not armstron");
		}
	}

	private static boolean armstrong(int original, int digit) {
		// TODO Auto-generated method stub
		int sum = 0;
		int j = original;
		while (original != 0) {
			int k = original % 10;
			int t = (int) Math.pow(k, digit);
			sum = sum + t;
			original = original / 10;
		}
		if (sum == j) {
			return true;
		} else {

			return false;
		}
	}

	private static int order(int no) {
		int k = 0;
		while (no != 0) {
			int t = no % 10;
			k++;
			no = no / 10;
		}
		return k;
		// TODO Auto-generated method stub

	}

}
