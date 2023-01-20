/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso_karin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Programas {
      //El programa debe guardar, editar,eliminar y
    //consultar los registros alojados
    public static void array() {
        //BD
        String[] nombres, edades;
        //puntero de memoria
        int i = 0;
        //variable que indica cuando salir
        boolean salir;

        //lector
        Scanner leer = new Scanner(System.in);

        //definir tamaño
        int tam;
        boolean error;
        do {
            tam = -1;
            try {

                System.out.println("ingrese el numero de personas que se van a guardar");
                tam = leer.nextInt();
                if (tam > 0) {
                    break;
                } else {
                    error = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                error = true;
                leer = new Scanner(System.in);
            }
        } while (error);

        nombres = new String[tam];
        edades = new String[tam];
        //
        do {
            salir = false;
            leer = new Scanner(System.in);
            //Menu
            System.out.println("Ingrese la operacion a realizar"
                    + "\n[1] Insertar"
                    + "\n[2] editar"
                    + "\n[3] eliminar"
                    + "\n[4] consultar"
                    + "\n[5] salir"
            );

            //opcion escogida
            int opc;
            //
            try {

                opc = leer.nextInt();

            } catch (InputMismatchException e) {
                System.out.println(e.getClass());
                System.out.println(e.getMessage());
                continue;
            }
            //Opciones
            switch (opc) {
                case 1:
                    System.out.println("Nombre:");
                    nombres[i] = leer.next();
                    System.out.println("Edad:");
                    edades[i] = leer.next();
                    i++;
                    break;
                case 2:
                    System.out.println("Que posicion quiere editar");
                    int e = leer.nextInt();
                    if (e < 0 || e > nombres.length - 1) {
                        System.out.println("Posicion no valida");
                        continue;
                    }
                    System.out.println("Nombre:");
                    nombres[e] = leer.next();
                    System.out.println("Edad:");
                    edades[e] = leer.next();
                    break;
                case 3:
                    System.out.println("Que posicion quiere eliminar");
                    int r = leer.nextInt();
                    if (r < 0 || r > nombres.length - 1) {
                        System.out.println("Posicion no valida");
                        continue;
                    }
                    nombres[r] = null;
                    edades[r] = null;
                    break;
                case 4:
                    System.out.println("Que posicion quiere consultar");
                    int c = leer.nextInt();
                    if (c < 0 || c > nombres.length - 1) {
                        System.out.println("Posicion no valida");
                        continue;
                    }
                    System.out.println("Nombre: " + nombres[c]);
                    System.out.println("edad: " + edades[c]);
                    break;
                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
