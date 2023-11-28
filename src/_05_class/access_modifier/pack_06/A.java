package _05_class.access_modifier.pack_06;

//protected 접근 제한자
// - 같은 패키지: default랑 동일
// - 다른 패키지: 자식 클래스만 접근 허용
public class A {
	protected int field1;
	
	protected A() {};
	
	protected void method1() {};
}
