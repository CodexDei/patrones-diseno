package org.codexdei.patrones.decorator.decorator_coofee.decorators;

import org.codexdei.patrones.decorator.decorator_coofee.Configurable;

public class WithChocolateDecorator extends CoffeeDecorator {

    public WithChocolateDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", chocolate";
    }
}
