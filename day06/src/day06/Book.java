package day06;

public class Book {

	 public Book() {}
	 public Book(String title, int price) {
	  this.title = title;
	  this.price = price;
	 }
	 
	 private String title;
	 private int price;
	private Book[] books;
	 
	 public String getTitle() {
	  return title;
	 }
	 public void setTitle(String title) {
	  this.title = title;
	 }
	 public int getPrice() {
	  return price;
	 }
	 public void setPrice(int price) {
	  this.price = price;
	 }
	 
	 public void print() {
	  System.out.println("title : " + title + " / price : " + price);
	 }
	 
	 public void BookManager(Book[] books) {
		 this.books = books;
	 }
	 
	 // 등록, 삭제, 수정, 검색, 조회
	 public void addBook(String title, int price) {
		 int count = 0;
		books[count] = new Book(title, price);
		 count++;
	 }
	 public void bookList() {
		 System.out.println(" *** Book List ***");
		 int count = 0;
		for(int i = 0; i < count; i++) {
			 books[i].print();
		 }
		 System.out.println("--------------------------------------");
	 }
	 
	} 