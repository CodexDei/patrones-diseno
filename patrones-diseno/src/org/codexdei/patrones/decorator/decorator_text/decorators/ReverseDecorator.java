package org.codexdei.patrones.decorator.decorator_text.decorators;

import org.codexdei.patrones.decorator.decorator_text.Formatable;

public class ReverseDecorator extends TextDecorator {


    public ReverseDecorator(Formatable phrase) {
        super(phrase);
    }

    @Override
    public String format() {

        StringBuilder sb = new StringBuilder(phrase.format());

        return sb.reverse().toString();
    }
}
