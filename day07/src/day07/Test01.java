package day07;

public class Test01 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.breath();
		System.out.println(a.kind);
		
		Dog d = new Dog();
		d.breath();
		System.out.println(((Animal)d).kind);
		d.print();
		
		Dog d2 = new Dog();
		
		System.out.println(d2.kind);
		
	}
}
