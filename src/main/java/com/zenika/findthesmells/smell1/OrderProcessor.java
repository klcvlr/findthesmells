package com.zenika.findthesmells.smell1;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {
    private Map<Item, Integer> itemsWithQuantity = new HashMap<>();

    public void addItem(Item item) {
        itemsWithQuantity.compute(item, (Item key, Integer quantity) -> quantity != null ? quantity + 1 : 1);
    }

    public String print() {
        StringBuilder html = new StringBuilder("<table><thead><tr><th>Item</th><th>Price</th><th>Quantity</th></tr></thead><tbody>");

        for (Map.Entry<Item, Integer> item : itemsWithQuantity.entrySet()) {
            html.append("<tr><td>")
                .append(item.getKey().name())
                .append("</td><td>")
                .append(item.getKey().price())
                .append("</td><td>")
                .append(item.getValue())
                .append("</td></tr>");
        }

        html.append("</tbody></table>");

        return html.toString();
    }
}
