package br.uerj.eng.desc.introducao;

public class Professor {
    public String nome;
    public String matricula;
    public float salario;
    public void imprime(Professor prof){
        System.out.println(prof.nome);
        System.out.println(prof.salario);
    }
}
