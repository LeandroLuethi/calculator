import javax.swing.*;
public class main {
    public static void main (String args[]){
       JFrame frame = new JFrame("Calculator");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,800);
     
       javax.swing.JPanel jPanelc = new javax.swing.JPanel();
       JButton buttonc = new JButton("c");
       buttonc.setSize(100,100);
       javax.swing.JPanel jPanelbracket = new javax.swing.JPanel();
       JButton buttonbracket = new JButton("()");
       buttonbracket.setSize(100,100);
       javax.swing.JPanel jPanelmodulo = new javax.swing.JPanel();
       JButton buttonmodulo = new JButton("%");
       buttonmodulo.setSize(100,100);
       javax.swing.JPanel jPaneldivide = new javax.swing.JPanel();
       JButton buttondivide = new JButton(":");
       buttondivide.setSize(100,100);
       javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
       JButton buttonone = new JButton("1");
       buttonone.setSize(100,100);
       frame.getContentPane().add(buttonone); 
       JButton buttontwo = new JButton("2");
       buttontwo.setSize(100,100);
       frame.getContentPane().add(buttontwo);
       JButton buttonthree = new JButton("3");
       buttonthree.setSize(100,100); 
       JButton buttonfour = new JButton("4");
       buttonfour.setSize(100,100);
       frame.getContentPane().add(buttonfour); 
       JButton buttonfive = new JButton("5");
       buttonfive.setSize(100,100);
       frame.getContentPane().add(buttonfive); 
       JButton buttonsix = new JButton("6");
       buttonsix.setSize(100,100);
       frame.getContentPane().add(buttonsix); 
       JButton buttonseven = new JButton("7");
       buttonseven.setSize(100,100);
       frame.getContentPane().add(buttonseven); 
       JButton buttoneight = new JButton("8");
       buttoneight.setSize(100,100);
       frame.getContentPane().add(buttoneight); 
       JButton buttonnine = new JButton("9");
       buttonnine.setSize(100,100);
       frame.getContentPane().add(buttonnine);       
       
       frame.setVisible(true);
       jPanel1.setVisible(true);
       jPanel1.add(buttonc);
       jPanel1.add(buttonbracket);
       jPanel1.add(buttonmodulo);
       jPanel1.add(buttondivide);
       jPanel1.add(buttonone);
       jPanel1.add(buttontwo);
       jPanel1.add(buttonthree);
       jPanel1.add(buttonfour);
       jPanel1.add(buttonfive);
       jPanel1.add(buttonsix);
       jPanel1.add(buttonseven);
       jPanel1.add(buttoneight);
       jPanel1.add(buttonnine);
       jPanel1.setLayout( new java.awt.GridLayout( 4, 5 ) );
       frame.add(jPanel1);
    }
}