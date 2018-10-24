package day07;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Animal f = new Fish("ÄíÄí");
		 f.breath();
		 if ( f instanceof Dog) {
			 ((Dog)f).print();
		 }
		 if (f instanceof Fish) {

		 System.out.println("-------------------");
		 
		 Animal[] animals = {
				 new Fish("ÄíÄí"),
				 new Fish("±¸ÇÇ"),
				 new Dog("Áøµ¾°³", "ÂĞÂĞ")
		 };
		 
		 for(int i=0; i<animals.length; i++) {
			 animals[i].breath();
			 if(animals[i] instanceof Dog) {
			 ((Dog)animals[i]).print();
		 }
			 
			 if(animals[i] instanceof Fish) {
				 ((Fish)animals[i]).print();
			 }
		 
		 
		 }

     }
   }
}
