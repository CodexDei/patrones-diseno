package org.codexdei.patrones.composite.example;

import org.codexdei.patrones.composite.Directory;
import org.codexdei.patrones.composite.File;

public class CompositeExample {

    public static void main(String[] args) {

        Directory doc = new Directory("Documents");
        Directory java = new Directory("Java");
        Directory stream = new Directory("Api Stream");

        java.addComponent(new File("design-composite.docx"));
        stream.addComponent(new File("stream-map.docx"));
        java.addComponent(stream);
        doc.addComponent(java);
        doc.addComponent(new File("cv.docx"));
        doc.addComponent(new File("logo.jpeg"));

        System.out.println(doc.show(0));

        System.out.println("Found \"design-composite.docx\":" + doc.search("design-composite.docx"));
        System.out.println("Found \"design-factory.docx\":" + doc.search("design-factory.docx"));
        System.out.println("Found \"Java\":" + doc.search("Java"));
        System.out.println("Found \"phyton\":" + doc.search("phyton"));
    }


}
