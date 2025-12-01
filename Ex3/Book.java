package Ex3;

//Exercise 3

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "None";
        author = "None";
        price = 0;
    }

    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println(title + ", " + author + ", " + price);
    }
}
