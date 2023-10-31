package br.uerj.eng.desc;

public class Agenda {
    Contato[] contatos;

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public void printContato(int n){
        System.out.println("Nome: "+this.contatos[n].getNome()+" Sobrenome: "+this.contatos[n].getSobrenome());
        System.out.println("Número: "+this.contatos[n].getNumero());
    }
}
