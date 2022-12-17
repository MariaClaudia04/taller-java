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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre:");
        String NombreCompleto = scanner.nextLine();
        System.out.println("Como son tus apellidos:");
        String Apellido = scanner.nextLine();
        System.out.println("Cual es tu edad:");
        int Edad = scanner.nextInt();

        if (Edad >= 18) {
            System.out.println(NombreCompleto + " " + Apellido + "Usted es mayor de edad, por lo tanto si puede entrar a la fiesta ");
        } else {
            System.out.println(NombreCompleto + " " + Apellido + " usted es menor de edad por lo tanto, no puede entrar a la fiesta, devuelvase para su casa ");
        }
    }

}
