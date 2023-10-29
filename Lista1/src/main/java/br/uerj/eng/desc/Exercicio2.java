package br.uerj.eng.desc;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 152374;
        int contador = 0; 
        while (numero > 0){
            numero = numero / 10;
            contador++;
        }
        System.out.println("Número de dígitos: "+contador);
    }
}
