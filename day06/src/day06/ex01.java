package day06;

public class ex01 {

	public static void main(String[] args) {
		Account a1 = new Account(); 
		a1.setName("�踻��");
		a1.setNumber("2018-002");
		a1.setMoney(9000);
		a1.print();
		a1.output(800);
		
		Account a2 = new Account();
		//a2.number = "2018-001";
		//a2.name = "ȫ�浿";
		a2.setNumber("2018-001");
		a2.setName("ȫ�浿");
		a2.setMoney(-7000);
		a2.input(a1.output(1000000000));
		
		a2.print();
		
		//System.out.println(a2.getMoney());
		
		//System.out.println(a2.money);
	}

}

//static ������ this( ����  ~ ��) ��� Ű���带 �� �� ����

/* 
 	��ü���� ���α׷���
 	Encapsulation(ĸ��ȭ) -> data hidden
 	
 	Inheritance(���) -> java ������ ���� ���
 	
 	Message(�޼���) -> ��ü���� ���� ��� [ car.changeGear(lowerGear); ]
 	
 	Polymorphism(������) ��������� -> 
 */