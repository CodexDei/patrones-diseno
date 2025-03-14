package org.codexdei.patrones.decorator.decorator_coofee.decorators;

import org.codexdei.patrones.decorator.decorator_coofee.Configurable;

public class WithCreamDecorator extends CoffeeDecorator {

    public WithCreamDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", cream";
    }
}
