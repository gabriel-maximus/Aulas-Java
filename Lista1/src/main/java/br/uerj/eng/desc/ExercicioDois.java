package br.uerj.eng.desc;

public class ExercicioDois {
    public static void main(String[] args) {
        int numero = 3198427;
        int contador = 0;
        if(numero == 0){
            System.out.println("Número de digitos: 1");
        }else{
            while (numero > 0){
                numero = numero / 10;
                contador++;
            }
            System.out.println("Número de dígitos: "+contador);
    
        }
    }
}
