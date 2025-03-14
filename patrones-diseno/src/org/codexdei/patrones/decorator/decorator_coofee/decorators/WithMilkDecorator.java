package org.codexdei.patrones.decorator.decorator_coofee.decorators;

import org.codexdei.patrones.decorator.decorator_coofee.Configurable;

public class WithMilkDecorator extends CoffeeDecorator {


    public WithMilkDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 3.7f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", milk";
    }
}
