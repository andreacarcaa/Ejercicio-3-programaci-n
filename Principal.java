package com.liceolapaz.des.acc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
        //Escribir menú
        escribirMenu();
        //pedir opción
        pedirOpcion();
        //Leer opción y guardarla
        int opcion = leerOpcion();
        //
        switch (opcion) {
            case 0:
                System.out.println("Usted ha decidido salir, Hasta la próxima.");
                System.exit(0);
                break;
            case 1:
            //Pedir cantidad
                pedirCantidad1();
            //Leer cantidad y guardarla
            double cantidad1= leerCantidad1();
            //realizar conversion
            double cambio1= cantidad1 * 0.86;
                System.out.println("La cantidad en euros es : " + cambio1);
                break;
            case 2:
                //Pedir cantidad
                pedirCantidad2();
                //Leer cantidad y guardarla
                double cantidad2= leerCantidad2();
                //realizar conversion
                double cambio2= cantidad2 * 1.19;
                System.out.println("La cantidad en euros es : " + cambio2);
                break;
            case 3:
                //Pedir cantidad
                pedirCantidad3();
                //Leer cantidad y guardarla
                double cantidad3= leerCantidad3();
                //realizar conversion
                double cambio3= cantidad3 * 0.0075;
                System.out.println("La cantidad en euros es : " + cambio3);
                break;
            default:
                System.out.println("Error, no existe esta opción");
        }
        } while(true);
    }

    private static double leerCantidad3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirCantidad3() {
        System.out.print("Escriba la cantidad que desea cambiar: ");
    }

    private static double leerCantidad2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirCantidad2() {
        System.out.print("Escriba la cantidad que desea cambiar: ");
    }

    private static double leerCantidad1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirCantidad1() {
        System.out.print("Escriba la cantidad que desea cambiar: ");
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja la opción que usted quiera: ");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n"+
                "1.Dólares\n"+
                "2.Libras\n"+
                "3.Yens\n"+
                "0.Salir");
    }
}
