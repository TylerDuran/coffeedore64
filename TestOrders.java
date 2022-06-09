import java.util.ArrayList;
import java.util.*;


public class TestOrders {
    public static void main(String[] args){

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("drip coffee", 3.50);
        coffeeKiosk.addMenuItem("cappuccino", 1.50);
        coffeeKiosk.addMenuItem("latte", 4.00);
        coffeeKiosk.addMenuItem("mocha", 4.50);


        coffeeKiosk.newOrder();



    }
}
/// Needed a ton of help on this and the solutions were a great reference for struggling my way through this assignment 