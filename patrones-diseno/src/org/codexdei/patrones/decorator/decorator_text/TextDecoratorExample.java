package org.codexdei.patrones.decorator.decorator_text;

import org.codexdei.patrones.decorator.decorator_text.decorators.*;

public class TextDecoratorExample {

    public static void main(String[] args) {

        Formatable text = new Text("Hello people!!!");

        UpperCaseDecorator upperCase = new UpperCaseDecorator(text);
        ReplaceSpacesDecorator replaceSpace = new ReplaceSpacesDecorator(upperCase);
        UnderLineDecorator underLine = new UnderLineDecorator(replaceSpace);
        ReverseDecorator reverse = new ReverseDecorator(underLine);

        System.out.println("underLine.format() = " + reverse.format());
    }
}
