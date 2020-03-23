package motivationalmessages;

import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Menu {

    private int mensagem;
    private String nome;
    
    void GerandoMensagem(int opcao){
        
        opcao = JOptionPane.showConfirmDialog(null,"Deseja Continuar??");
        
    }

    void BemVindo() {

        this.nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Olá! " + this.nome + "Seja Bem Vindo", "Opa!",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Este programa é para melhorar seu dia durante essa quarentena com mensagens motivacionais","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void exibirMensagem(){
        
         this.mensagem = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero de 1 a 10 para gerar uma mensagem motivacional", "HEHEHEH",JOptionPane.INFORMATION_MESSAGE));
       
       switch (mensagem){
           
           case 1:
               JOptionPane.showMessageDialog(null, "1- Você provavelmente terá de entrar em uma batalha mais de uma vez para vencê-la");
           break;
           case 2:
               JOptionPane.showMessageDialog(null, "2- Quanto maior o artista, maiores são os momentos de dúvida. Confiança inabalável é algo garantido para os menos talentosos, como um prêmio de consolação");
           break;
           case 3:
                JOptionPane.showMessageDialog(null, "3- A lógica pode levar de um ponto A a um ponto B. A imaginação pode levar a qualquer lugar");
           break;
           case 4:
               JOptionPane.showMessageDialog(null, "4- Sonhe como se você fosse viver para sempre. Viva como se você fosse morrer hoje");
           break;
           case 5:
               JOptionPane.showMessageDialog(null, "5- Fazer o que você gosta é liberdade. Gostar do que você faz é felicidade");
           break;
           case 6:
               JOptionPane.showMessageDialog(null, "6- Seja feliz com o que você tem, mas fique animado com a chance de ter mais");
           break;
           case 7:
               JOptionPane.showMessageDialog(null, "7- Seu tempo é curto. Por isso, não o desperdice vivendo a vida de outra pessoa");
           break;
           case 8:
               JOptionPane.showMessageDialog(null, "8- Somos nós que forjamos as correntes que usamos em nossas vidas");
           break;
           case 9:
               JOptionPane.showMessageDialog(null, "9- A arte de viver bem não consiste em eliminar o que nos faz sofrer, mas crescer com esses problemas");
           break;
           case 10:
               JOptionPane.showMessageDialog(null, "10- Você nunca se arrependerá de ser gentil");
           break;
        
    }

}
}
