package _05_class._inheritance;

public class Cat extends Animal{

	// 생성자
	public Cat(String species, String name, int age) {
		super(species, name, age);
	}

	// 메소드
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
	void bite() {
		System.out.println("고양이가 사람을 문다");
	}
	
	// 실행부
	public static void main(String[] args) {
		Cat c1=new Cat("하양이","뚱땡이",3);
		c1.makeSound();
		c1.bite();
	}

}
