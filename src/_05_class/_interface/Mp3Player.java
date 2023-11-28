package _05_class._interface;

public class Mp3Player implements Music {
	@Override
	  public void play() {
		System.out.println("=== MP3 ===");
	    System.out.println("MP3 플레이어에서 음악을 재생 시작합니다.");
	  }
	@Override
	  public void stop() {
	    System.out.println("MP3 플레이어에서 음악을 재생 중지합니다.");
	  }
}
