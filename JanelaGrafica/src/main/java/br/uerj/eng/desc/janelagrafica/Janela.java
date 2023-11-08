package br.uerj.eng.desc.janelagrafica;
import javax.swing.JFrame;

public class Janela extends JFrame{
    public Janela(){
        //JFrame jf = new JFrame(); //cria a janela
        setTitle("Título"); //seta o titulo da janela
        setSize(500,400); //seta o tamanho da janela em pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //o programa deve ser finalizado quando apertar x 
        setLocationRelativeTo(null); //seta que a janela deve aparecer centralizada
        setResizable(false); //a janela não poderá ser redimensionada
        setVisible(true); //torna a janela visivel
    }
}
