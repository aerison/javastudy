package day07;

public class Fish {
	String name;
	
	public Fish() {
		super("물고기과");
	}
	
	public Fish(Strin name) {
		super("물고기과");
		this.name = name;
	}
	
	public void print() {
		System.out.printf{"Fish[%s,%s]%n", this.kind,name);
	}
		
		public void breath() {
			System.out.println("아가미 ~~~");
		}

}
