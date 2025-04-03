package Basics;

import java.util.ArrayList;


public class BuclesForWhileAndForEach {

    /**
     * Ejercicio:
    Escribe un programa en Java que:

    - Use un bucle for para imprimir los números del 1 al 5.

    - Use un bucle while para contar hacia atrás desde 5 hasta 1.

    - Use un bucle for-each para recorrer un array de nombres e imprimir cada uno.
     */

    public static void main(String[] args) {
        
        // Bucle que imprima los números del 1 al 5:
        
        System.out.println("\nBucle FOR que imprime los números del 1 al 5:\n");
        for(int i = 1; i <=5; i++){
            System.out.println(i);
        }

        // Bucle while para contar hacia atrás desde 5 hasta 1:

        System.out.println("\nBucle WHILE que imprime los números del 5 al 1:\n");
        int counter = 5;
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }

        // Bucle FOR EACH para recorrer un array de nombres e imprimir cada uno:
        System.out.println("\nBucle FOR EACH para recorrer un array de nombres e imprimir cada uno:\n");
        
        // Declaro el array:

        ArrayList<String> nombres = new ArrayList<>();

        // Añado los nombres al array:

        nombres.add("Iván");
        nombres.add("Jenny");
        nombres.add("Javi");
        nombres.add("Rober");

        // Bucle que lo recorre y lo imprime:

        for(String nombre : nombres){
            System.out.println(nombre);
        }

    }
    
}
