package day07;

public class Dog extends Animal {
	String kind = "������ ����";
	String name;
	
	public Dog() {
		//super();
		super("��������");
	}
	
	public Dog(String kind, String name) {
		super ("��������");
		this.kind = kind;
		this.name = name;
	}
	
	public void print() {
		System.out.println("%s, %s, %n", kind,kind,name);
	}

}
