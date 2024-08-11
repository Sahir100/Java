package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class PrintRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range:");
		int n = sc.nextInt();
		System.out.println("Enter Array:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		findRepeatedElements(arr);
	}

	private static void findRepeatedElements(int[] arr) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> mp = new HashMap<>();

		for (Integer j : arr) {
			if (!mp.containsKey(j)) {
				mp.put(j, 1);
			} else {
				mp.put(j, mp.get(j) + 1);
			}
		}
		for (Integer k : mp.keySet()) {
			if (mp.get(k) > 1) {
				System.out.println(k + " repeated " + mp.get(k) + " times.");
			}
		}
		

	}

}
