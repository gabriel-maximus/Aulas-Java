package questaoDois;

public class QuestaoDois {
    public static void main(String[] args) {
        OperacaoMatrizes operacoes = new OperacaoMatrizes();
        
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

        int[][] resultado = operacoes.multiplicarMatrizes(matriz1, matriz2);

        System.out.println("Matriz resultante da multiplicação:");
        operacoes.imprimirMatriz(resultado);
        
        int[][] resultado2 = operacoes.somarMatrizes(matriz1, matriz2);
        
        System.out.println("Matriz resultante da soma:");
        operacoes.imprimirMatriz(resultado2);
    }
}
