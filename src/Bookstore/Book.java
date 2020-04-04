package Bookstore;

public class Book {
    private String ID;
    private String name;
    private double price;

    public Book(String ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.println("----------Book Info------------");
        System.out.println("BookID \t\t:" + this.getID());
        System.out.println("BookName \t:" + this.getName());
        System.out.println("BookPrice \t:" + this.getPrice());
    }
}
