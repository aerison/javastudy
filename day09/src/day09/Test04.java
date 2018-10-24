package day09;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		//Book[] books = new Book[2];
		
		List<Book> bookList = new ArrayList<>();
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("sample.txt"));
			
			while(scanner.hasNextLine()) {
				String read = scanner.nextLine();
				String[] data = read.split("/");
				String title = data[0];
				int price = Integer.parseInt(data[1].trim());
			}
			
		} catch (FileNotFoundExccetion e) {
			
		} finally {
			if (scanner != null) scanner.close();
		}

		//Book book = new Book("", 0);
		//bookList.add(book);
		
		System.out.println("*** Book 정보 출력 ***");
		Iterator<Book> ib = bookList.iterator();
		while (ib.hasNext()) {
			Book book = (Book) ib.hasNext();
			System.out.println(book);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("가격 3만 미만인 정보 검색 결과 리스트");
		
		ib = bookList.iterator();
		while (ib.hasNext()) {
			Book book = (Book) ib.next();
			if(book.price > 30000) {
				System.out.println(book);
			}
		}
		
		System.out.println("------------------------------");
		
		/*
		 SQL				/	26000
		 java programming	/	37000
		 데이터베이스			/	33000
		 ASP				/	24000
		 JSP				/	28000
		 네트워크				/	32000
		 spring framework	/	34000
		 파이선				/	22000
		 
		 */
	}

}
