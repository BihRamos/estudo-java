
package aula_questao;

import javax.swing.*;
public class Aula_Questao {

  
    public static void main(String[] args) {
       int pontuacao = 0;

        // Pergunta 1
        String resposta1 = JOptionPane.showInputDialog(
            "1- Qual nome do filho de Marlin?\n(A) Dory\n(B) Nemo\n(C) Peixonauta\n\nDigite A, B ou C:"
        );

        if (resposta1 != null && resposta1.equalsIgnoreCase("B")) {
            pontuacao += 10;
        }

        // Pergunta 2
        String resposta2 = JOptionPane.showInputDialog(
            "2- Qual a cor do céu?\n(A) Azul\n(B) Verde\n(C) Rosa\n\nDigite A, B ou C:"
        );

        if (resposta2 != null && resposta2.equalsIgnoreCase("A")) {
            pontuacao += 10;
        }

        // Pergunta 3
        String resposta3 = JOptionPane.showInputDialog(
            "3- Qual desses é uma flor?\n(A) Bolo\n(B) Tijolo\n(C) Rosa\n\nDigite A, B ou C:"
        );

        if (resposta3 != null && resposta3.equalsIgnoreCase("C")) {
            pontuacao += 10;
        }

        // Pergunta 4
        String resposta4 = JOptionPane.showInputDialog(
            "4- Qual melhor anime?\n(A) DBZ\n(B) Naruto\n(C) One Piece\n\nDigite A, B ou C:"
        );

        if (resposta4 != null && resposta4.equalsIgnoreCase("C")) {
            pontuacao += 10;
        }

        // Pergunta 5
        String resposta5 = JOptionPane.showInputDialog(
            "5- Complete a frase: O quadrado da hipotenusa...\n(A) é igual à soma dos quadrados dos catetos\n"
          + "(B) Tanto bate até que fura\n(C) A galinha enche o papo\n\nDigite A, B ou C:"
        );

        if (resposta5 != null && resposta5.equalsIgnoreCase("A")) {
            pontuacao += 10;
        }

        // Exibir pontuação final
        JOptionPane.showMessageDialog(null, "Quiz finalizado! Pontuação: " + pontuacao + " pontos.");
    }
}