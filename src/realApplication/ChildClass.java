package realApplication;

public class ChildClass extends ParentClass {
	int a = 20;
	public void getdata() {
		//System.out.println(super.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c= new ChildClass();
		c.getData();
		
	}

}
