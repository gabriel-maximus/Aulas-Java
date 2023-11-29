package questaoTres;

public class Disciplina {
    private String nome;
    private Grupo[] grupos;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, Grupo[] grupos) {
        this.nome = nome;
        this.grupos = grupos;
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
        System.out.println("Nome da Disciplina: "+this.nome);
        System.out.println("Grupos Associados a Disciplina: ");
        if(this.grupos != null && this.grupos.length != 0){
            for(int i = 0; i<grupos.length;i++){
            System.out.println("Grupo "+grupos[i].getNumero());
            }
        }else{
            System.out.println("Não possui grupos dessa matéria");
        }
    }
}
