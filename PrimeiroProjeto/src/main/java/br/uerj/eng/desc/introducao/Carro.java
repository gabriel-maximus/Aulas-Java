package br.uerj.eng.desc.introducao;
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
   
    public void imprime(){
        System.out.println("Nome: "+this.nome+" Velocidade Maxima: "+this.velocidadeMaxima+" Velocidade Limite: "+this.velocidadeLimite);    
    }
}
