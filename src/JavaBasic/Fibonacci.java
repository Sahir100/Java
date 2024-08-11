package JavaBasic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range:");
		int n = sc.nextInt();

		int i = 0, j = 1, k = 2;
		int sum = 0;

		if (n < 1) {
			System.out.print("Num not Entered");
		}

		else if (n == 1) {
			System.out.print("Fibonacci Series:" + i);
		} else {
			System.out.print("Fibonacci Series: " + i + "," + j);

			while (k < n) {
				sum = i + j;
				System.out.print("," + sum);
				i = j;
				j = sum;
				k++;
			}
		}
	}

}
