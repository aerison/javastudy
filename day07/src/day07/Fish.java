package day07;

public class Fish {
	String name;
	
	public Fish() {
		super("������");
	}
	
	public Fish(Strin name) {
		super("������");
		this.name = name;
	}
	
	public void print() {
		System.out.printf{"Fish[%s,%s]%n", this.kind,name);
	}
		
		public void breath() {
			System.out.println("�ư��� ~~~");
		}

}
