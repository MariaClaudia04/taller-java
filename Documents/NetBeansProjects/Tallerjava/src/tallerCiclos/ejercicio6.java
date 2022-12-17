/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int Eliminar;
        String Nombre1 = "";
        String Nombre2 = "";
        String Nombre3 = "";
        String Organizacion1 = "";
        String Organizacion2 = "";
        String Organizacion3 = "";
        String Telefono1 = "";
        String Telefono2 = "";
        String Telefono3 = "";
        boolean NumeroCorrecto = false;
        int Ciclo;
        int Posicion;

        do {
            System.out.println("Agenda de contactos");
            System.out.println("1: Agregar contactos");
            System.out.println("2: Lista de contactos");
            System.out.println("3: Eliminar contactos");
            System.out.println("4: Salir");
            Ciclo = Integer.parseInt(bufEntrada.readLine());

            switch (Ciclo) {
                case 1:
                    System.out.println("Agenda de contactos");
                    System.out.println("Agregar contactos");
                    System.out.println("En que posicion desea guardar su contacto 1,2 o 3");
                    Posicion = Integer.parseInt(bufEntrada.readLine());

                    if (Posicion == 1) {
                        System.out.println("Agregar contacto 1");
                        System.out.println("Ingrese su nombre");
                        Nombre1 = bufEntrada.readLine();
                        System.out.println("Ingrese su numero de linea telefonica");

                        do {
                            Telefono1 = bufEntrada.readLine();
                            if (Telefono1 == Telefono2 || Telefono1 == Telefono3) {
                                System.out.println("El numero de telefono ya existe ingrese otro numero");
                            } else {
                                NumeroCorrecto = true;
                            }
                        } while (NumeroCorrecto != true);
                        System.out.println("Ingresa la organizacion de tu linea telefonica");
                        Organizacion1 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Contacto1");
                        System.out.println("Nombre: " + Nombre1);
                        System.out.println("Telefono: " + Telefono1);
                        System.out.println("Organizacion: " + Organizacion1);
                    }

                    if (Posicion == 2) {
                        System.out.println("Agregar contacto 2");
                        System.out.println("Ingrese su nombre");
                        Nombre1 = bufEntrada.readLine();
                        System.out.println("Ingrese su nuemero de linea telefonica");

                        do {
                            Telefono2 = bufEntrada.readLine();
                            if (Telefono2 == Telefono1 || Telefono2 == Telefono3) {
                                System.out.println("El numero de telefono ya existe ingrese otro numero");
                            } else {
                                NumeroCorrecto = true;
                            }
                        } while (NumeroCorrecto != true);
                        System.out.println("Ingresa la organizacion de tu linea telefonica");
                        Organizacion2 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Contacto2");
                        System.out.println("Nombre: " + Nombre2);
                        System.out.println("Telefono: " + Telefono2);
                        System.out.println("Organizacion: " + Organizacion2);
                    }
                    if (Posicion == 3) {
                        System.out.println("Agregar contacto 3");
                        System.out.println("Ingrese su nombre");
                        Nombre1 = bufEntrada.readLine();
                        System.out.println("Ingrese su nuemero de linea telefonica");

                        do {
                            Telefono3 = bufEntrada.readLine();
                            if (Telefono3 == Telefono1 || Telefono3 == Telefono2) {
                                System.out.println("El numero de telefono ya existe ingrese otro numero");
                            } else {
                                NumeroCorrecto = true;
                            }
                        } while (NumeroCorrecto != true);

                        System.out.println("Ingresa la organizacion de tu linea telefonica");
                        Organizacion3 = bufEntrada.readLine();
                        System.out.println("");
                        System.out.println("Contacto3");
                        System.out.println("Nombre: " + Nombre3);
                        System.out.println("Telefono: " + Telefono3);
                        System.out.println("Organizacion: " + Organizacion3);

                    }
                    if (Posicion < 1 || Posicion > 3) {
                        System.out.println("Agregar contactos");
                        System.out.println("Esta Posicion no esta permitida");
                        System.out.println("Ingrese una posicion");
                        Posicion = Integer.parseInt(bufEntrada.readLine());
                    }
                    break;

                case 2:
                    System.out.println("Lista de contactos");
                    System.out.println("");
                    System.out.println("Contacto1");
                    System.out.println("Nombre: " + Nombre1);
                    System.out.println("Telefono: " + Telefono1);
                    System.out.println("Organizacion: " + Organizacion1);
                    System.out.println("");
                    System.out.println("Contacto2");
                    System.out.println("Nombre: " + Nombre2);
                    System.out.println("Telefono: " + Telefono2);
                    System.out.println("Organizacion: " + Organizacion2);
                    System.out.println("");
                    System.out.println("Contacto3");
                    System.out.println("Nombre: " + Nombre3);
                    System.out.println("Telefono: " + Telefono3);
                    System.out.println("Organizacion: " + Organizacion3);
                    break;

                case 3:
                    System.out.println("Eliminar contactos");
                    System.out.println("Cual contacto deseas eliminar 1,2 o 3");
                    Eliminar = Integer.parseInt(bufEntrada.readLine());

                    if (Eliminar == 1) {
                        System.out.println("Eliminar contacto 1");
                        Nombre1 = "";
                        System.out.println("Nombre: " + Nombre1);
                        Telefono1 = "";
                        System.out.println("Telefono: " + Telefono1);
                        Organizacion1 = "";
                        System.out.println("Organizacion: " + Organizacion1);

                    }
                    if (Eliminar == 1) {
                        System.out.println("Eliminar contacto 2");
                        Nombre1 = "";
                        System.out.println("Nombre: " + Nombre2);
                        Telefono2 = "";
                        System.out.println("Telefono: " + Telefono2);
                        Organizacion1 = "";
                        System.out.println("Organizacion: " + Organizacion2);

                    }
                    if (Eliminar == 3) {
                        System.out.println("Eliminar contacto 3");
                        Nombre3 = "";
                        System.out.println("Nombre: " + Nombre3);
                        Telefono3 = "";
                        System.out.println("Telefono: " + Telefono3);
                        Organizacion1 = "";
                        System.out.println("Organizacion: " + Organizacion3);
                    }
                    break;
                case 4:
                    System.out.println("Cerrar agenda");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (Ciclo != 4);
    }

}
