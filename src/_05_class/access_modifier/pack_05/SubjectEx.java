package _05_class.access_modifier.pack_05;

public class SubjectEx {

	public static void main(String[] args) {
		Subject s1=new Subject("객체지향프로그래밍");
		Subject s2=new Subject("컴퓨터그래픽스");

		s1.setGrade(2);
		System.out.printf("%s 과목의 권장 학년: %d\n",s1.getName(),s1.getGrade());
		s2.setGrade(-4);
		System.out.printf("%s 과목의 권장 학년: %d",s2.getName(),s2.getGrade());
	}

}
