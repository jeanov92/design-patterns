package pattern.builder;

import pattern.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    public List<Item> items;

    private Meal(){

    }

    public float getCost() {
        return (float) items.stream().mapToDouble(item -> item.price()).sum();
    }

    public void showItems() {
        items.stream().forEach(item -> {
            System.out.println("Name: " + item.name());
            System.out.println("Package: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        });
    }

    public static class Builder {
        List<Item> items = new ArrayList<>();

        public Builder addItem(Item item) {
            this.items.add(item);
            return this;
        }

        public Meal build () {
            Meal meal = new Meal();
            meal.items = this.items;
            return meal;
        }
    }
}
