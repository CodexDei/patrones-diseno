package org.codexdei.patrones.decorator.decorator_text.decorators;

import org.codexdei.patrones.decorator.decorator_text.Formatable;

public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(Formatable phrase) {
        super(phrase);
    }

    @Override
    public String format() {
        return phrase.format().toUpperCase();
    }
}
