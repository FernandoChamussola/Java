/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s = 0;
        int cont=0;
        int p = 0;
        int i = 0;
        int m = 0;
        double me = 0;
        do{  
        
          n = Integer.parseInt(JOptionPane.showInputDialog("informe um numero: (valor 0 interrompe)"));
       // JOptionPane.showMessageDialog(null, n);
       
       if(n%2==0) p++;
       if(n%2!=0) i++;
       if(n>100) m++;
       s+=n;
       cont++;
        }while (n!= 0);
        m = s/cont;
        JOptionPane.showMessageDialog(null,"total de valores,Total de pares,Total de impares, Acima de 100 , Mediana, "+ cont + p + i + m + me );

    }
    
}
