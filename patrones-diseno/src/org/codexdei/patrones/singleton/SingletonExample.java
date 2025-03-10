package org.codexdei.patrones.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            ConexionDBSingleton conec = ConexionDBSingleton.getInstance();
            System.out.println("conec = " + conec);
        }
    }
}
