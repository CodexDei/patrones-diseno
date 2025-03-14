package org.codexdei.patrones.decorator.decorator_text.decorators;

import org.codexdei.patrones.decorator.decorator_text.Formatable;

abstract public class TextDecorator implements Formatable {

    protected Formatable phrase;

    public TextDecorator(Formatable phrase) {
        this.phrase = phrase;
    }
}
