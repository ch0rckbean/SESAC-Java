package _05_class._interface;

public class CdPlayer implements Music {

		@Override
		  public void play() {
			System.out.println("=== CD ===");
		    System.out.println("CD 플레이어에서 음악을 재생 시작합니다.");
		  }
		@Override
		  public void stop() {
		    System.out.println("CD 플레이어에서 음악을 재생 중지합니다.");
		  }
}
