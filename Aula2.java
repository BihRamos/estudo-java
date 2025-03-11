//Curso: DS-ETE. Aula ministrada:Prof.Joerllys Sérgio//
//Caixa de texto solicitando nome, idade e altura//

package praticando2;
import javax.swing.*;
public class Praticando2 {

    public static void main(String[] args) {
        
        String nome; //variavel nome//
        int idade=0; //variavel idade//
        double altura=0; //variavel altura//
        
        nome= JOptionPane.showInputDialog("Informe o seu nome:"); //caixa de texto soliciando nome//
        idade=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));   //caixa de texto soliciando idade//
        altura=Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));   //caixa de texto soliciando altura//
        
        JOptionPane.showMessageDialog(null,"Seu nome :"+ nome+"\nSua idade é:"+idade+"\nSua altura é:"+altura); // caixa de texto final com nome,idade e altura//
    }
    
}
