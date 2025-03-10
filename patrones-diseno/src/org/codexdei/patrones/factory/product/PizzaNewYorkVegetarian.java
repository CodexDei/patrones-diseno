package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaNewYorkVegetarian extends PizzaProduct {

    public PizzaNewYorkVegetarian() {

        super();
        name = "Vegetarian Pizza New York";
        dough = "vegan whole wheat dough";
        sauce = "tomato-based";
        toppings.add("vegan cheese");
        toppings.add("spinach");
        toppings.add("spinach");
        toppings.add("muchroom");
        toppings.add("onion");
    }

    @Override
    public void cook() {

        System.out.println("Cooking for 25 minutes at 180 degrees");

    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into squares");

    }
}
