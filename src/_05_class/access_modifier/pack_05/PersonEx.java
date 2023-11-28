package _05_class.access_modifier.pack_05;

public class PersonEx {
	public static void main(String[] args) {
		Person p1=new Person("minion");
		Person p2=new Person("pooh");

//		p1.age=5; // age 필드는 private 선언했기에 직접 접근 불가
		// => setter 통해 값 변경 필요
		p1.setAge(5);
		System.out.printf("%s의 나이: %d %n",p1.getName(),p1.getAge());
		
		p2.setAge(-6);
		System.out.printf("%s의 나이: %d %n",p2.getName(),p2.getAge());
		
	}
}
