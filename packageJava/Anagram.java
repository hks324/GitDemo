package packageJava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("first string");
		String s1= s.nextLine();
		System.out.println("second string");
		String s2= s.nextLine();
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		boolean isAnagram = Arrays.equals(c1, c2);
		System.out.println(isAnagram);
		

	}

}

