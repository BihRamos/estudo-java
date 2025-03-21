//Curso: DS-ETE. Aula ministrada:Prof.Joelson //
/*O operador == serve para comparar números e objetos na memória
== (Comparação) → Usado em condições
O operador == verifica se dois valores são iguais.
*/

package banco;

import java.util.Scanner;
public class Banco {

        public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        
        String logi, senha,nome;
        double deposito, saque,saldo = 100; 
        int opcao;
        
       
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        senha = scanner.nextLine();
     
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        
        while (true) {
            System.out.println("\n=== Sistema Bancário ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
           opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println(nome + ", seu saldo é: R$ " + saldo);
            } 
            else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: ");
                deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso!");
            } 
            else if (opcao == 3) {
                System.out.print("Digite o valor do saque: ");
                saque = scanner.nextDouble();
                saldo -= saque; // Remove saldo sem verificar se é suficiente
                System.out.println("Saque realizado com sucesso!");
            } 
            else if (opcao == 4) {
                System.out.println("Saindo do sistema. Até logo, " + nome + "!");
                break;
            } 
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
        
 
