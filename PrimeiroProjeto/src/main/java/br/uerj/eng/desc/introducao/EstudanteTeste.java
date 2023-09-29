package br.uerj.eng.desc.introducao;

public class EstudanteTeste {
    public static void main(String[] args){
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "9999";
        joao.idade = 32;
        System.out.println(joao.nome + " " + joao.idade);
    }
}
