package _05_class._inheritance;

public class DogEx {
	//실행부
	public static void main(String[] args) {
		Dog myDog=new Dog("스피츠","멍멍이",2);		
		myDog.makeSound();
		myDog.fetch();
	}
}
