package org.codexdei.patrones.factory;

abstract public class PizzeriaZoneAbstractFactory {

    public PizzaProduct orderPizza(String type){

        PizzaProduct pizza = createPizza(type);

        System.out.println("------ Factoring pizza of " + pizza.getName() + "-----------");

        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract PizzaProduct createPizza(String type);
}
