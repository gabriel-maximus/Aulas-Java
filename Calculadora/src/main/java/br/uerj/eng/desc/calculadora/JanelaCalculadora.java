package br.uerj.eng.desc.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JanelaCalculadora extends JFrame implements ActionListener{
    
    String operacao;
    Double valor1;
    Double valor2;
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            visor.setText(visor.getText()+0);
        }
        if(e.getSource()==bponto){
            visor.setText(visor.getText()+".");
        }
        if(e.getSource()==b1){
            visor.setText(visor.getText()+1);
        }
        if(e.getSource()==b2){
            visor.setText(visor.getText()+2);
        }
        if(e.getSource()==b3){
            visor.setText(visor.getText()+3);
        }
        if(e.getSource()==b4){
            visor.setText(visor.getText()+4);
        }
        if(e.getSource()==b5){
            visor.setText(visor.getText()+5);
        }
        if(e.getSource()==b6){
            visor.setText(visor.getText()+6);
        }
        if(e.getSource()==b7){
            visor.setText(visor.getText()+7);
        }
        if(e.getSource()==b8){
            visor.setText(visor.getText()+8);
        }
        if(e.getSource()==b9){
            visor.setText(visor.getText()+9);
        }
        if(e.getSource()==bsoma){
            valor1 = Double.valueOf(visor.getText());
            visor.setText("");
            operacao = "soma";
        }
        if(e.getSource()==bsub){
            valor1 = Double.valueOf(visor.getText());
            visor.setText("");
            operacao = "sub";
        }
        if(e.getSource()==bmult){
            valor1 = Double.valueOf(visor.getText());
            visor.setText("");
            operacao = "mult";
        }
        if(e.getSource()==bigual){
            valor2 = Double.valueOf(visor.getText());
            Double resultado;
            if(operacao=="soma"){
                resultado = valor1 + valor2;
                visor.setText(String.format("%.3f",resultado));
            }
            if(operacao=="sub"){
                resultado = valor1 - valor2;
                visor.setText(String.format("%.3f",resultado));
            }
            if(operacao=="mult"){
                resultado = valor1 * valor2;
                visor.setText(String.format("%.3f",resultado));;
            }
        }
        if(e.getSource()==bclear){
            visor.setText("");
            operacao = "";
            valor1 = 0.0;
            valor2 = 0.0;
        }

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
    
    JButton bsoma = new JButton("+");
    JButton bsub = new JButton("-");
    JButton bmult = new JButton("x");
    
    JButton bclear = new JButton("CE");
    
    JTextField visor = new JTextField("");
    
    JLabel titulo = new JLabel("CALCULAMAX");
    
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
        b0.setBounds(245,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b0); //adicionar o botão na janela
        b0.addActionListener(this);
        
        bponto.setBounds(135,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bponto); //adicionar o botão na janela
        bponto.addActionListener(this);
        
        bsoma.setBounds(355,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bsoma); //adicionar o botão na janela
        bsoma.addActionListener(this);
        
        b1.setBounds(135,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b1); //adicionar o botão na janela
        b1.addActionListener(this);
        
        b2.setBounds(245,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b2); //adicionar o botão na janela
        b2.addActionListener(this);
        
        b3.setBounds(355,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b3); //adicionar o botão na janela
        b3.addActionListener(this);
        
        b4.setBounds(135,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b4); //adicionar o botão na janela
        b4.addActionListener(this);
        
        b5.setBounds(245,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b5); //adicionar o botão na janela
        b5.addActionListener(this);
        
        b6.setBounds(355,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b6); //adicionar o botão na janela
        b6.addActionListener(this);
        
        b7.setBounds(135,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b7); //adicionar o botão na janela
        b7.addActionListener(this);
        
        b8.setBounds(245,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b8); //adicionar o botão na janela
        b8.addActionListener(this);
        
        b9.setBounds(355,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(b9); //adicionar o botão na janela
        b9.addActionListener(this);
        
        bigual.setBounds(465,450,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bigual); //adicionar o botão na janela
        bigual.addActionListener(this);
        
        bsub.setBounds(465,380,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bsub); //adicionar o botão na janela
        bsub.addActionListener(this);
        
        bmult.setBounds(465,310,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bmult); //adicionar o botão na janela
        bmult.addActionListener(this);
        
        bclear.setBounds(465,240,100,60); //seta a posição do componente (x,y,largura,altura)
        add(bclear); //adicionar o botão na janela
        bclear.addActionListener(this);
        
        //Criando caixa de Texto
        visor.setBounds(180,150,340,50);
        visor.setHorizontalAlignment(SwingConstants.CENTER);
        add(visor);
        
        //Criando Título
        titulo.setBounds(180,90,340,50);//posicionar a label
        titulo.setHorizontalAlignment(SwingConstants.CENTER); //centralizar o texto
        add(titulo);
    }   
}
