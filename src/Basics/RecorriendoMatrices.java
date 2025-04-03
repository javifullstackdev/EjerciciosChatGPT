package Basics;

public class RecorriendoMatrices {

    /**
     * Ejercicio:
        Escribe un programa en Java que:

        - Cree una matriz de tamaño 3x3.

        - Rellene la matriz con los números del 1 al 9 utilizando un bucle anidado.

        - Imprima la matriz en formato de tabla.
     */

    public static void main(String[] args) {
        
        int[][] matrix = new int[3][3];
        int counter = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = counter;
                counter++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
