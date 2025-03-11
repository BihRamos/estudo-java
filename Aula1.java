//Curso: DS-ETE. Aula ministrada:Prof.Joerllys Sérgio//
//Tirar média do aluno e mostrar situação//
package aula1;
import javax.swing.*;
public class Aula1 {
public static void main(String[] args) {
      String nome,nota;
      double n1=0,n2=0,n3=0,n4=0,media=0;
      
      nome= JOptionPane.showInputDialog(null,"Informe o seu nome:");//Solicitar nome//
      
      n1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));//Solicitar nota//
      n2=Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));//Solicitar nota//
      n3=Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota:"));//Solicitar nota//
      n4=Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota:"));//Solicitar nota//
      
      media=(n1+n2+n3+n4)/4;//Operação//
      
      if
              (media >=7) //Lógica se media for maior ou igual a 7//
          
          nota="Aluno Aprovado"; // Situação//
      
      else if
              (media>=5)   //Lógica se media for menor ou igual a 5//
          
          nota="Aluno em Recuperação"; //Situação//
      else
                   
          nota="Aluno Reprovado" ; //Situação//     
          
      JOptionPane.showMessageDialog(null,("Seu nome é:\n") +nome+("\nSua media é:\n") +media+ ("\nSua situação é:\n")+nota); //Mensagem final com nome, média e situação inal do aluno//
                          
    }
    
}
