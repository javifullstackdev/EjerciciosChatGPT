package Basics;

public class Matriz4x4 {

    /**
     * Ejercicio:
        Escribe un programa en Java que:

        - Cree una matriz de 4x4.

        - Rellene la matriz con múltiplos de 2, comenzando desde 2.

        - Imprima la matriz en formato de tabla.
     */

    public static void main(String[] args) {
        
        int[][] matrix = new int[4][4];
        int counter = 10;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = counter;
                counter += 2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
