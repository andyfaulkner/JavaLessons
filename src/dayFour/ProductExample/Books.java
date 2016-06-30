package dayFour.ProductExample;

/**
 * Created by student on 30-Jun-16.
 */
public class Books {
    private String title;
    private String author;
    private String synopsis;
    private double price;

    public Books() {
    }

    public Books(String title, String author, String synopsis, double price) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.price = price;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
