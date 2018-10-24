package day08;

public class  Circle extends Object implements Shape, Colorable, Drawble {
	int r;
	
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	
	@Override
	public void draw()
	{
		System.out.println("Circle 그리기");
	}
	
	@Override
	public void color(String color) {
		System.out.println(color + " 색칠하기");
	}
	

}

class Rectangle implements Shape {
	
	int w = 7;
	int h = 3;
	
	@Override
	public double area() {
		return w*h;
	}
	
}
