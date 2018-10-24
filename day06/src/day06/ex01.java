package day06;

public class ex01 {

	public static void main(String[] args) {
		Account a1 = new Account(); 
		a1.setName("김말숙");
		a1.setNumber("2018-002");
		a1.setMoney(9000);
		a1.print();
		a1.output(800);
		
		Account a2 = new Account();
		//a2.number = "2018-001";
		//a2.name = "홍길동";
		a2.setNumber("2018-001");
		a2.setName("홍길동");
		a2.setMoney(-7000);
		a2.input(a1.output(1000000000));
		
		a2.print();
		
		//System.out.println(a2.getMoney());
		
		//System.out.println(a2.money);
	}

}

//static 에서는 this( 나의  ~ 값) 라는 키워드를 쓸 수 없음

/* 
 	객체지향 프로그래밍
 	Encapsulation(캡슐화) -> data hidden
 	
 	Inheritance(상속) -> java 에서는 단일 상속
 	
 	Message(메세지) -> 객체간에 서로 통신 [ car.changeGear(lowerGear); ]
 	
 	Polymorphism(다형성) 상속이전제 -> 
 */