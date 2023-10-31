package br.uerj.eng.desc;

public class AgendaMain {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Gabriel", "219312321344");
        Contato contato2 = new Contato("Joao", "Victor", "12341233123");
        Contato contato3 = new Contato("Marcia", "231231231231");
        
        Contato[] contatos = {contato1,contato2,contato3};
    
        Agenda agenda = new Agenda(contatos);
        agenda.printContato(0);
        agenda.printContato(1);
    }
}
