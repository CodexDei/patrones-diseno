package org.codexdei.patrones.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public PizzaProduct(){

        toppings = new ArrayList<>();
    }

    public void prepare(){

        System.out.println("Preparing the pizza: " + this.name);
        System.out.println("Selecting the dough: " + this.dough);
        System.out.println("Adding the sauce:" + this.sauce);
        System.out.println("Adding toppings:");
        this.toppings.forEach(System.out::println);
    }

    abstract public void cook();

    abstract public void cut();

    public void box(){

        System.out.println("Boxing the pizza");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
