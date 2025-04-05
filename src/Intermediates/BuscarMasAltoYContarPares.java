package Intermediates;

import java.util.Random;

public class BuscarMasAltoYContarPares {

    /**
     * 🔸 Ejercicio: Buscar el número más alto y contar pares
            Escribe un programa en Java que:

            Cree una matriz de tamaño 4x5 de tipo int.

            Rellene la matriz con números aleatorios entre 1 y 100.

            Imprima la matriz en formato de tabla (usando un bucle for).

            Recorra la matriz usando un bucle while anidado para:

            Encontrar el número más alto de la matriz.

            Contar cuántos números pares hay en la matriz.

            Muestra ambos resultados por pantalla.
     */

    public static void main(String[] args) {

        // Defino variable de color ROJO para valores pares:

        String ROJO = "\u001B[31m";
        String RESET = "\u001B[0m";
        
        // Creamos una matriz de tamaño 4x5 de tipo int:

        int[][] matrix = new int[4][5];

        // Rellenamos la matriz con números aleatorios entre 1 y 100.

        Random newRandom = new Random();

        System.out.println("\nMatriz de tamaño 4x5 con números aleatorios:\n");

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int random = newRandom.nextInt(1,100) + 1;
                matrix[i][j] = random;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Vamos a buscar el número más alto de la matriz:

        int highestNumber = 0;
        int rowPosition = 0;
        int colPosition = 0;
        int pairNumber = 0;

        int i = 0;

        // Busco el número más alto de cada fila:

        while(i < matrix.length) {
            int j = 0;
            while(j < matrix[i].length) {
                if(matrix[i][j] > highestNumber){
                    highestNumber = matrix[i][j];
                    rowPosition = i;
                    colPosition = j;
                }
                j++;
            }
            i++;
        }

        System.out.println("\nEl valor más alto de la matriz es " + highestNumber + " en la fila " + (rowPosition+1) + " y la columna " + (colPosition+1) + "\n");

        // Contamos cuántos números pares hay en la matriz.

        i = 0;

        while(i < matrix.length) {
            int j = 0;
            while(j < matrix[i].length) {
                if(matrix[i][j] % 2 == 0){
                    System.out.print(ROJO + matrix[i][j] + RESET + "\t");
                    pairNumber ++;
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
                j++;
            }
            i++;
            System.out.println();
        }

        System.out.println("\nHay un total de " + pairNumber + " números " + ROJO + "PARES" + RESET + " en la matriz" + "\n");
    }
    
}
