package _05_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {

	// 필드
	private int width,height;
	
	public Rectangle(int width) {
		this.width=width;
	}
	
	public int getWidth() {
		return width; 
	}
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
	public int area(int width,int height) {
		return this.width*this.height;
	}
	
	public static void main(String[] args) {

	
		
		// 메소드 사용
		
		ArrayList<Rectangle> rect=new ArrayList<>();
		boolean run=true;

		while (run) {
			
		// 사용자 입력
				System.out.println("사각형 가로,세로 입력하세요");
				Scanner sc=new Scanner(System.in);
				int w=sc.nextInt();
				int h=sc.nextInt();
				
				// 객체 생성
				Rectangle r=new Rectangle(w);
				r.setHeight(h);
				rect.add(r);
				
				if(w==0 && h==0) {
					for(int i=0; i<rect.size(); i++) {
						System.out.printf("사각형 가로는 : %d\n",rect.get(i).getWidth());
						System.out.printf("사각형 세로는 : %d\n",rect.get(i).getHeight());
						System.out.printf("사각형 넓이는 : %d\n",rect.get(i).width*rect.get(i).height);
						System.out.println("------");
						run=false;
					}
				}
		}
		System.out.printf("사각형 인스턴스의 개수는: %d개",rect.size());
		
}
}
