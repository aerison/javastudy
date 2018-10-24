package day08;

public class Shape {

	public abstract double area();
}

interface Colorable{
	
	public void color(String color);
	
}

interface Drawble {
	public void drow();
	
}

interface T extends Shape,Colorable,Drawable{}
