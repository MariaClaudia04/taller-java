/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCondicionales;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu edad :");
        int Edad = scanner.nextInt();

        if (Edad < 18) {
            System.out.println("Usted aun es un niño");
        }

    }
}
