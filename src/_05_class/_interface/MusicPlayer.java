package _05_class._interface;

public class MusicPlayer {

	public static void main(String[] args) {
		CdPlayer cd=new CdPlayer();
		cd.play();
		cd.stop();
		
		Mp3Player mp3=new Mp3Player();
		mp3.play();
		mp3.stop();
	}

}
