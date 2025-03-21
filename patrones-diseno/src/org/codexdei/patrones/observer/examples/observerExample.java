package org.codexdei.patrones.observer.examples;

import org.codexdei.patrones.observer.Corporation;
import org.codexdei.patrones.observer.Observable;
import org.codexdei.patrones.observer.Observer;

public class observerExample {

    public static void main(String[] args) {

        Corporation google = new Corporation("Google", 1000);

        System.out.println("Actuality info:\n" +google.getName() + " " +
                "old price: " + google.getPrice());

        google.addObserver((observable, object) ->{
            System.out.println("Luis: " + observable);
        });

        google.addObserver((observable, object) -> {
            System.out.println("Jhoel: " + observable);
        });
        //lo anterior es lo mismo que usar una clase anonima
        //pero es arcaico, solo lo colocaremos como guia
        //cualquiera de los 2 reemplaza el crear una clase observers, que
        //implemente el metodo update, por lo que en vez de hacer eso se
        //simplica con lampdas, que es mejor que la clase anonima a continuacion
        google.addObserver((observable, object) -> {
                System.out.println("Marye: " + observable);
        });

        google.modifyPrice(3500);
    }
}
