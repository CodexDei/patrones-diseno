package org.codexdei.patrones.decorator.decorator_coofee.decorators;

import org.codexdei.patrones.decorator.decorator_coofee.Configurable;

abstract public class CoffeeDecorator implements Configurable {

    protected Configurable coffee;

    public CoffeeDecorator(Configurable coofee) {
        this.coffee = coofee;
    }
}
