package questaoTres;

public class QuestaoTres {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel");
        Aluno aluno2 = new Aluno("Joao");
        Aluno aluno3 = new Aluno("Pedro");
    
        Disciplina dis1 = new Disciplina("Matematica");
        Disciplina dis2 = new Disciplina("Portugues");
    
        Aluno[] alunosGrupoUm = {aluno1, aluno2};
        Aluno[] alunosGrupoDois = {aluno1,aluno3};
    
        Grupo grupo1 = new Grupo(1, alunosGrupoUm, dis1);
        Grupo grupo2 = new Grupo(2, alunosGrupoDois, dis2);
        
        Grupo[] gruposAlunoUm = {grupo1,grupo2};
        Grupo[] gruposAlunoDois = {grupo1};
        Grupo[] gruposAlunoTres = {grupo2};
        
        aluno1.setGrupos(gruposAlunoUm);
        aluno2.setGrupos(gruposAlunoDois);
        aluno3.setGrupos(gruposAlunoTres);
        
        Grupo[] gruposDisUm = {grupo1};
        Grupo[] gruposDisDois = {grupo2};        
        
        dis1.setGrupos(gruposDisUm);
        dis2.setGrupos(gruposDisDois);
    
        aluno1.relatorio();
        System.out.println("---------");
        aluno2.relatorio();
        System.out.println("---------");
        aluno3.relatorio();
        System.out.println("---------");
        
        dis1.relatorio();
        System.out.println("---------");
        dis2.relatorio();
        System.out.println("---------");
        
        grupo1.relatorios();
        System.out.println("---------");
        grupo2.relatorios();
        System.out.println("---------");
        
        Aluno aluno4 = new Aluno("Thiago");
        aluno4.relatorio();
    }
    
}
