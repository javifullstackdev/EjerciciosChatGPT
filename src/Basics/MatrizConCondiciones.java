package Basics;

public class MatrizConCondiciones {

    /**
     * Ejercicio: Matriz con condiciones
    
        Escribe un programa en Java que:

        Cree una matriz de 4x4 de tipo int.

        Rellene la matriz con los números del 1 al 16, de izquierda a derecha y de arriba hacia abajo.

        Sustituya los valores pares por 0 (cero).

        Imprima la matriz final en formato tabla.
     */

    public static void main(String[] args) {
        
        // Creamos la matriz 4x4 de tipo int:

        int[][] matrix = new int[4][4];
        int counter = 1;

        // Rellenamos la matriz con los números del 1 al 16, de izquierda a derecha y de arriba hacia abajo.

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = counter;

                // Sustituimos los valores pares de la matriz por 0 (sin modificar el contador)
                if(matrix[i][j] % 2 == 0){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");

                // Aumentamos el contador
                counter++;
            }
            System.out.println();
        }

    }
    
}
