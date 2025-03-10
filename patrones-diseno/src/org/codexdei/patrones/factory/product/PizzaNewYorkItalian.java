package org.codexdei.patrones.factory.product;

import org.codexdei.patrones.factory.PizzaProduct;

public class PizzaNewYorkItalian extends PizzaProduct {

    public PizzaNewYorkItalian() {

        super();
        name = "Pizza Italian New York";
        dough = "Dough thick-crust";
        sauce = "meat sauce";
        toppings.add("Parma ham");
        toppings.add("Mozarella cheese");
        toppings.add("Basil");
        toppings.add("Olive Oil");
    }

    @Override
    public void cook() {

        System.out.println("Cooking the pizza for 30 minutes at 120 degreess");
    }

    @Override
    public void cut() {

        System.out.println("Cutting the pizza into triangles");
    }
}
