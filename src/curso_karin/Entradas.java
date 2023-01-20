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

    //ambito estatico retorno nombre paramateros
    public static boolean leerBoolean(String mensaje) {
        //variables
        boolean ocurrioError;
        boolean entrada = false;
        String aux = "";
        //mensaje en consola
        //
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(mensaje);
                aux = leer.next();
                if (aux.equalsIgnoreCase("s")) {
                    entrada = true;
                    ocurrioError = false;
                } else if (aux.equalsIgnoreCase("n")) {
                    entrada = false;
                    ocurrioError = false;
                } else {
                    ocurrioError = true;
                }
            } catch (InputMismatchException e) {
                ocurrioError = true;
                System.out.println("Error de formato");
            }
        } while (ocurrioError);
        return entrada;
    }

    public void xd() {
        //Programa Calculadora v 3.0

        //Definir variables
        int x = 0, y = 0, r = 0, opc;
        Scanner entrada;
        boolean salir;
        do {

            salir = false;

            //Definir lector
            entrada = new Scanner(System.in);

            System.out.println("Que operacion quieres hacer?"
                    + "\n[1] Sumar"
                    + "\n[2] Restar"
                    + "\n[3] Multiplicar"
                    + "\n[4] Dividir"
                    + "\n[5] salir"
            );

            opc = entrada.nextInt();
            if (opc > 0 && opc < 6) {
                //Entrada de datos
                if (opc != 5) {
                    System.out.println("Ingresa un numero");
                    x = entrada.nextInt();
                    System.out.println("Ingresa un numero");
                    y = entrada.nextInt();
                }
                switch (opc) {
                    case 1:
                        r = x + y;
                        break;
                    case 2:
                        r = x - y;
                        break;
                    case 3:
                        r = x * y;
                        break;
                    case 4:
                        r = x / y;
                        break;
                    case 5:
                        System.out.println("Fin del programa");
                        salir = true;
                        break;
                }
                if (!salir) {
                    //Mostrar Resultados
                    System.out.println("Resultado: " + r);
                }
            } else {
                System.out.println("Opcion no validad");
            }
        } while (!salir);
    }

    public static void main() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hola Mundo");
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Juan Pablo");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Karin");
        }

        imprimirNVeces(10, "Hola Mundo");
        imprimirNVeces(20, "Juan Pablo");
        imprimirNVeces(200, "Karin");

    }

    public static void imprimirNVeces(int repeticiones, String texto) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(texto);
        }
    }

    public static void main2() {
        int opc = 1;
        int x = 45;
        int y = 12;
        int resultado = opciones(opc, x, y);
        System.out.println("resultado: " + resultado);
    }

    public static int opciones(int opc, int x, int y) {
        switch (opc) {
            case 0:
                return x + y;
            case 1:
                return x - y;
            case 2:
                return x * y;
            case 3:
                return x / y;
            default:
                System.out.println("Opcion no disponibre");
        }
        return -1;
    }

    public static void arreglos() {
        //inicializar o creacion
        int tam = 3;
        String[] nombres = new String[tam];
        //guardar
        nombres[0] = "Juan Pablo";
        nombres[1] = "David";
        nombres[2] = "Karin";
        imprimirArreglo(nombres);
        //editar
        nombres[1] = "Karla";
        imprimirArreglo(nombres);
        //eliminar
        nombres[2] = null;
        //consular
        String aux = nombres[0].toUpperCase();
        nombres[0] = aux;
        System.out.println(nombres[0]);
        System.out.println("-------------------------------");
        //
        imprimirArreglo(nombres);
        //
        System.out.println("tamaño: " + nombres.length);
        System.out.println(nombres.toString());
    }

    public static void imprimirArreglo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------");
    }

    public static void cadenas() {
        String a = "Hola ", b = "Mundo", c = null;
        //Original
        System.out.println(a);
        //toCharArray = devuelve un array de char o caracteres
        char[] chars = a.toCharArray();
        for (char i : chars) {
            System.out.println(i);
        }
        //isEmpty = devueleve true si la cadenas es vacia o false si no lo es
        boolean empty = a.isEmpty();
        System.out.println(empty);
        //toUpperCase = Convierte la cadena a mayusculas
        String toUpperCase = a.toUpperCase();
        System.out.println(toUpperCase);
        String toLowerCase = a.toLowerCase();
        System.out.println(toLowerCase);
        //
        char charAt = a.charAt(2);
        System.out.println(charAt);
        //
        String trim = a.trim();
        System.out.println(trim);
        String replace = a.replace(" ", "1");
        System.out.println(replace);
        //array = a
        System.out.println(a);
        //concatenacion
        c = a + b + " XDDD";
        System.out.println(c);
    }

}
