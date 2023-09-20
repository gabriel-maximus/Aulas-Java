public class Decisao {
    public static void main(String[] args) {
        int numero = 6;
        if(numero < 5){
            System.out.println("Menor que 5");
        }else if(numero <10){
            System.out.println("Entre 5 e 10");
        }else{
            System.out.println("Maior que 10");
        }

        String resultado;
        resultado = numero < 5 ? "Menor que 5" : "Maior que 5";
        System.out.println(resultado);
    }
}
