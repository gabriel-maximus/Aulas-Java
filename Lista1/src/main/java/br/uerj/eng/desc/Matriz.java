package br.uerj.eng.desc;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

        System.out.println("Matriz resultante da multiplicação:");
        imprimirMatriz(resultado);
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhasMatriz1 = matriz1.length;
        int colunasMatriz1 = matriz1[0].length;
        int colunasMatriz2 = matriz2[0].length;

        int[][] resultado = new int[linhasMatriz1][colunasMatriz2];

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
