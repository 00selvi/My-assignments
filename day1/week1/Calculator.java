package day1.week1;

public class Calculator {
	
	public void addtwoNumbers() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	
	}

	public int addthreeNumbers(int a,int b,int c) {
		
		return a+b+c;

	}
	
	
	public static void multiplytwoNumbers1() {
		int a =6;
		double b =12;
		System.out.println(a*b);
	
	}
	
	
	public static int multiplytwoNum2(int a,int b) {
		return a*b;
		
	}
	
	
	public static void subtracttwoNum1() {
		double a =12;
		double b =10;
		System.out.println(a-b);
	}
	

	public static int subtracttwoNum2(int a,int b) {
		return a-b;
	}
	
	
	public static void dividetwoNum1() {
		double a = 25;
		int b = 10;
		System.out.println(a%b);
	}
	
	
	public static int dividetwoNum2(int a,int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		
		cl.addtwoNumbers();
		
		System.out.println(cl.addthreeNumbers(5, 10, 15));
	
		cl.multiplytwoNumbers1();
	
		System.out.println(cl.multiplytwoNum2(8, 6));
	
		cl.subtracttwoNum1();
		
		System.out.println(cl.subtracttwoNum2(8,3));
	
		cl.dividetwoNum1();

		System.out.println(cl.dividetwoNum2(8, 4));
				
		

	}

	
}