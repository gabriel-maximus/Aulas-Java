package br.uerj.eng.desc.janelagrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Janela extends JFrame implements ActionListener{
    
    JButton jb = new JButton("Botão 1");
    JButton jb2 = new JButton("Sair");
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==jb){
            //Exibir uma mensagem na tela com o clique do botão
            JOptionPane.showMessageDialog(null,"Funcionou!!!");
        }
        if(e.getSource()==jb2){
            System.exit(0);
        }
    }
    
    JLabel legenda = new JLabel("Texto da Label");
    
    public Janela(){
        //JFrame jf = new JFrame(); //cria a janela
        setTitle("Título"); //seta o titulo da janela
        setSize(700,600); //seta o tamanho da janela em pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //o programa deve ser finalizado quando apertar x 
        setLocationRelativeTo(null); //seta que a janela deve aparecer centralizada
        setResizable(false); //a janela não poderá ser redimensionada
        setVisible(true); //torna a janela visivel
        
        //Criação do Botão
        setLayout(null); //informa que vamos fornecer as informações do layout
        jb.setBounds(200,300,100,60); //seta a posição do componente (x,y,largura,altura)
        add(jb); //adicionar o botão na janela
        jb.addActionListener(this); // adicionar ação ao botão
        
        //Criação do Segundo Botão;
        jb2.setBounds(400,300,100,60);
        add(jb2);
        jb2.addActionListener(this);
        
        //Criação de uma Label
        legenda.setBounds(0,0,200,60);//posicionar a label
        legenda.setText("Texto da Label 2"); //mudar o texto da label em tempo de execução
        legenda.setHorizontalAlignment(SwingConstants.CENTER); //centralizar o texto
        add(legenda); //adicionar a label
        
    }
}
