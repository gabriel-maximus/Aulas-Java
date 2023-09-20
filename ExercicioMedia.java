public class ExercicioMedia {
    public static void main(String[] args) {
        float p1 = 7.5f;
        float p2 = 8;
        float media = (p1+p2)/2;
        
        System.out.println("Prova 1: "+p1);
        System.out.println("Prova 2: "+p2);
        System.out.println("Média: "+media);
        
        if(media<4){
            System.out.println("Situação: Reprovado");
        }else if(media>=4 && media<7){
            System.out.println("Situaçao: Recuperação");
        }else{
            System.out.println("Situação: Aprovado");
        }
    }
}
