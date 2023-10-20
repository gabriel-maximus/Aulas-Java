package br.uerj.eng.desc.introducao;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;
    
    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public void init(String nome, String cpf, double salario,String cargo){
        this.init(nome,cpf,salario);
        this.cargo = cargo;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.nome+" CPF: "+this.cpf+" Salario: "+this.salario+" Cargo: "+this.cargo);
    }
}
