/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String m = "2";
//        int n = Integer.parseInt(m);
//        System.out.println(n);
     Scanner teclado = new Scanner (System.in);
        System.out.println("ola digite um numero");
       int n = teclado.nextInt();
        System.out.println(2*n);
    }
    
}
