package org.codexdei.patrones.factory.example;

import org.codexdei.patrones.factory.PizzaProduct;
import org.codexdei.patrones.factory.PizzeriaCaliforniaFactory;
import org.codexdei.patrones.factory.PizzeriaNewYorkFactory;
import org.codexdei.patrones.factory.PizzeriaZoneAbstractFactory;

public class FactoryExample {

    public static void main(String[] args) {

        PizzeriaZoneAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZoneAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProduct pizza = california.orderPizza("cheese");
        System.out.println("Marye orders a " + pizza.getName());

        pizza = ny.orderPizza("italian");
        System.out.println("Samy orders a " + pizza.getName());

        pizza = california.orderPizza("muchroom");
        System.out.println("Jey orders a " + pizza.getName());

        pizza = ny.orderPizza("pepperoni");
        System.out.println("Oscar orders a " + pizza.getName());

        System.out.println("pizza = " + pizza);

    }
}
