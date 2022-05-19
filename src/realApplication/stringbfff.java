package realApplication;

public class stringbfff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="himanshu";
		StringBuilder sb = new StringBuilder();
		char[] letters = str.toCharArray();
		for (char ch : letters) {
			sb.append((byte)ch);
		}
		System.out.println(sb.toString()); // print 749711897

	}

}
