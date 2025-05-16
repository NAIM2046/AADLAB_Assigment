package FKnapsack;

import java.util.List;

public class FractionalKnapsack {
    public double getMaxValue(List<Item> items, int capacity) {
        items.sort((a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));
        double totalValue = 0.0;
        for (Item item : items) {
            if (capacity == 0) {
                break;
            }
            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                double f = (double) capacity / item.weight;
                totalValue += item.value * f;
                capacity = 0;
            }
        }

        return totalValue;
    }
}
