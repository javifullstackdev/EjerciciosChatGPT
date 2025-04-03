package Basics;

public class EncuentraLaMasLarga {
    
    /**
     * Ejercicio: Encuentra la palabra más larga
        Escribe un programa que:

        - Declare un array de String con algunas palabras.

        - Recorra el array y encuentre la palabra más larga.

        - Muestre la palabra más larga en la consola.

     */

    public static void main(String[] args) {

    // Declaramos un array de String con algunas palabras:

    String[] words = {"coche", "casa", "animal", "videollamada"};

    // Creo una variable para almacenar la palabra más larga:

    String longestWord = "";

    for (int i = 0; i < words.length; i++ ) {
        if(words[i].length() > longestWord.length()) {
            longestWord = words[i];
        }
    }

    System.out.println("La palabra más larga es " + longestWord);
        
    }
}
