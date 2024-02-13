/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Pratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String f = JOptionPane.showInputDialog("ola Fernando");
        //este mostra uma caixa de dialogo
        String a = "oi tudo bem?";
        if(f.equalsIgnoreCase(a)){//equalIgnoreCase ignora diferencas de maiusculas e miniscuslas
        JOptionPane.showMessageDialog(null, "Sim e com voce?");//este cria uma caixa com uma menssagem
        }else{
            JOptionPane.showMessageDialog(null,"Nao sei como responder");
        }
    }
    
}
