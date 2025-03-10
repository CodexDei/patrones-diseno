package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaNewYorkPepperoni extends PizzaProduct {

    public PizzaNewYorkPepperoni() {

        super();
        name = "Pizza Pepperoni New York";
        dough = "stone-baked thin crust";
        sauce = "tomato sauce";
        toppings.add("Mozarella cheese");
        toppings.add("Extra Pepperoni");
        toppings.add("Oregano");
    }

    @Override
    public void cook() {

        System.out.println("Cooking the pizza for 40 minutes at 90 degreess");
    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into slices");
    }
}
