package _05_class._inheritance;

public class Dog extends Animal{
	//생성자
	public Dog(String species, String name, int age) {
		super(species, name, age);
		
	}
	// 메소드 오버라이딩: 부모 클래스의 makeSound() 재정의
	@Override
	void makeSound() {
		System.out.println("멍슌이!");
	}
	void fetch() {
		System.out.println("공 가져왕!");
	}
	
}
