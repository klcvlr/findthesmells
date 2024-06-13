package com.zenika.findthesmells.smell5;

import java.util.List;

public class OrderProcessor {

    public void processOrder(List<MenuItem> orderedItems) {
        for(MenuItem item : orderedItems) {
            if(item.price() <= 0) {
                System.out.println("Error: Invalid price for " + item.name());
                return;
            }
        }

        double total = 0;
        for(MenuItem item : orderedItems) {
            total += item.price();
        }

        System.out.println("-------- Order Details --------");
        System.out.println("Total Items: " + orderedItems.size());

        for(MenuItem item : orderedItems) {
            System.out.println(item.name() + " - $" + item.price());
        }

        System.out.println("Total Price: $" + total);
        System.out.println("------------------------------");
    }
}
