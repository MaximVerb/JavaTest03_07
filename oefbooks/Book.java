package oefbooks;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    public Book(String name, Author author, double price) {
        this(name,author,price, 0);
    }

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(price < 0)
        {
            this.price = 0;
        }
        else if (price > 0)
        {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if(quantity < 0)
        {
            this.quantity = 0;
        }
        else if (quantity > 0)
        {
            this.quantity = quantity;
        }

    }

    @Override
    public String toString() {
        return String.format(
                "De boeknaam is: %s\n"+
                "De auteur is: %s\n"+
                "De prijs is: %.2f\n"+
                "De hoeveelheid in stock is: %s",getName(),author.toString(),getPrice(),getQuantity());
    }


}
