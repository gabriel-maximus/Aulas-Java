package br.uerj.eng.desc.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaCalculadora extends JFrame implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    JButton b0 = new JButton("0");
    JButton bponto = new JButton(".");
    
    public JanelaCalculadora(){
        
        //Criando Janela
        setTitle("Calculadora"); 
        setSize(700,600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setResizable(false); 
        setVisible(true); 
        
        //Criando Botões
        setLayout(null); //informa que vamos fornecer as informações do layout
        b0.setBounds(300,300,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b0); //adicionar o botão na janela
        b0.addActionListener(this);
        
    }   
}
