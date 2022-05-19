package packageJava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0, b=1, c, n=2;

if(n==0) {
	System.out.println(a);
}
else {
	System.out.print(a);
	System.out.print("\t"+b);
	for(int i=2; i<=n; i++) {
	c=a+b;
	System.out.print("\t"+c);
	a=b;
	b=c;
}
}
	}

}
