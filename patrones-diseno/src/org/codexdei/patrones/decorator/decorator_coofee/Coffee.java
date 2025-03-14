package org.codexdei.patrones.decorator.decorator_coofee;

public class Coffee implements Configurable{

    private String name;
    private float price;


    public Coffee(String name, float price){

        this.name = name;
        this.price = price;
    }

    @Override
    public float getPriceBase() {
        return this.price;
    }

    @Override
    public String getIngredients() {
        return this.name;
    }
}
