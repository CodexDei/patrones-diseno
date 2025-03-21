package org.codexdei.patrones.observer.examples;

import org.codexdei.patrones.observer.UserRepository;

public class ObserverUserRepositoryExample {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        repo.addObserver( (o,u)  -> System.out.println("Se envia correo al usuario: " + u));
        repo.addObserver( (o,u)  -> System.out.println("Se envia correo al administrador"));
        repo.addObserver( (o,u)  -> System.out.println("Guardando la info del usuario: " + u));

        repo.createUser("Yorking");
    }
}
