package br.uerj.eng.desc.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaCalculadora extends JFrame implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    JButton b0 = new JButton("0");
    JButton bponto = new JButton(".");
    JButton bigual = new JButton("=");
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    
    JTextField visor = new JTextField("");
    
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
        b0.setBounds(300,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b0); //adicionar o botão na janela
        b0.addActionListener(this);
        
        bponto.setBounds(190,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bponto); //adicionar o botão na janela
        bponto.addActionListener(this);
        
        bigual.setBounds(410,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bigual); //adicionar o botão na janela
        bigual.addActionListener(this);
        
        b1.setBounds(190,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b1); //adicionar o botão na janela
        b1.addActionListener(this);
        
        b2.setBounds(300,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b2); //adicionar o botão na janela
        b2.addActionListener(this);
        
        b3.setBounds(410,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b3); //adicionar o botão na janela
        b3.addActionListener(this);
        
        b4.setBounds(190,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b4); //adicionar o botão na janela
        b4.addActionListener(this);
        
        b5.setBounds(300,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b5); //adicionar o botão na janela
        b5.addActionListener(this);
        
        b6.setBounds(410,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b6); //adicionar o botão na janela
        b6.addActionListener(this);
        
        b7.setBounds(190,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b7); //adicionar o botão na janela
        b7.addActionListener(this);
        
        b8.setBounds(300,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b8); //adicionar o botão na janela
        b8.addActionListener(this);
        
        b9.setBounds(410,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b9); //adicionar o botão na janela
        b9.addActionListener(this);
        
        //Criando caixa de Texto
        visor.setBounds(180,100,340,50);
        add(visor);
        
    }   
}
