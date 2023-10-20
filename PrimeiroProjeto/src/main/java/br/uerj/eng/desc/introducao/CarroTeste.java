package br.uerj.eng.desc.introducao;
public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        
        carro1.setNome("Ferrari");
        carro1.setVelocidadeMaxima(280);
        
        carro2.setNome("Mercedes");
        carro2.setVelocidadeMaxima(270);
        
        carro3.setNome("Renault");
        carro3.setVelocidadeMaxima(220);
        
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        
        carro1.setVelocidadeLimite(220);
        
        System.out.println("----------------------------");
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        
    }
}
