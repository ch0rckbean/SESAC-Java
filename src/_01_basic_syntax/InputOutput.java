package _01_basic_syntax;
import java.util.Scanner;

// 입출력
public class InputOutput {
	public static void main(String[] args) {
		// 출력
		System.out.println("안녕하세요");
		System.out.print("저는 새싹이에요\n");
		System.out.println("오네가이시마스");
		
		// 입력
		System.out.println("공백으로 구분해서 이름,나이,키,결혼 여부를 입력해주세요");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next(); //공백 이전까지의 문자열 읽기
		int age=sc.nextInt(); // 공백 이전까지의 정수 읽기
		double height = sc.nextDouble(); // 공백 이전까지의 실수 읽기
		boolean single=sc.nextBoolean(); // 공백 이전까지의 논리값 읽기
		

	    System.out.println("==== 입력 결과 출력 ====");
	    System.out.println("이름: " + name);
	    System.out.println("나이: " + age);
	    System.out.println("키: " + height);
	    System.out.println("결혼 여부: " + single);

	    //sc.close(); // 스캐너 닫기

/////////////////////	    
	    System.out.println("==== 실습 ====");
		

	    Scanner sc2=new Scanner(System.in);
	    System.out.println("이름을 입력해주세요");
	    String name2=sc.next();
		System.out.println("나이를 입력해주세요");
		int age2=sc2.nextInt();
		System.out.println("안녕하세요!"+name2+"님 -"+age2+"세");

		sc2.close();


	}

}
