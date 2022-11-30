/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso_karin;

/**
 *
 * @author jp
 */
public class Curso_Karin {

    public static void main(String[] args) {
        String mensaje = "Introduce un ";
        byte inByte = Entradas.leerByte(mensaje + "byte");
        int inInt = Entradas.leerInt(mensaje + "int");
        float leerFloat = Entradas.leerFloat(mensaje + "float");
        double leerDouble = Entradas.leerDouble(mensaje + "double");
        char leerChar = Entradas.leerChar(mensaje + "char");
        String leerString = Entradas.leerString(mensaje + "string");
        //
        System.out.println("Esta es la entrada:" + inByte);
        System.out.println("Esta es la entrada:" + inInt);
        System.out.println("Esta es la entrada:" + leerFloat);
        System.out.println("Esta es la entrada:" + leerDouble);
        System.out.println("Esta es la entrada:" + leerChar);
        System.out.println("Esta es la entrada:" + leerString);
    }

}
