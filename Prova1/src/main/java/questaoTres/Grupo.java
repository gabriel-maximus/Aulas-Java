package questaoTres;

public class Grupo {
    private int numero;
    private Aluno[] alunos;
    private Disciplina disciplina;

    public Grupo(int numero, Aluno[] alunos, Disciplina disciplina) {
        this.numero = numero;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void relatorios(){
        System.out.println("Número do grupo "+this.numero);
        if(this.alunos != null && this.alunos.length != 0){
            for(int i = 0; i<alunos.length;i++){
                System.out.println("Aluno "+i+": "+this.alunos[i].getNome());
            }
        }else{
            System.out.println("Não possui alunos nesse grupo");
        }
        if(this.disciplina != null){
            System.out.println("Disciplina: "+this.disciplina.getNome());
        }else{
            System.out.println("Não tem nenhuma disciplina associada");
        }
    }
    
}
