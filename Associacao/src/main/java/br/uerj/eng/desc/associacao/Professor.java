package br.uerj.eng.desc.associacao;


public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void printInfo(){
        System.out.println("Nome: "+this.getNome()+" Especialidade: "+this.getEspecialidade());
        if(this.seminarios != null && this.seminarios.length != 0){
            for(int i=0; i<this.getSeminarios().length;i++){
                System.out.println("Título do seminário: "+this.getSeminarios()[i].getTitulo());
            }
        }else{
            System.out.println("Não tem nenhum seminário associado");
        }
    }
}
