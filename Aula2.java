package praticando2;
import javax.swing.*;
public class Praticando2 {

    public static void main(String[] args) {
        
        String nome;
        int idade=0;
        double altura=0;
        
        nome= JOptionPane.showInputDialog("Informe o seu nome:");
        idade=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
        
        JOptionPane.showMessageDialog(null,"Seu nome :"+ nome+"\nSua idade é:"+idade+"\nSua altura é:"+altura);
    }
    
}
