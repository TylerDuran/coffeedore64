import java.util.*;

public class Order {

    // These are Member Variables
    private String name; // default value of null 
    // private double total; // used in the prior assignment 
    private boolean ready; // default value of false 
    private ArrayList<Item> itemsOrdered = new ArrayList<Item>(); // defaults to null 

        // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "guest";
        this.ready = false;
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
        // Had to refernce the solution code alot to help get me through these
    public void addItem(Item item) {
        this.itemsOrdered.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Hey!, Your order is ready";
        } else {
            return "Thank you for waiting. Your order will be ready soon, hopefully...";
        }
    }

    public double getOrderTotal() {
        double itemsTotal = 0;
        for(Item i: this.itemsOrdered) {
            itemsTotal += i.getPrice();
        }
        return itemsTotal;
        // double sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // return sum;
    }

    public void display() {
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.itemsOrdered) {
            System.out.printf(i.getName() + " - $" + i.getPrice());
        }
        System.out.printf("Total: $" + this.getOrderTotal());
        // for(int i=0; i< this.itemsOrdered.size (); i++){
        //     System.out.println(i + " : " + menuItems.get(i));
        // }
    }

    // GETTERS & SETTERS
    //////////////// Name ///////////////////////////
        // getter Name
    public String getName() {
        return this.name;
    }
        // setter Name
    public void setName(String name) {
        this.name = name;
    }
    //////////////// Ready ///////////////////////////
        // getter Ready
    public boolean getReady() {
        return this.ready;
    }
        // setter Ready
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    //////////////// Items ///////////////////////////
            // getter Ready
    public ArrayList<Item> getItemsOrdered() {
        return itemsOrdered;
    }
        // setter Ready
    public void setItemsOrdered(ArrayList<Item> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
}