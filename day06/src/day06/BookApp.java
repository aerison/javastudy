package day06;

public class BookApp {

	public static void main(String[] args) {
		
		Book mgr = new Book();
		
		boolean ture;
		while(ture) {
		System.out.println("선택하세요");
		System.out.println("1. 책 입력");
		System.out.println("2. 책 삭제");
		System.out.println("3. 책 검색");
		System.out.println("4. 책 보기");
		System.out.println("5. 프로그램 종료");
		System.out.println("선택 -> ");
		
		String input = scanner.nextLine();
		switch (input.charAt(0)) {
		case '1';
		System.out.println("등록할 책 정보를 입력하세요");
		System.out.println("입력 예 -> title/가격 (머리 속에 안들어 온다 / 1270000000");
		String data = scanner.nextLine();
		String[] b = data.split("/");
		String title = b[0];
		int prince = Integer.parseInt(b[1]);
		mgr.addBook(title, price);

		
		break;
		
case '2';
System.out.println("서비스예정");
		
		break;
		
case '3';
System.out.println("서비스예정");

break;

case '4';
mgr.bookList();
break;

case '5';
System.out.println("종료합니다");
return;
		
		default:
			System.out.println("다시 입력 하세요");

			break;
		}

	}

 }
}
