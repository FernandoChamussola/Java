/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dimensaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class DimensaoDaTela {

    public static void main(String[] args) {
        Dimension screenSize;
        screenSize = Toolkit.getDefaultTookit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println("x" + height + "." + "a resolucao e " + width);
        
    }
}
