/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso_karin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clases | - Modulos - no necesitan ser instanciados | - Objetos - necesitan
 * ser instanciados
 *
 * Instancia = darle un valor inicial a un objeto
 *
 */
public class Entradas {

    //ambito estatico retorno nombre paramateros
    public static byte leerByte(String mensaje) {
        //variables
        boolean ocurrioError;
        byte entrada = 0;
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                entrada = leer.nextByte();
                ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    //ambito estatico retorno nombre paramateros
    public static int leerInt(String mensaje) {
        //variables
        boolean ocurrioError;
        int entrada = 0;
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                entrada = leer.nextInt();
                ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    //ambito estatico retorno nombre paramateros
    public static float leerFloat(String mensaje) {
        //variables
        boolean ocurrioError;
        float entrada = 0;
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                entrada = leer.nextFloat();
                ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    //ambito estatico retorno nombre paramateros
    public static double leerDouble(String mensaje) {
        //variables
        boolean ocurrioError;
        double entrada = 0;
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                entrada = leer.nextDouble();
                ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    //ambito estatico retorno nombre paramateros
    public static char leerChar(String mensaje) {
        //variables
        boolean ocurrioError;
        String string;
        char entrada = 0;
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                string = leer.next();
                //
                if (string.length() > 1) {
                    throw new InputMismatchException("error de formato");
                }
                entrada = string.charAt(0);
                 ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    //ambito estatico retorno nombre paramateros
    public static String leerString(String mensaje) {
        //variables
        boolean ocurrioError;
        String entrada = "";
        //mensaje en consola

        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                entrada = leer.next();
                ocurrioError = false;
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

}
