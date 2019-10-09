package pattern.builder;

import pattern.builder.meal.Meal;
import pattern.builder.model.burguer.ChickenBurguer;
import pattern.builder.model.burguer.VegBurguer;
import pattern.builder.model.colddrink.Coke;
import pattern.builder.model.colddrink.Pepsi;

public class Main {

    public static void main(String[] args) {
        Meal meal1 = new Meal.Builder().addItem(new VegBurguer()).addItem(new Coke()).build();
        System.out.println("First meal");
        meal1.showItems();
        System.out.println("Total: " + meal1.getCost());
        System.out.println("---------------------");


        Meal meal2 = new Meal.Builder().addItem(new ChickenBurguer()).addItem(new Coke()).build();
        System.out.println("Second meal");
        meal2.showItems();
        System.out.println("Total: " + meal2.getCost());

        System.out.println("---------------------");
        Meal meal3 = new Meal.Builder().addItem(new ChickenBurguer()).addItem(new VegBurguer()).addItem(new Pepsi()).build();
        System.out.println("Third meal");
        meal3.showItems();
        System.out.println("Total: " + meal3.getCost());
        
    }
}
