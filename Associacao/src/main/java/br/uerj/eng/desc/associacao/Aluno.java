package br.uerj.eng.desc.associacao;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    
    public void printInfo(){
        if(this.getSeminario()!= null){
        System.out.println("Nome: "+this.getNome()+" Idade: "+this.getIdade()+" Seminario: "+this.getSeminario().getTitulo());
        }else{
            System.out.println("Nome: "+this.nome+" Idade: "+this.idade+" Não está inscrito em seminário.");
        }
    }
}
