package aula1;
import javax.swing.*;
public class Aula1 {
public static void main(String[] args) {
      String nome,nota;
      double n1=0,n2=0,n3=0,n4=0,media=0;
      
      nome= JOptionPane.showInputDialog(null,"Informe o seu nome:");
      
      n1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));
      n2=Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));
      n3=Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota:"));
      n4=Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota:"));
      
      media=(n1+n2+n3+n4)/4;
      
      if
              (media >=7) 
          
          nota="Aluno Aprovado";
      
      else if
              (media>=5)
          
          nota="Aluno em Recuperação";
      else
                   
          nota="Aluno Reprovado" ;      
          
      JOptionPane.showMessageDialog(null,("Seu nome é:\n") +nome+("\nSua media é:\n") +media+ ("\nSua situação é:\n")+nota);    
                          
    }
    
}
