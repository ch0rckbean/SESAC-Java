package _05_class;

// 클래스
// - 객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성

public class Student { // 공개 클래스 선언
	// 1.필드
	public String name;
	public int grade;
	
	// 2.메소드
	// 2-1. 생성자
	public Student(String name, int grade) {
		//this : 자기 자신(보통 this를 써서 명시적으로 구별 해 줌)
		//this.name, this.grade: 현재 인스턴스의 name,grade 멤버 변수
		//멤버 변수, 매개변수 이름이 동일하다면, this 이용해 구분 
		this.name=name; // 매개변수의 name을 현재 객체의 name 멤버 변수 할당
		this.grade=grade; //// 매개변수의 grade를 현재 객체의 grade 멤버 변수 할당
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	// 2-2. 일반 메소드
	// 1)인자 x, 반환값 x
	public void goToSchool() {
		System.out.println("학교 가잣!");
	}
	// 2)인자 o, 반환값 x
	public void study(String subject) {
		System.out.printf("%s 과목 공부 중!!\n",subject);
	}
	// 3)인자 x, 반환값 o
	public int getGrade() {
		return this.grade;
	}
	// 4)인자 o, 반환값 o
	public String getTestResult(int score) {
		return this.name + "학생의 점수 : "+ score;
	}
}
