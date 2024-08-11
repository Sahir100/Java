package JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		removeZero(str);
	}

	private static void removeZero(String str) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Character> al = new ArrayList<>();
		 * 
		 * char[] arr = str.toCharArray(); for (Character ch : arr) { al.add(ch);
		 * 
		 * } al.remove('0'); System.out.println(al); //Object[] arr1 = al.toArray();
		 * /*for (Object ct : arr1) { System.out.println(ct); }
		 */

		int i = 0;
		StringBuffer sbr = new StringBuffer(str);
		while (i < str.length() && str.charAt(i) == '0') {

			i++;

			sbr.replace(0, i, "");
		}

		System.out.println(sbr.toString());

		// String removeZeros = str.replaceFirst("^0+(?!$)", "");

		// System.out.println(removeZeros);
		// System.out.print(str.length());
	}

}
