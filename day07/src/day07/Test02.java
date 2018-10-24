package day07;

public class Test02 {

	public static void main(String[] args) {
		//Object obj = new Dog();
		Object obj = new String("~~~");
		if(obj instanceof Dog) {             //객체 타입 비교 연산자
		((Dog)obj).print();
		
		Dog d = (Dog) obj;
		d.breath();
		
		}
		
		if(obj instanceof String) {
			String s = (String)obj;
			System.out.println(s.length());
		}

	}

}
