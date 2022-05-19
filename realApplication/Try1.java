package realApplication;

import java.util.Scanner;

public class Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the message to cipher");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		Try1 t= new Try1();
		System.out.println(t.toChar(input));
		//System.out.println(t.toReverse(input));
	}
	
	public String toChar(String str){
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        for (int i=0;i<n-1;i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                int ch=c-'0';
                while(i<n-2&&Character.isDigit(str.charAt(++i))){
                    ch*=10;
                    ch+=str.charAt(i)-'0';
                    
                }
                c=(char)ch;
                sb.append(c);
                if(!Character.isDigit(str.charAt(i)))
                sb.append(str.charAt(i));
                continue;
                
            }
            sb.append(c);
            
        }
        return sb.toString();

}}
