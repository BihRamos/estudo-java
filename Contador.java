/*O Thread.sleep() pausa o programa por um tempo. 
Se algo tentar interromper essa pausa, 
o Java gera um erro (InterruptedException). 
O throws InterruptedException apenas avisa que isso pode acontecer.*/
package contador;

public class Contador {

    public static void main(String[] args) throws InterruptedException {

        for (int contador = 0; contador <= 10; contador++)//formula para contagem// 
        {

            System.out.println(contador);

            Thread.sleep(1000); // Pausa de 1 segundo//
        }
    
            System.out.println("Boom!");
    }
}


