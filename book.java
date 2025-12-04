public class book{
    private String title;
    private String author;
    private double price;

    public book(){
        this.title = "title";
        this.author = "author";
        this.price = 0.0;
    }
    public book(String title,String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;}

    public void displayDetails(){
        System.out.println("Title"+title);
        System.out.println("Author"+author);
        System.out.println("Price:"+price);}
}