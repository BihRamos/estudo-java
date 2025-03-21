package eleicao2.pkg1;

import javax.swing.*;

public class Eleicao21 {
    public static void main(String[] args) {
        
       String nome, eleicao;
       int idade;
       double titulo;
       
       nome = JOptionPane.showInputDialog("Digite seu nome:");
       idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
       titulo = Double.parseDouble( JOptionPane.showInputDialog("Digite seu título:"));
       
        
        if (idade < 16) {
            eleicao = "Não vota";
        } else if ((idade >= 16 && idade <= 18) || idade >= 60) {
            eleicao = "Voto opcional";
        } else {
            eleicao = "Voto obrigatório";
        }

        JOptionPane.showMessageDialog(null,"Seu nome: " + nome +"\nSua idade: " + idade +"\nSeu título: " + titulo +"\nSituação do voto: " + eleicao);
    }
}
