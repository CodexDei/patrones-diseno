package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaCaliforniaMuchromm extends PizzaProduct {

    public PizzaCaliforniaMuchromm() {

        super();
        name = "Pizza Muchromm California";
        dough = "Hand tossed crust";
        sauce = "White Sauce";
        toppings.add("Goat cheese");
        toppings.add("Extra muchroom");
        toppings.add("Breast chicken");

    }

    @Override
    public void cook() {

        System.out.println("Cooking the pizza for 50 min at 55 degrees");

    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza  into slices");

    }
}
