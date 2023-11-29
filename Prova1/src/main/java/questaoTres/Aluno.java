package questaoTres;

public class Aluno {
    private String nome;
    private Grupo[] grupos;

    public Aluno(String nome, Grupo[] grupos) {
        this.nome = nome;
        this.grupos = grupos;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void relatorio(){
        System.out.println("Nome do Aluno: "+this.nome);
        if(this.grupos != null && this.grupos.length != 0){
            System.out.println("Grupos Associados:");
            for(int i=0;i<this.grupos.length;i++){
                System.out.println("Grupo "+this.grupos[i].getNumero());
            }
        }else{
            System.out.println("Não possui grupos associados");
        }
    }
}
