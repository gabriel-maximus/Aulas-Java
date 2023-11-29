package questaoDois;

public class OperacaoMatrizes {

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
    
    public static int[][] multiplicarMatrizes(int matriz1[][], int matriz2[][]){
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
