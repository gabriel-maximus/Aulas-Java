package br.uerj.eng.desc.associacao;

public class Local {
    private int numeroAndar;
    private int numeroAuditorio;

    public Local(int numeroAndar, int numeroAuditorio) {
        this.numeroAndar = numeroAndar;
        this.numeroAuditorio = numeroAuditorio;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }

    public int getNumeroAuditorio() {
        return numeroAuditorio;
    }

    public void setNumeroAuditorio(int numeroAuditorio) {
        this.numeroAuditorio = numeroAuditorio;
    }
    
}
