    package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaCaliforniaVegetarian extends PizzaProduct {

    public PizzaCaliforniaVegetarian() {

        super();
        name = "Vegetarian Pizza California";
        dough = "light thin crust";
        sauce = "Sauce BBQ light";
        toppings.add("vegan cheese");
        toppings.add("Olives");
        toppings.add("spinach");
        toppings.add("onion");
    }

    @Override
    public void cook() {

        System.out.println("Cooking for 20 minutes at 120 degrees");

    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into triangules");

    }
}
