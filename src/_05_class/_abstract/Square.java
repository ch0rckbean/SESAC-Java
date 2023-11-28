package _05_class._abstract;

//구체적인 클래스 - 도형(사각형)
public class Square extends Shape {
	double width,height;
	
	public Square(String color,String type) {
		super(color,type); // 부모 생성자 호출
	}
	
	@Override
	void draw() {
	System.out.println("사각형 그리는 즁");
	}
	
	public void set(double width,double height) {
		this.width=width;
		this.height=height;
	}
	@Override
	double calculateArea() {
		return (width*height);
		
	}
	
}