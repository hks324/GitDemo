package packageJava;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of values in interegr array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("enter the integer now and press enter");
		int[] a1 = new int[n];
		for (int i = 0; i < n; i++) {
			Scanner s1 = new Scanner(System.in);
			a1[i] = s1.nextInt();
		}
		System.out.println("array is enterted below are the ouput ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int k = 0;
			if (!(arr.contains(a1[i]))) {
				arr.add(a1[i]);
				k++;
				for (int j = i + 1; j < n; j++) {
					if (a1[i] == a1[j]) {
						k++;
					}
				}
				System.out.println("the number " + a1[i] + " is repeated " + k + " times");
				if (k == 1) {
					System.out.println("the unique number is " + a1[i]);
				}
			}

		}

	}
}
