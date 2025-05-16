package FKnapsack;

import java.util.ArrayList;
import java.util.List;

public class Fk {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(60, 10));
        items.add(new Item(100, 20));
        items.add(new Item(120, 30));
        int capacity = 50;
        FractionalKnapsack obj = new FractionalKnapsack();
        double maxValue = obj.getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
