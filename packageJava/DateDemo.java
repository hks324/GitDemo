package packageJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {
	
	public DateDemo(int a, int b) {
		System.out.println(" I am in int constructor");
	}
	public DateDemo(String c, String d) {
		System.out.println(" I am in string constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SimpleDateFormat d1= new SimpleDateFormat();
//Calendar c1= Calendar.getInstance();
DateDemo d= new DateDemo(4,5);
//System.out.println(d1.format(c1.getTime()));
//System.out.println(c1.get(Calendar.DAY_OF_YEAR));


	}

}
