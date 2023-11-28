package _02_control_statement;

// 메소드
// - 객체가 갖는 기능(동작)

/*
 접근 제한자 리턴타입 메서드명(매개변수1, 매개변수2, ...){
 	메서드 행위
 	return 반환값;
 }
 */

public class Method {

	public static void main(String[] args) {
		hello();
		System.out.println(sum1(1,10));
		System.out.println(sum2(30,40));
		
//		int []numbers= {10,20};
		int []numbers2= {10,20,30,40,50};

//		System.out.println(nul1(numbers));
		System.out.println(nul2(numbers2));

	}
	// 메소드
	// 1. 반환값이 없는 메소드
	public static void hello() {
		System.out.println("안녕");		
	}
	
	// 2. 반환값이 있는 메소드
	// - 리턴 타입과 return 에서 실제 반환하는 데이터 형식이 일치해야함
	public static int sum1(int x, int y) {
		return x+y;
	}
	public static String sum2(int x, int y) {
		return "x+y="+(x+y);
	}

	// call by value(값 전달)
	public static int nul1(int x, int y) {
		return x+y;
	}
	// call by reference(참조 전달)
	public static int nul2(int[] nums) {
		int sum=1;
		//TODO: 인자로 받아오는 배열 원소값 모두 곱하기
//		for(int i=0; i<nums.length; i++) {
//			sum*=nums[i];
//		}
		for(int n : nums) {
			sum*=n;
		}
		return sum;
	}
	
	
}
