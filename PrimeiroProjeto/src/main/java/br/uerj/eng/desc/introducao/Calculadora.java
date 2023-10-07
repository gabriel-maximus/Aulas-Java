package br.uerj.eng.desc.introducao;
public class Calculadora {
    public void soma(){
        System.out.println(2+2);
    }
    public void multiplica(int numero1, int numero2){
        System.out.println(numero1 * numero2);
    }
    public double divide(double numero1, double numero2){
        return numero1/numero2;
    }
    public int divideInt(double numero1, double numero2){
        return (int)(numero1/numero2);
    }
}
