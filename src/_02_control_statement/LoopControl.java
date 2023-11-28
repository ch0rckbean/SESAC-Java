package _02_control_statement;
import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// for-each문
		String[] arr= {"a","b","c","d"};
		for (String a :arr) {			
			System.out.println(a);
		}
		
		///////실습
		System.out.println("나이를 입력해주세요");

		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=1 && age<=7) {
			System.out.println("유아");
		}else if(age>=8 && age<=13){
			System.out.println("초등학생");
		}else if(age>=14 && age<=16){
			System.out.println("중학생");
		}else if(age>=17 && age<=19){
			System.out.println("고등학생");
		}
		
	}

}