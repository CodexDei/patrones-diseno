package org.codexdei.patrones.decorator.decorator_text;

public class Text implements Formatable {

    private String phrase;

    public Text(String phrase){

        this.phrase = phrase;
    }

    public String getPhrase(){

        return this.phrase;
    }

    @Override
    public String toString() {
        return "Phrase: " + phrase;
    }

    @Override
    public String format() {

        return getPhrase();
    }
}
