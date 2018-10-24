package day09;

public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Account a1 = new Account ("2017-001", "홍길동", -500);
			a1.print();
			Account a2 = new Account ("2017-002", "고길동", 5500);
			a2.print();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End");

	}

}
