package _05_class.access_modifier.pack_03;

public class B {
	public void method() {
		A a=new A();
		
		// 필드 변경
		a.field1=11;
		a.field2=22;
//		a.field3=33; // private이라 다른 클래스에서 접근 불가
		
		//메소드 호출
		a.method1();
		a.method2();
//		a.method3(); // private이라 다른 클래스에서 접근 불가
	}
}
