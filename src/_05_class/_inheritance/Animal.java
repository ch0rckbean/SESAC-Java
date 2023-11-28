package _05_class._inheritance;

public class Animal {
	
	public static String species;
	public static String name;
	public static int age;
	
	// 생성자
	public Animal(String species,String name,int age){
		this.species=species;
		this.name=name;
		this.age=age;
	}
	
	// 부모 클래스의 메소드
	void makeSound() {
		System.out.print("동물은 소리를 낸다");
	}
	
}
