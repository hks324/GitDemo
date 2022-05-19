package realApplication;

public class TwoDArray {

	public void getData(int[][] test) {
		System.out.println(test.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test;
		test = new int[5][10];
		int m;
		char ch = 'f';
		String s2= "Himanshu";
		for(int i=0; i<s2.length();i++)
		{
			
			m= s2.charAt(i);
			//System.out.println(m);
		}
		int row = test.length;
		int col = test[0].length;
int ascii= (int)ch;
for(int i=0; i<10;i++)
{
	
	
	System.out.println(i%2);
}


		// System.out.println(ascii);
		// System.out.println(col);
		//TwoDArray t1 = new TwoDArray();
		//t1.getData(test);
	}

}
