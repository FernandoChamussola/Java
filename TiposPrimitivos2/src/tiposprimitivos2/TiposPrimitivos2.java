/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TiposPrimitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s e %.1f \n" , nome, nota);
        //podes colocar  format no lugar do printf.
    }
    
}
