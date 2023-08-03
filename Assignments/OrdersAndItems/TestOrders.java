package Assignments.OrdersAndItems;

import java.util.ArrayList;
import java.util.List;

public class TestOrders {
    public static void main(String[] args) {
        // Create some items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.99;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.49;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.99;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.99;

        // Create some orders
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Print order1 to the console
        System.out.println("Order 1:");
        System.out.println("Name: " + order1.name);
        System.out.println("Total: " + order1.total);
        System.out.println("Ready: " + order1.ready);

        // Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // Noah ordered a cappuccino. Add the cappuccino to their order list and to
        // their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // Sam added a latte. Update the order accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);

        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;

        // Print out the orders
        System.out.println("Order 1:");
        System.out.println("Name: " + order1.name);
        System.out.println("Total: " + order1.total);
        System.out.println("Ready: " + order1.ready);

        System.out.println("Order 2:");
        System.out.println("Name: " + order2.name);
        System.out.println("Total: " + order2.total);
        System.out.println("Ready: " + order2.ready);

        System.out.println("Order 3:");
        System.out.println("Name: " + order3.name);
        System.out.println("Total: " + order3.total);
        System.out.println("Ready: " + order3.ready);

        System.out.println("Order 4:");
        System.out.println("Name: " + order4.name);
        System.out.println("Total: " + order4.total);
        System.out.println("Ready: " + order4.ready);
    }
}