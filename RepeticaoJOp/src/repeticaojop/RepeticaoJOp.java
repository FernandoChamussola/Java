/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaojop;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RepeticaoJOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a =  JOptionPane.showInputDialog("Quantos numeros vais digitar?");
        int n = Integer.parseInt(a);
        String s = "s";
        int pares = 0;
        int impar = 0;
        int maiores = 0;
      for (int i =1 ; i<=n; i++){
        String v =  JOptionPane.showInputDialog("Digite o  numero");
         int w = Integer.parseInt(v);
         if(w%2==0) pares++;
         if(w%2!=0) impar++;
         if(w>100) maiores++;
      }
        
        
      
    }
    
}
