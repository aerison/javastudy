package day08.inner;

import day08.Animal;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal() {
			@Override
			public void breath() {
				System.out.println("�ư��̷� ����");
			}
		};
		a.breath();

	}

}


class Dog extends Animal{
	@Override
	public void breath() {
		System.out.println("����");
	}
	
}