package org.codexdei.patrones.decorator.decorator_text.decorators;

import org.codexdei.patrones.decorator.decorator_text.Formatable;

public class ReplaceSpacesDecorator extends TextDecorator {


    public ReplaceSpacesDecorator(Formatable phrase) {
        super(phrase);
    }

    @Override
    public String format() {

        return phrase.format().replace(" ","_");
    }
}
