package _05_class._final;

public class ConstEx {
	public static void main(String[] args) {
		
		// 상수 읽기
		// static 필드이므로 객체 생성없이 클래스명. 필드명으로 바로 접근
		System.out.println(Const.MAX_VAL);
		System.out.println(Const.GREETING);
		
		// 상수는 final 하므로 값 수정 불가
//		Const.MAX_VAL=20;
//		Const.GREETING="Hi";
	}
}
