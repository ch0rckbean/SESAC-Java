package _05_class.access_modifier.pack_05._static;

public class StudentsEx {

	public static void main(String[] args) {
		
		new Student("이름",32,1);
		Student.displayInfo();

		new Student("이름12",3,4);
		Student.displayInfo();

		new Student("이름23",33,4);
		Student.displayInfo();
	}

}
