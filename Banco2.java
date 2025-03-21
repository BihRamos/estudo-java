
package banco2;
 import javax.swing.*;
public class Banco2 {

    public static void main(String[] args) {
        
        String login,nome,senha;
        double saque, deposito,saldo = 100; // Saldo inicial
        
        
      login = JOptionPane.showInputDialog("Digite seu login:");
      senha = JOptionPane.showInputDialog("Digite sua senha:");
      nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        JOptionPane.showMessageDialog(null, "Acesso liberado! Bem-vindo, " + nome + "!");
        
        while (true) {
            String opcao = JOptionPane.showInputDialog("1. Ver saldo\n" + "2. Depositar\n" + "3. Sacar\n"+ "4. Sair\n"+ "Escolha uma opção:"
            );
            
           if (opcao.equals("1")) {
                JOptionPane.showMessageDialog(null, nome + ", seu saldo é: R$ " + saldo);
            } 
           else if (opcao.equals("2")) {
                String depositoStr = JOptionPane.showInputDialog("Digite o valor do depósito:");
               deposito = Double.parseDouble(depositoStr);
                saldo += deposito;
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
            } 
           else if (opcao.equals("3")) {
                String saqueStr = JOptionPane.showInputDialog("Digite o valor do saque:");
                saque = Double.parseDouble(saqueStr);
                saldo -= saque; 
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
            } 
           else if (opcao.equals("4")) {
                JOptionPane.showMessageDialog(null, "Saindo do sistema. Até logo, " + nome + "!");
                System.exit(0);
               
            } 
           else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}