package com.mycompany.imprimiriniciales;

import java.util.Scanner;

public class ImprimirIniciales {

    Scanner entrada = new Scanner(System.in);
    static String nombre; // nombre
    static String apellido; // apellido

    public void CalcularIniciales(String nombre, String apellido) {
        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = entrada.next();
        apellido = entrada.next();
        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");
    }

    public static void main(String[] args) {
        ImprimirIniciales imprimir = new ImprimirIniciales();
        imprimir.CalcularIniciales(nombre, apellido);

    }

}

