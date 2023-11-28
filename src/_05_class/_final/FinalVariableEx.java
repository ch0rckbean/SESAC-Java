package _05_class._final;

//final 필드
//- final 키워드가 지정된 변수는 한 번 초기화되면 값 변경 불가

public class FinalVariableEx {
	
	public static void main(String[] args) {
		final int finalNum=1;
		
//		finalNum=5; // Error: final 변수에 값 할당 불가
		//final 필드는 오로지 '읽기 전용'
		System.out.println("Final Num: "+finalNum);
	}

}
