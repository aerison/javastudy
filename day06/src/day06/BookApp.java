package day06;

public class BookApp {

	public static void main(String[] args) {
		
		Book mgr = new Book();
		
		boolean ture;
		while(ture) {
		System.out.println("�����ϼ���");
		System.out.println("1. å �Է�");
		System.out.println("2. å ����");
		System.out.println("3. å �˻�");
		System.out.println("4. å ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("���� -> ");
		
		String input = scanner.nextLine();
		switch (input.charAt(0)) {
		case '1';
		System.out.println("����� å ������ �Է��ϼ���");
		System.out.println("�Է� �� -> title/���� (�Ӹ� �ӿ� �ȵ�� �´� / 1270000000");
		String data = scanner.nextLine();
		String[] b = data.split("/");
		String title = b[0];
		int prince = Integer.parseInt(b[1]);
		mgr.addBook(title, price);

		
		break;
		
case '2';
System.out.println("���񽺿���");
		
		break;
		
case '3';
System.out.println("���񽺿���");

break;

case '4';
mgr.bookList();
break;

case '5';
System.out.println("�����մϴ�");
return;
		
		default:
			System.out.println("�ٽ� �Է� �ϼ���");

			break;
		}

	}

 }
}
