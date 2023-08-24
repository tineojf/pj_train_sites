/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_final_taller;

/**
 *
 * @author tineo
 */
import java.util.Scanner;

public class Java_final_taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Dimensiones de vagones
        String[][] vagonTurista = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}
        };
        String[][] vagonVIP = {
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""}
        };
        String[][] vagonPueblo = {
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""}
        };

        // Mostrar vagones
        /*
        mostrarVagones(vagonTurista, "T");
        System.out.println("");
        mostrarVagones(vagonVIP, "V");
        System.out.println("");
        mostrarVagones(vagonPueblo, "P");
         */
    }

    public static void mostrarVagones(String[][] pm_array, String pm_tipo) {
        int pm_fila = pm_array.length;
        int pm_columna = pm_array[0].length;
        int contador = 1;

        for (int i = 0; i < pm_fila; i++) {
            for (int j = 0; j < pm_columna; j++) {
                if (pm_array[i][j].equals("")) {
                    System.out.print(pm_tipo + contador + "        ");
                } else {
                    System.out.print(pm_array[i][j] + "        ");
                }
                contador += 1;
            }
            System.out.println("");
        }
    }

    public static int mostrarCategoriasBoleto() {
        Scanner scanner = new Scanner(System.in);
        int pm_opcion = 0;

        System.out.println("COMPRA DE BOLETOS");
        System.out.println("1. Turista - $100");
        System.out.println("2. VIP     - $80");
        System.out.println("3. Pueblo  - $10");

        do {
            System.out.println("Ingrese el tipo de vagon (1-3):");
            pm_opcion = scanner.nextInt();
        } while (pm_opcion < 1 || pm_opcion > 3);

        return pm_opcion;
    }
}
