package _05_class._abstract;

public class ShapeEx {
	public static void main(String[] args) {
		Circle c=new Circle("blue","Circle");
		Square s=new Square("lime","Square");
		c.setRadius(4);
		s.set(4,12);
		
		printShape(c);
		printShape(s);		
		
//		c.start();
//		c.draw(); // 추상 메소드 구현
//		System.out.println("원의 색상은 "+c.getColor());
//		c.setRadius(4);
//		c.calculateArea();
//		
//		s.start();
//		s.draw(); //추상 메소드 구현
//		System.out.println("사각형의 색상은 "+s.getColor());
//		s.set(4,12);
//		s.calculateArea();
	}
	public static void printShape(Shape s) {
		System.out.println("=======\n"+s.type+" 도형의 정보\n"+s.color+"\n"+"도형의 넓이"+s.calculateArea());

	}
}
