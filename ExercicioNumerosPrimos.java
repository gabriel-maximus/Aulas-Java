public class ExercicioNumerosPrimos {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;
        while(contador < 15){
            int divisores = 0;
            for(int divisor =1; divisor <= numero ; divisor++){
                if(numero % divisor == 0){
                    divisores ++;
                }
            }
            if(divisores == 2){
                System.out.println(numero);
                contador ++;
            }
            numero ++;
        }
    }
}
