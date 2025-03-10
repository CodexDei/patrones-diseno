package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaCaliforniaCheese extends PizzaProduct {

    public PizzaCaliforniaCheese() {

        super();
        name = "Pizza Pepperoni California";
        dough = "Thin crust";
        sauce = "Arugula tomato sauce";
        toppings.add(" Extra Mozarella cheese");
        toppings.add("muchroom");
        toppings.add("Oregano");
    }

    @Override
    public void cook() {

        System.out.println("Cooking the pizza for 35 minutes at 100 degrees");
    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into squares");
    }
}
