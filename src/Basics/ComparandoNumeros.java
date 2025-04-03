package Basics;

import java.util.Scanner;

public class ComparandoNumeros {

    /**
     * Ejercicio: Comparación de Números
Escribe un programa en Java que solicite al usuario dos números enteros y realice las siguientes acciones:

- Comparar los números e imprimir cuál es mayor, o si son iguales.

- Determinar si ambos números son positivos, negativos o mixtos (uno positivo y otro negativo).

- Verificar si ambos números son pares o impares.

* Si los dos números son iguales, verificar si son múltiplos de 5.

🔹 Extras (opcional):

Asegurar que el usuario ingrese números válidos.

Mostrar un mensaje de error si el usuario introduce un valor no numérico.
     */

    public static void main(String[] args) {
        
        // Solicitamos al usuario dos números enteros:

        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce un número entero:");

        // Asegurar que el usuario ingrese números válidos.

        while (!entrada.hasNextInt()) {

            // Mostrar un mensaje de error si el usuario introduce un valor no numérico.

            System.out.println("Por favor, introduce un número entero válido.");
            entrada.next();
        }

        num1 = entrada.nextInt();

        System.out.println("Introduce otro número:");

        while(!entrada.hasNextInt()) {
            System.out.println("Por favor, introduce un número entero válido.");
            entrada.next();
        }
        num2 = entrada.nextInt();

        // Comparamos los números e imprimimos cuál es el mayor o si son iguales:

        if(num1 > num2) {
            System.out.println("El " + num1 + " es mayor que " + num2);
        }
        else if(num2 > num1) {
            System.out.println("El " + num2 + " es mayor que el " + num1);
        }
        else {
            System.out.println("Los números introducidos son iguales");
        }

        // Verificamos si ambos números son pares e impares:

        if((num1 % 2) == 0) {
            System.out.println("El " + num1 + " es par");
        }
        else {
            System.out.println("El " + num1 + " es impar");
        }
        
        if ((num2 % 2) == 0) {
            System.out.println("El " + num2 + " es par");
        }
        else {
            System.out.println("El " + num2 + " es impar");
        }

        // Si los dos números son iguales, verificar si son múltiplos de 5.

        if (num1 == num2) {
            if ((num1 % 5) == 0) {
                System.out.println("Los números introducidos son múltiplos de 5");
            }
            else {
                System.out.println("Los números introducidos no son múltiplos de 5");
            }
        }
        entrada.close();
    }
    
}
