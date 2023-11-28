package _05_class._interface;

interface Controller{
	void powerOn();
	void powerOff();
}

class Tv implements Controller{
	@Override
	public void powerOn(){
		System.out.println("tv 전원 킴");
	}
	
	@Override
	public void powerOff(){
		System.out.println("tv 전원 끔");
	}
}
class Computer implements Controller{
	@Override
	public void powerOn(){
		System.out.println("컴퓨터 전원 킴");
	}
	@Override
	public void powerOff(){
		System.out.println("컴퓨터 전원 끔");
	}
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		Tv tv=new Tv();
		Computer cpt = new Computer();
		
		tv.powerOn();
		tv.powerOff();
		
		cpt.powerOn();
		cpt.powerOff();

	}

}
