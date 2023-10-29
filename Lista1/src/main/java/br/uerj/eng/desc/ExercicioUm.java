package br.uerj.eng.desc;

public class ExercicioUm {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            for(int j=0;j<=10;j++){
                int multiplicacao = i*j;
                System.out.println(i +" x "+j+" = "+multiplicacao);
            }
        }
    }
}
