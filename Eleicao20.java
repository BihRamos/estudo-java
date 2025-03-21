
package eleicao2.pkg0;

import java.util.Scanner;
public class Eleicao20 {

 
    public static void main(String[] args) {
       Scanner E = new Scanner(System.in);
       
       String nome, eleicao;
       int idade;
       double titulo;
       
       System.out.println("Digite seu nome:");
       nome=E.nextLine();
       System.out.println("Digite sua idade:");
       idade=E.nextInt();
       System.out.println("Digite seu titulo:");
       titulo=E.nextDouble();
       
       if
               (idade < 16){
           eleicao="Não vota";}
       
       else if 
               (idade >= 16 && idade<= 18 || idade >=60){
           eleicao = "Voto opcional";}
       
       else{
           eleicao = "Voto Obrigatório ";
       }
       
       System.out.println("\nSeu nome é:"+nome+"\nSua idade é:"+idade+"\nSeu titulo é:"+titulo+"\nSituação do voto:"+eleicao);
       
       
    }
    
}
