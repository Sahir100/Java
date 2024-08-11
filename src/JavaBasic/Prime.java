package JavaBasic;

import java.util.*;

public class Prime {

	public static boolean Prime(int num) {

		int flag = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int no = sc.nextInt();

		boolean result = Prime(no);
		if (result) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
