package aula_quis;
import java.util.Scanner;

public class Aula_Quis {
    
    public static void main(String[]args){
    
    Scanner Q = new Scanner(System.in);
    
    String nome, endereco;
    int idade;
    double salario;
    
    System.out.println("Digite seu nome:");
    nome = Q.nextLine();
    
    System.out.println("Digite seu endereço:");
    endereco=Q.nextLine();
    
    System.out.println("Digite sua idade:");
    idade=Q.nextInt();
    
    System.out.println("Digite seu salário:");
    salario=Q.nextDouble();
    
    System.out.println("Seu nome é:"+nome+"\nSeu endereõ é:"+endereco+"\nSua idade é:"+idade+"\nSeu salário é:"+salario);
            
}
}