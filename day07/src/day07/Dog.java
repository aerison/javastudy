package day07;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		//super();
		super("강아지과");
	}
	
	public Dog(String kind, String name) {
		super ("강아지과");
		this.kind = kind;
		this.name = name;
	}
	
	public void print() {
		System.out.println("%s, %s, %n", kind,kind,name);
	}

}
