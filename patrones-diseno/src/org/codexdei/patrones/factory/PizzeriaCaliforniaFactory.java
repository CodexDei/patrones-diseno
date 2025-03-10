package org.codexdei.patrones.factory;

import org.codexdei.patrones.factory.product.PizzaCaliforniaCheese;
import org.codexdei.patrones.factory.product.PizzaCaliforniaMuchromm;
import org.codexdei.patrones.factory.product.PizzaCaliforniaVegetarian;

public class PizzeriaCaliforniaFactory extends PizzeriaZoneAbstractFactory {

    @Override
    PizzaProduct createPizza(String type) {
        return switch (type){
            case "vegetarian" -> new PizzaCaliforniaVegetarian();
            case "cheese" -> new PizzaCaliforniaCheese();
            case "muchroom" -> new PizzaCaliforniaMuchromm();
            default -> null;
        };
    }
}
