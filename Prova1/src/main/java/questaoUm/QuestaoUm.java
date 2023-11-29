package questaoUm;

public class QuestaoUm {
    public static void main(String[] args) {
        int contador = 100;
        for(int i = 1; i<=contador; i++){
            if(i%4==0){
                System.out.println("PIM");
            }else{
                System.out.println(i);
            }
        }
    }
}
