package day08.inner;

import day08.Animal;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal() {
			@Override
			public void breath() {
				System.out.println("아가미로 동작");
			}
		};
		a.breath();

	}

}


class Dog extends Animal{
	@Override
	public void breath() {
		System.out.println("동작");
	}
	
}