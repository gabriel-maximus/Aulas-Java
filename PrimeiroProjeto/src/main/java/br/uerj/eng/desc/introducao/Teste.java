package br.uerj.eng.desc.introducao;

public class Teste {
    public static void main(String[] args){
        
        //Teste objetos
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "9999";
        joao.idade = 32;
        System.out.println(joao.nome + " " + joao.idade);
        
        //Teste dos métodos
        Calculadora calc = new Calculadora();
        calc.multiplica(3, 4);
        double divisao = calc.divide(9,2);
        System.out.println(divisao);
        int divisaoInt = calc.divideInt(7,3);
        System.out.println(divisaoInt);
    }
}
