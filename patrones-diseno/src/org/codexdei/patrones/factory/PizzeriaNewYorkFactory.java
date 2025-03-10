package org.codexdei.patrones.factory;

import org.codexdei.patrones.factory.product.PizzaNewYorkItalian;
import org.codexdei.patrones.factory.product.PizzaNewYorkPepperoni;
import org.codexdei.patrones.factory.product.PizzaNewYorkVegetarian;

public class PizzeriaNewYorkFactory extends PizzeriaZoneAbstractFactory {

    @Override
    PizzaProduct createPizza(String type) {

        return switch (type){

            case "vegetarian" -> new PizzaNewYorkVegetarian();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italian" -> new PizzaNewYorkItalian();
            default -> null;
        };
    }
}
