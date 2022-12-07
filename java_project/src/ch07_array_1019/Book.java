package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;
	private int price;
	
	
	public Book(){} // 기본생성자
	
	//generate constructor using field
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public Book(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	
	// getter, setter
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	// showbookinfo 함수 생성
	public void showBookInfo(){
		System.out.println(bookName + "," + author + " 가격은 : " + price );
	}
}
