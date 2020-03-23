/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motivationalmessages;

import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Mensagens implements Mensagem{

    private int mensagem;

    @Override
    public void exibirMensagem() {
        
       this.mensagem = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero de 1 a 10 para gerar uma mensagem motivacional", "HEHEHEH",JOptionPane.INFORMATION_MESSAGE));
       
       switch (mensagem){
           
           case 1:
               JOptionPane.showInputDialog(null, "1- Você provavelmente terá de entrar em uma batalha mais de uma vez para vencê-la", "Sua Mensagem");
           break;
           case 2:
               JOptionPane.showInputDialog(null, "2- Quanto maior o artista, maiores são os momentos de dúvida. Confiança inabalável é algo garantido para os menos talentosos, como um prêmio de consolação", "Sua Mensagem");
           break;
           case 3:
                JOptionPane.showInputDialog(null, "3- A lógica pode levar de um ponto A a um ponto B. A imaginação pode levar a qualquer lugar", "Sua Mensagem");
           break;
           case 4:
               JOptionPane.showInputDialog(null, "4- Sonhe como se você fosse viver para sempre. Viva como se você fosse morrer hoje", "Sua Mensagem");
           break;
           case 5:
               JOptionPane.showInputDialog(null, "5- Fazer o que você gosta é liberdade. Gostar do que você faz é felicidade", "Sua Mensagem");
           break;
           case 6:
               JOptionPane.showInputDialog(null, "6- Seja feliz com o que você tem, mas fique animado com a chance de ter mais", "Sua Mensagem");
           break;
           case 7:
               JOptionPane.showInputDialog(null, "7- Seu tempo é curto. Por isso, não o desperdice vivendo a vida de outra pessoa", "Sua Mensagem");
           break;
           case 8:
               JOptionPane.showInputDialog(null, "8- Somos nós que forjamos as correntes que usamos em nossas vidas", "Sua Mensagem");
           break;
           case 9:
               JOptionPane.showInputDialog(null, "9- A arte de viver bem não consiste em eliminar o que nos faz sofrer, mas crescer com esses problemas", "Sua Mensagem");
           break;
           case 10:
               JOptionPane.showInputDialog(null, "10- Você nunca se arrependerá de ser gentil", "Sua Mensagem");
           break;
               
       }
    }
    
}
