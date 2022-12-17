/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Claudia
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int Opciones;
        String Opciones2;
        do {
            System.out.println("Menu de usuario");
            System.out.println("Ingresa 1: nombre ");
            System.out.println("Ingresa 2: saludar ");
            System.out.println("Ingresa 3: salir del sistema");
            Opciones = Integer.parseInt(bufEntrada.readLine());
            switch (Opciones) {
                case 1:
                    System.out.println("Usted a escogido nombre");
                    break;
                case 2:
                    System.out.println("Usted a escogido saludar");
                    break;
                case 3:
                    System.out.println("Usted a escogido salir del sistema");
                    break;
                default:
                    System.out.println("La opcion escogida no es validad");
            }
            System.out.println("¿Usted desea ver el menu de nuevo? digite S para continuar o N para salir del sistema ");
            Opciones2 = bufEntrada.readLine();

        } while (Opciones2.equals("s") || Opciones2.equals("S"));
    }

}
