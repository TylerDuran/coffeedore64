import java.util.*;

public class Item  {

    // These are Member Variables
    private String name;
    private double price;
    private int index;

    public Item() {
        
    }

    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price) {
        // setting the attribute to the paramters 
        this.name = name;
        this.price = price;
    }
    // GETTERS & SETTERS  - for name and price
        // getter Name
    public String getName() {
        return this.name;
    }
        // setter Name
    public void setName(String name) {
        this.name = name;
    }

        // getter Price
    public double getPrice() {
        return this.price;
    }
        // setter Price
    public void setPrice(double price) {
        this.price = price;
    }

        // getter Index
    public double getIndex() {
        return this.index;
    }
        // setter Index
    public void setIndex(int index) {
        this.index = index;
    }
    
}