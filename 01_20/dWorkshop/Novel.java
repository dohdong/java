package dWorkshop;

public class Novel extends Book {
	
	private String author;
	
	public Novel (String title, int price, String author) {
		super(title, price);
		this.author = author;
		
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		
		return "[제목]"+getTitle()+"\t"+"[가격]"+getPrice()+"\t"+"[작가]"+getAuthor();
	}

}
