package packageJava;

public class globalDeclaration {
	//globalDeclaration g1= new globalDeclaration();
	String s1= "Selenium";
	int y=20; 
	public static int x=20; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		globalDeclaration g2= new globalDeclaration();
		g2.dec4();
		g2.dec4();
		globalDeclaration g3= new globalDeclaration();
		g3.dec4();
		g3.dec4();
		g3.y=0;
		System.out.println(g3.y);
		System.out.println(g2.y);
		//g2.dec2();
		//System.out.println(s1);
	}
	public void  dec1() {
		System.out.println(s1);
		System.out.println(y);
	}
	public void  dec2() {
		System.out.println(s1);
		System.out.println(y);
	}
	public void  dec3() {
		System.out.println(s1);
		System.out.println(y);
	}
	public void  dec4() {
		System.out.println(y);
		y++;
//		globalDeclaration g2= new globalDeclaration();
//		System.out.println(g2.s1);
//		y=y+20;
//		s1.concat("Hello");
//		System.out.println(x+y);
	}
}
