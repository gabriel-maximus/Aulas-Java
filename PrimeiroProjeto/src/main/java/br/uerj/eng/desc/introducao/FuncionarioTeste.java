package br.uerj.eng.desc.introducao;
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Gabriel","111 222 333",7000);
        funcionario.imprime();
        funcionario.init("Gabriel","111 222 333",7000,"Engenheiro");
        funcionario.imprime();
    }
}
