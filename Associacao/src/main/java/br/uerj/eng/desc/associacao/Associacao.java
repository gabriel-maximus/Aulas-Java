package br.uerj.eng.desc.associacao;

public class Associacao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", 22);
        Aluno aluno2 = new Aluno("Jose", 18);
        Aluno aluno3 = new Aluno("Jade", 21);
        
        Professor professor1 = new Professor("Evandro", "Matematica");
        Professor professor2 = new Professor("Marcia", "Ingles");
        
        Local local1 = new Local(5,3);
        Local local2 = new Local(11,1);
        
        Aluno[] seminarioAluno = {aluno1, aluno2};
        
        Seminario seminario1 = new Seminario("Funcoes",professor1,seminarioAluno,local1);
        
        seminario1.printInfo();
    }
}
