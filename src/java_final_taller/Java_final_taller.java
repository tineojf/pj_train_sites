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
            {"T01", "T02", "T03"},
            {"T04", "T05", "T06"},
            {"T07", "T08", "T09"}
        };
        String[][] vagonVIP = {
            {"V01", "V02", "V03", "V04"},
            {"V05", "V06", "V07", "V08"},
            {"V09", "V10", "V11", "V12"}
        };
        String[][] vagonPueblo = {
            {"P01", "P02", "P03", "P04", "P05"},
            {"P06", "P07", "P08", "P09", "P10"},
            {"P11", "P12", "P13", "P14", "P15"}
        };

        String[] arr_app = {
            "1. Compra de Boletos", 
            "2. Pasajeros por vagon",
            "3. Pasajeros general",
            "4. Ganancias",
            "5. Asientos vacios por vagon",
            "6. Salir"
        };

        String[] arr_boleto = {
            "1. Turista - $100",
            "2. VIP     - $80",
            "3. Pueblo  - $10",
            "4. Salir"
        };

        // Habilitar compra boletos ficticia
        compraFicticiaAsientos(vagonTurista, vagonVIP, vagonPueblo);

        // Mostrar opciones de la aplicacion
        System.out.println("FUNCIONALIDADES DE LA APLICACION");
        int opc_aplicacion = mostrarArrayOpciones(arr_app, "la funcionalidad");

        switch (opc_aplicacion) {
            case 1:
                System.out.println("COMPRA DE BOLETOS");
                int opc_boleto = mostrarArrayOpciones(arr_boleto, "la categoria");
                evaluarOpcionBoleto(vagonTurista, vagonVIP, vagonPueblo, opc_boleto);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                salir();
                break;
            default:
                salir();
        }
    }

    public static void salir() {
        System.out.println("Fin del programa.");
        System.exit(0);
    }

    public static int mostrarArrayOpciones(String[] pm_array, String pm_nombre) {
        Scanner scanner = new Scanner(System.in);
        int pm_opcion = 0;

        for (String pm_array1 : pm_array) {
            System.out.println(pm_array1);
        }

        do {
            System.out.println("Ingresa " + pm_nombre);
            pm_opcion = scanner.nextInt();
        } while (pm_opcion < 1 || pm_opcion > pm_array.length);

        return pm_opcion;
    }

    public static void mostrarVagones(String[][] pm_array) {
        int pm_fila = pm_array.length;
        int pm_columna = pm_array[0].length;
        System.out.println("Asientos disponibles");

        for (int i = 0; i < pm_fila; i++) {
            for (int j = 0; j < pm_columna; j++) {
                System.out.print(pm_array[i][j] + "        ");
            }
            System.out.println("");
        }
    }

    public static void evaluarOpcionBoleto(String[][] vg1, String[][] vg2, String[][] vg3, int pm_opcion) {
        switch (pm_opcion) {
            case 1:
                mostrarVagones(vg1);
                System.out.println("El asiento costará $100");
                verificarAsientoLibre(vg1);
                mostrarVagones(vg1);
                break;
            case 2:
                mostrarVagones(vg2);
                System.out.println("El asiento costará $80");
                verificarAsientoLibre(vg2);
                mostrarVagones(vg2);
                break;
            case 3:
                mostrarVagones(vg3);
                System.out.println("El asiento costará $10");
                verificarAsientoLibre(vg3);
                mostrarVagones(vg3);
                break;
            case 4:
                salir();
                break;
            default:
                salir();
        }
    }

    public static void verificarAsientoLibre(String[][] pm_array) {
        Scanner scanner = new Scanner(System.in);
        int pm_fila = pm_array.length;
        int pm_columna = pm_array[0].length;
        boolean asiento_encontrado = false;

        System.out.println("Ingrese el asiento que desea: ");
        String pm_opcion = scanner.nextLine();

        for (int i = 0; i < pm_fila; i++) {
            for (int j = 0; j < pm_columna; j++) {
                if (pm_array[i][j].equals(pm_opcion)) {
                    System.out.println("Asiento seleccionado con exito.");
                    System.out.println("Ingrese su nombre y apellido para el registro:");
                    String nombre = scanner.nextLine();
                    pm_array[i][j] = nombre;
                    asiento_encontrado = true;
                }
            }
        }

        if (!asiento_encontrado) {
            System.out.println("Asiento no encontrado");
            salir();
        }
    }

    public static void compraFicticiaAsientos(String[][] vg1, String[][] vg2, String[][] vg3) {
        vg1[1][1] = "Timmy";
        vg1[0][2] = "Alex";
        vg1[2][2] = "Felix";
        vg1[1][0] = "Mishi";

        vg2[2][3] = "Oliver";
        vg2[0][0] = "Monza";
        vg2[2][0] = "David";
        vg2[0][2] = "Susan";
        vg2[1][1] = "Sam";

        vg3[0][4] = "Alisson";
        vg3[2][0] = "Berny";
        vg3[1][1] = "Oliv";
    }

}
