package org.codexdei.patrones.singleton;

public class ConexionDBSingleton {

    private static ConexionDBSingleton instance;

    private ConexionDBSingleton(){

        System.out.println("Connecting to a data base engine");
    }

    public static ConexionDBSingleton getInstance(){

        if(instance == null){

            return instance = new ConexionDBSingleton();
        }
        return instance;
    }
}
