package _05_class.access_modifier.pack_05._static;

public class Student {
	static String name;
	static int student_ID;
	static int grade;
	static int totalStu;

	public Student(String name, int grade, int student_ID){
		this.name=name;
		this.grade=grade;
		this.student_ID=student_ID;
		
		totalStu+=1;
	}
	
	public String getName() {
		return name;
	}
	public int getID() {
		return student_ID;
	}
	public int getGrade() {
		return grade;
	}
	public void setID(int student_ID) {
		this.student_ID=student_ID;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	static void displayInfo() {
		System.out.println("이름"+name);
		System.out.println("학년"+grade);
		System.out.println("학번"+student_ID);
		System.out.println("총 학생수"+totalStu);
		System.out.println("---------");
		
	}
	
}

