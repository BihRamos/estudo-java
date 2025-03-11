//Curso: DS-ETE. Aula ministrada:Prof.Joerllys Sérgio//

/*O programa solicita o nome do cliente.*Exibe um menu com os itens e preços.*O cliente escolhe um item (1-3).
*Insere a quantidade desejada.*O programa calcula e exibe o total a pagar. */
package aula4;
import javax.swing.*;

public class Aula4 {
    public static void main(String[] args) {
        
        String nome= JOptionPane.showInputDialog("Digite seu nome:"); //solicitação do nome//
       String lanche = JOptionPane.showInputDialog("Escolha um lanche:\n 1 - Hotdog (R$7.00)\n 2 - Bauru (R$10.00)\n 3 - Refri (R$8.00)");//solicitação do lanche //
         int quant= Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade:"));//escolhendo a quantidade do lanche//
         
         double preco; // variavel preço declarada//
         
         switch(lanche) //estrutura do controle de fluxo//
         {
            case"1"-> {lanche = "Hotdog";preco = 7;} // Se o usuário escolher 1, o preço será 7.00//
            case"2"-> {lanche = "Bauru";preco = 10;} // Se o usuário escolher 2, o preço será 8.00//
            case"3"-> {lanche = "Refri";preco = 8;}  // Se o usuário escolher 3, o preço será 10.00//
            default -> {lanche = "Inválido"; preco = 0; } // Se a escolha for diferente dará inválido //
             
         }
         
          double total = quant* preco; // cálculo //
         
            if (preco > 0) {
            JOptionPane.showMessageDialog(null, nome + " pediu: " + quant + " " + lanche + "\n Total: R$ " +total ); // caixa de texto final , com as escolhas//
        } 
            else {
            JOptionPane.showMessageDialog(null, "Item inválido!");//caixa d etexto final invalida//
        }
    }
}