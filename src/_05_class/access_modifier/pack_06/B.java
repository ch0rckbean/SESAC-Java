package _05_class.access_modifier.pack_06;

public class B {
	//default와 같이 같은 클래스 안에서는 제약 없음!
	public void method() {
		
		A a=new A();
		a.field1=11;
		a.method1();
	}
}
