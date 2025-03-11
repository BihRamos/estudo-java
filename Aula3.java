//Curso: DS-ETE. Aula ministrada:Prof.Joerllys Sérgio//
// Solicitar login e senha//
package aula3;
import javax.swing.*;
public class Aula3 {

    
    public static void main(String[] args) {
        
        String login, senha;
        
        login = JOptionPane.showInputDialog("Digite seu login:"); // Caixa de texto para solicitar login//
        senha= JOptionPane.showInputDialog("Digite sua senha:"); // Caixa de texto para solicitar senha//
        
        
        
        
        if (login.equals("admin") && senha.equals("$123#")) // operação de solicitação de login e senha//
        {
        
                 JOptionPane.showMessageDialog(null,"Acesso aprovado!");//situação após login e senha digitados corretamente//
            }
       else
       
       
       {
               
       JOptionPane.showMessageDialog(null,"Acesso Negado!"); //situação após login e senha digitados de modo incorreto//
                        }
        
    }
    
}
