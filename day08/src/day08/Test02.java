package day08;

public class Test02 {
	public static void main(String[] args) {
		Circle c = new Circle();
		//c.draw();
		//c.color("»¡°­");
		//System.out.println(c.area());
		
		Rectangle r = new Rectangle();
		//r.draw();
		//r.color("³ë¶û");
		//System.out.println(r.area());
		
		Drawble s = c;
		s.draw();
		((Colorable)s).color("RED");
		System.out.println("---------");
		T[] t = { r, c};
		for (int i = 0; i<t.length; i++ ) {
		T t = c;
		t[i].draw();
		t[i].color("Yellow);"
		System.out.println(t[i].area());
		}
	}

}
