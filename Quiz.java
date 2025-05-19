
package quiz;

import javax.swing.*;


public class Quiz {


    public static void main(String[] args) {
       int pontuacao = 0;

        String nomeJogador = JOptionPane.showInputDialog("Digite seu nome:");

        // Pergunta 1
        String resposta1 = JOptionPane.showInputDialog(
            "1- Qual nome do filho de Marlin?\n(A) Dory\n(B) Nemo\n(C) Peixonauta\n\nDigite A, B ou C:"
        );
        if (resposta1 != null && resposta1.equalsIgnoreCase("B")) {
            pontuacao += 10000;
        }

        // Pergunta 2
        String resposta2 = JOptionPane.showInputDialog(
            "2- Qual a cor do céu?\n(A) Azul\n(B) Verde\n(C) Rosa\n\nDigite A, B ou C:"
        );
        if (resposta2 != null && resposta2.equalsIgnoreCase("A")) {
            pontuacao += 10000;
        }

        // Pergunta 3
        String resposta3 = JOptionPane.showInputDialog(
            "3- Qual desses é uma flor?\n(A) Bolo\n(B) Tijolo\n(C) Rosa\n\nDigite A, B ou C:"
        );
        if (resposta3 != null && resposta3.equalsIgnoreCase("C")) {
            pontuacao += 10000;
        }

        // Pergunta 4
        String resposta4 = JOptionPane.showInputDialog(
            "4- Qual melhor anime?\n(A) DBZ\n(B) Naruto\n(C) One Piece\n\nDigite A, B ou C:"
        );
        if (resposta4 != null && resposta4.equalsIgnoreCase("C")) {
            pontuacao += 10000;
        }

        // Pergunta 5
        String resposta5 = JOptionPane.showInputDialog(
            "5- Complete a frase: O quadrado da hipotenusa...\n(A) é igual à soma dos quadrados dos catetos\n"
          + "(B) Tanto bate até que fura\n(C) A galinha enche o papo\n\nDigite A, B ou C:"
        );
        if (resposta5 != null && resposta5.equalsIgnoreCase("A")) {
            pontuacao += 10000;
        }

        // Nova Pergunta 6
        String resposta6 = JOptionPane.showInputDialog(
            "6- Qual planeta é conhecido como planeta vermelho?\n(A) Vênus\n(B) Marte\n(C) Júpiter\n\nDigite A, B ou C:"
        );
        if (resposta6 != null && resposta6.equalsIgnoreCase("B")) {
            pontuacao += 10000;
        }

        // Nova Pergunta 7
        String resposta7 = JOptionPane.showInputDialog(
            "7- Qual é o maior animal terrestre?\n(A) Elefante\n(B) Girafa\n(C) Hipopótamo\n\nDigite A, B ou C:"
        );
        if (resposta7 != null && resposta7.equalsIgnoreCase("A")) {
            pontuacao += 10000;
        }

        // Nova Pergunta 8
        String resposta8 = JOptionPane.showInputDialog(
            "8- Quem pintou a Mona Lisa?\n(A) Van Gogh\n(B) Picasso\n(C) Leonardo da Vinci\n\nDigite A, B ou C:"
        );
        if (resposta8 != null && resposta8.equalsIgnoreCase("C")) {
            pontuacao += 10000;
        }

        // Nova Pergunta 9
        String resposta9 = JOptionPane.showInputDialog(
            "9- Qual é o maior oceano do mundo?\n(A) Atlântico\n(B) Pacífico\n(C) Índico\n\nDigite A, B ou C:"
        );
        if (resposta9 != null && resposta9.equalsIgnoreCase("B")) {
            pontuacao += 10000;
        }

        // Nova Pergunta 10
        String resposta10 = JOptionPane.showInputDialog(
            "10- Quantos segundos tem um minuto?\n(A) 60\n(B) 100\n(C) 120\n\nDigite A, B ou C:"
        );
        if (resposta10 != null && resposta10.equalsIgnoreCase("A")) {
            pontuacao += 10000;
        }

        // Exibir resultado final com nome e pontuação
        JOptionPane.showMessageDialog(null, "Jogador: " + nomeJogador + "\nPontuação final: " + pontuacao + " pontos!");
    }
}