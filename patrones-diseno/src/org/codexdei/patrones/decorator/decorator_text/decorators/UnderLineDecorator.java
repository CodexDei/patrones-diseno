package org.codexdei.patrones.decorator.decorator_text.decorators;

import org.codexdei.patrones.decorator.decorator_text.Formatable;

public class UnderLineDecorator extends TextDecorator {

    public UnderLineDecorator(Formatable phrase) {
        super(phrase);
    }

    @Override
    public String format() {

        int length = phrase.format().length();
        StringBuilder sb = new StringBuilder(phrase.format());
        sb.append("\n");
        for (int i = 0; i < length; i++){

            sb.append("_");
        }

        return sb.toString();
    }
}
