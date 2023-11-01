package br.uerj.eng.desc.associacao;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Professor professor, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Professor professor, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public void printInfo(){
        System.out.println("Título do Seminário: "+this.titulo);
        System.out.println("Professor responsável: "+this.professor.getNome());
        System.out.println("Local: "+this.local.getNumeroAndar()+"º andar Auditório "+this.local.getNumeroAuditorio());
        System.out.println("Alunos inscritos: ");
        if(this.alunos != null && this.alunos.length != 0){
            for(int i=0;i<alunos.length;i++){
                System.out.println("Nome: "+alunos[i].getNome()+" Idade: "+alunos[i].getIdade());
            }
        }else{
            System.out.println("Não possui alunos inscritos");
        }
    }
}
