package br.uerj.eng.desc.introducao;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.nome = "Ruan";
        prof1.matricula = "1234";
        prof1.salario = 1200f;
        prof1.imprime(prof1);
    }
}
