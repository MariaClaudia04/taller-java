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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sacanner = new Scanner(System.in);

        System.out.println("Cual es tu edad :");
        int Edad = sacanner.nextInt();

        if (Edad >= 18) {
            System.out.println("Usted es mayor de Edad");
        }
    }

}
