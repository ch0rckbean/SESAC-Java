package _02_control_statement;

public class MethodOverloading {

	public static void main(String[] args) {
		// 1. 객체 생성
		MethodOverloading ol=new MethodOverloading();
		
		// 2. 객체의 메소드 사용
		System.out.println(ol.add(1,2));
		System.out.println(ol.add(10.0, 3.0));
		System.out.println(ol.add(10,20,30));
		System.out.println(ol.add(1.1,2.2,4.4));
		System.out.println(ol.calculate(5));
		System.out.println(ol.calculate(4,7));
		System.out.println(ol.calculate(6,3));

	}
	public int add (int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b, double c) {
		return a+b+c;
	}
	public double calculate(double a) {
		return a*a*3.14;	
	}
	public double calculate(int a,int b) {
		return a*b;	
	}
	public double calculate(double a,double b) {
		return a*b*0.5;	
	}
	
}

