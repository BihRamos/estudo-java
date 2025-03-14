package notarecupe;

import javax.swing.*;

public class NotaRecupe {

    public static void main(String[] args) {
        String nota = "";
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, media = 0, mediarec = 0;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));

        media = (n1 + n2) / 2;

        if (media >= 6) {

            nota = "Aluno Aprovado";

        } else if (media <= 5) {

            nota = "Aluno em Recuperação";

            JOptionPane.showMessageDialog(null, "Resultado da Recuperação: " + media);

            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua media de recuperaçao"));
            n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota atualizada"));

            mediarec = (n3 + n4) / 2;

            if (mediarec >= 6) {

                nota = "Aluno Aprovado após recuperação";
            } else {
                nota = "Aluno Reprovado";
            }

        } else {
            nota = "Aluno Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + nota);
    }

}
