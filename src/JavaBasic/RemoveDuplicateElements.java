package JavaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class RemoveDuplicateElements {

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

		removeDuplicateElements(arr);
	}

	private static void removeDuplicateElements(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> sn = new HashSet<>();
		for (Integer i : arr) {
			sn.add(i);
		}

		System.out.println("After Removing:" + sn);
	}

}
