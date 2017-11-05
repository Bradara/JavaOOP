package BookShop;

public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price*1.3);
    }
}
