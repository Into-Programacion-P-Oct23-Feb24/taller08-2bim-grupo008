/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
<<<<<<< HEAD

import java.util.Locale;
import java.util.Scanner;

=======
import java.util.Locale;
import java.util.Scanner;
>>>>>>> ae704a006c14cc35d800aee8514ae7b9f98f5a1c
/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

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
<<<<<<< HEAD
        int sumaEdades=0;
        double sumaEstaturas=0;
=======
        int sumaEdades = 0;
        double sumaEstaturas = 0;
>>>>>>> ae704a006c14cc35d800aee8514ae7b9f98f5a1c
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
<<<<<<< HEAD
            sumaEdades=sumaEdades+edad;
            sumaEstaturas=sumaEstaturas+estatura;
        }
        promedioEdades=sumaEdades/limite;
        promedioEstaturas=sumaEstaturas/limite;
=======
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
        }
        promedioEdades = sumaEdades / limite;
        promedioEstaturas = sumaEstaturas / limite;
>>>>>>> ae704a006c14cc35d800aee8514ae7b9f98f5a1c
        System.out.printf("Listado de jugadores\n%s", cadena);
        System.out.printf("Listado de edades: %s", cadena1);
        System.out.printf("\nPromedio de edades: %.1f Promedio de estaturas"
                + " %.1f", promedioEdades,
                promedioEstaturas);
    }

}
