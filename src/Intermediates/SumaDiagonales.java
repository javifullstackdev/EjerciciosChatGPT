package Intermediates;

public class SumaDiagonales {

    /**
     * 🔸 Ejercicio: Suma de diagonales
        Escribe un programa en Java que:

        Cree una matriz de 4x4 de tipo int.

        Rellene la matriz con los números del 1 al 16, de izquierda a derecha y de arriba hacia abajo.

        Imprima la matriz en formato tabla.

        Calcule y muestre por pantalla la suma de la diagonal principal y la suma de la diagonal secundaria.
     */

    public static void main(String[] args) {
        
        // Creamos la matriz 4x4 de tipo int:

        int[][] matrix = new int[4][4];

        // Rellenamos la matriz con los números del 1 al 16, de izquierda a derecha y de arriba hacia abajo.

        int counter = 1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = counter;
                System.out.print(matrix[i][j] + "\t");
                counter++;
            }
            System.out.println();
        }

        // Suma de la diagonal principal:

        int mainDiag = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    mainDiag += matrix[i][j];
                }
            }
        }
        System.out.println("\nLa suma de los valores de la diagonal principal es " + mainDiag);

        // Suma de los valores de la diagonal secundaria:

        int secondDiag = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i + j == matrix.length - 1){
                    secondDiag += matrix[i][j];
                }
            }
        }
        System.out.println("\nLa suma de los valores de la diagonal secundaria es " + secondDiag + "\n");

        // Como paso extra, vamos a trasponer la matriz (intercambiar filas por columnas):

        int[][] transposedMatrix = new int[4][4];
        counter = 1;

        for(int i = 0; i < transposedMatrix.length; i++){
            for(int j = 0; j < transposedMatrix[i].length; j++){
                transposedMatrix[i][j] = counter;
                counter++;
            }
        }

        System.out.println("Matriz traspuesta:\n");

        for(int i = 0; i < transposedMatrix.length; i++){
            for(int j = 0; j < transposedMatrix[i].length; j++){
                System.out.print(transposedMatrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
    
}
