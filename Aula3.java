//Curso: DS-ETE. Aula ministrada:Prof.Joerllys Sérgio//
package aula3;
import javax.swing.*;
public class Aula3 {

    
    public static void main(String[] args) {
        
        String login, senha;
        
        login = JOptionPane.showInputDialog("Digite seu login:");
        senha= JOptionPane.showInputDialog("Digite sua senha:");
        
        
        
        
        if (login.equals("admin") && senha.equals("$123#"))
        {
        
                 JOptionPane.showMessageDialog(null,"Acesso aprovado!");
            }
       else
       
       
       {
               
       JOptionPane.showMessageDialog(null,"Acesso Negado!");
                        }
        
    }
    
}
