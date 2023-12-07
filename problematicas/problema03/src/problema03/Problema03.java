/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        double celsius;
        String cadena ="";
        
        limite=20+(20*4);
        
        for(int i=20;i<=limite;i+=4){
            celsius=(5.0/9.0)*(i-32.0);
            cadena=String.format("%sGrados Fahrenheit: %d a Grados Cel"
                    + "sius: %.1f\n",cadena,i,celsius);
        }
        System.out.printf("%s",cadena);
        
    }
    
}
