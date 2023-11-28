package _05_class._abstract;

// 구체적인 클래스 - 도형(원)
public class Circle extends Shape {
	double radius;
	
	public Circle(String color,String type) {
		super(color,type); // 부모 생성자 호출
		
	}
	
@Override
	void draw() {
	System.out.println("원 그리는 즁");
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	double calculateArea(){
		return (radius*radius*3.14);
	}


}
