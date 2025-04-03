package Basics;

import java.util.Scanner;

public class ComparandoCadenas {
    
    /**
     * Ejercicio: Comparación de Cadenas
Escribe un programa en Java que solicite al usuario dos palabras o frases y realice las siguientes acciones:

1. Comparar las cadenas e imprimir si son idénticas o diferentes.

2. Comparar si tienen la misma longitud.

3. Comparar si una cadena está contenida dentro de la otra.

🔹 Extras (opcional):

4. Ignorar mayúsculas y minúsculas en la comparación.

5. Indicar cuál cadena es mayor alfabéticamente.
     */

    public static void main(String[] args) {
        
        String word1, word2;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una palabra:");

        word1 = input.nextLine();

        System.out.println("Introduce otra palabra");

        word2 = input.nextLine();

        System.out.println("Las palabras introducidas son " + word1 + " y " + word2);

        // 1. Comparar las cadenas e imprimir si son idénticas o diferentes.

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        // 2. Comparar si tienen la misma longitud.

        if (word1.length() == word2.length()) {
            System.out.println("las palabras tienen la misma longitud.");
        } else {
            System.out.println("Las palabras introducidas no tienen la misma longitud.");
        }

        // 3. Comparar si una cadena está contenida dentro de la otra:

        if (word1.contains(word2)) {
            System.out.println("La palabra " +  word2 + " está contenida dentro de la palabra " + word1);
        }
        else if (word2.contains(word1)) {
            System.out.println("La palabra " +  word1 + " está contenida dentro de la palabra " + word2);
        }
        else {
            System.out.println("Ninguna de las palabras introducidas está contenida en la otra.");
        }

        // 5. Indicar cuál cadena es mayor alfabéticamente.

        int comparisonResult = word1.compareTo(word2);

        if (comparisonResult < 0) {
            System.out.println("La palabra " + word1 + " va antes que la palabra " + word2);
        } else {
            System.out.println("La palabra " + word2 + " va antes que la palabra " + word1);
        }

        input.close();
    }

}
