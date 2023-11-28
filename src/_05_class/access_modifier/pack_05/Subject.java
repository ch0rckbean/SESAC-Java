package _05_class.access_modifier.pack_05;

public class Subject {
	private int grade;
	private String name;
	
	public Subject(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		if(grade<0) {
			this.grade=0;
		}else {
			this.grade=grade;
		}
	}
}
