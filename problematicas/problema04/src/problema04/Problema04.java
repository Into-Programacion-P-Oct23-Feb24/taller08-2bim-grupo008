/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        String cadena = "";
        String cadena1 = "";
        double promedioEdades;
        double promedioEstaturas;
        int sumaEdades=0;
        double sumaEstaturas=0;
        System.out.println("ingresar limite");
        limite = entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese nombre del jugador");
            String nombre = entrada.nextLine();
            System.out.println("Posicion en el campo de juego");
            String posicion = entrada.nextLine();
            System.out.println("Edad del jugador");
            int edad = entrada.nextInt();
            System.out.println("Estatura");
            double estatura = entrada.nextDouble();
            cadena = String.format("%s%d. %s-%s-,edad %d,estatura %.2f\n",
                    cadena, i, nombre,
                    posicion, edad, estatura);
            cadena1 = String.format("%s%d ", cadena1, edad);
            sumaEdades=sumaEdades+edad;
            sumaEstaturas=sumaEstaturas+estatura;
        }
        promedioEdades=sumaEdades/limite;
        promedioEstaturas=sumaEstaturas/limite;
        System.out.printf("Listado de jugadores\n%s", cadena);
        System.out.printf("Listado de edades: %s", cadena1);
        System.out.printf("Promedio de edades: %.1f Promedio de estaturas"
                + " %.1f", promedioEdades,
                promedioEstaturas);
    }

}
