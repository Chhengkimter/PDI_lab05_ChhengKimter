
class Book{

	private String title;
	private String author;
	private float price;
	Book(){
		this.title = "Null";
		this.author = "Null";
		this.price = 0;
	}
	Book(String title, String author, float price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void display() {
	 System.out.printf("%-20s %-15s $%.2f\n", title, author, price);
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = (float) d;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-20s %-15s %s\n", "Title", "Author", "Price");
		System.out.println("=".repeat(45));
		Book x1 = new Book();
		x1.display();
		
		Book x2 = new Book("The rise Empire", "Jame Gun", 25);
		x2.display();
		 x1.setTitle("Effective Java");
	     x1.setAuthor("Joshua Bloch");
	     x1.setPrice(52.40);
	     x1.display();
	}

}
