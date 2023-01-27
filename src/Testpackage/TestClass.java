package Testpackage;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte,short,int,long,float,double
		
		int a = 10;
		double b = a;//implicit casting
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		
		
		double c = 10.58;
		int d = (int) c;// manual or explicit type casting
		
		System.out.println("value of c :"+c);
		System.out.println("value of d :"+d);
		

	}

}
