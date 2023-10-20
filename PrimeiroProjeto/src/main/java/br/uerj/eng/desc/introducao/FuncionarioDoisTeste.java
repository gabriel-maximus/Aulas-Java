package br.uerj.eng.desc.introducao;
public class FuncionarioDoisTeste {
    public static void main(String[] args) {
        FuncionarioDois funcionarioDois = new FuncionarioDois("Gabriel", "123456",5000);
        funcionarioDois.imprime();
        funcionarioDois.setSalario(6000);
        funcionarioDois.imprime();
        double salarioTeste = funcionarioDois.getSalario();
        System.out.println("Salario: "+salarioTeste);
    }
}
