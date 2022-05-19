package realApplication;

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class CipherDecipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the message to cipher");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println("enter the message to De-cipher");
		String decipher = s.nextLine();
		CipherDecipher cd = new CipherDecipher();
		System.out.println(cd.ciphering(input));
		System.out.println(cd.deciphering(decipher));

	}

	private String deciphering(String decipher) {
		
		decipher= toChar(decipher);
		decipher= decipher.replace("*", " ");
		decipher= (new StringBuilder(decipher)).reverse().toString();
		decipher= toCase(decipher);
		return decipher;
	}

	public String toChar(String decipher) {
		
		StringBuilder sb= new StringBuilder();
		int n= decipher.length();
		for(int i=0; i<n-1;i++) {
			char ch= decipher.charAt(i);
			if(Character.isDigit(ch)) {
				int ascii= ch-'0';
				while(i<n-2&&Character.isDigit(decipher.charAt(++i))) {
					ascii= ascii*10;
					ascii=ascii+decipher.charAt(i)-'0';
				}
				ch=(char) ascii;
				sb.append(ch);
				
				if(!Character.isDigit(decipher.charAt(i)))
					sb.append(decipher.charAt(i));	
				continue;
			}
			sb.append(ch);
		}
		return sb.toString();
	}

	private String ciphering(String input) {
		// TODO Auto-generated method stub
		input = toCase(input);
		input =(new StringBuilder(input)).reverse().toString();
		input= input.replace(" ", "*");
		input= toASCII(input);
		input= input+"3";	
		return input;
	}

	public String toASCII(String input) {
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<input.length();i++) {
			if(i%2 !=0) {
				sb.append((int) input.charAt(i));
			}
			else {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}

	public String toCase(String input) {
		char[] ch = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				ch[i] = Character.toLowerCase(input.charAt(i));
			} else if (Character.isLowerCase(input.charAt(i))) {
				ch[i] = Character.toUpperCase(input.charAt(i));
			}
		}
		return String.valueOf(ch);

	}



}
