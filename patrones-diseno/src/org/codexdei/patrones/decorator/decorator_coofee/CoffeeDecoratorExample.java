package org.codexdei.patrones.decorator.decorator_coofee;

import org.codexdei.patrones.decorator.decorator_coofee.decorators.WithChocolateDecorator;
import org.codexdei.patrones.decorator.decorator_coofee.decorators.WithCreamDecorator;
import org.codexdei.patrones.decorator.decorator_coofee.decorators.WithMilkDecorator;

public class CoffeeDecoratorExample {

    public static void main(String[] args) {

        Configurable mocha = new Coffee("Coffee Mocha", 7);
        WithCreamDecorator withCream = new WithCreamDecorator(mocha);
        WithMilkDecorator withMilk = new WithMilkDecorator(withCream);
        WithChocolateDecorator withChocolate = new WithChocolateDecorator(withMilk);

        System.out.println("The price of Coofee Mocha is: " + withChocolate.getPriceBase());
        System.out.println("The ingredients: " + withChocolate.getIngredients());

        Configurable capuchino = new Coffee("Coofee Capuchino", 4);
        withCream = new WithCreamDecorator(capuchino);
        withMilk = new WithMilkDecorator(withCream);

        System.out.println("The price of Coffee Capuchino is:" + withMilk.getPriceBase());
        System.out.println("The ingredients:" + withMilk.getIngredients());

        Configurable espresso = new Coffee("Coffee Espresso",3);
        System.out.println("The price of Coffee Espresso is:" + espresso.getPriceBase());
        System.out.println("The ingredients:" + espresso.getIngredients());


    }
}
