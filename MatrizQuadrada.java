public class MatrizQuadrada {
    public static void main(String[] args) {
        int[][] matrizQuadrada = new int[2][2];
        matrizQuadrada[0][0] = 0;
        matrizQuadrada[0][1] = 1;
        matrizQuadrada[1][0] = 2;
        matrizQuadrada[1][1] = 3;
        for(int i = 0; i<matrizQuadrada.length;i++){
            for(int j=0; j<matrizQuadrada.length;j++){
                System.out.println(matrizQuadrada[i][j]);
            } 
        }
    }
}
