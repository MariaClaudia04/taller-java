/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerVariables;

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
        
        System.out.println("Cual es tu nombre:");
        String Nombre = scanner.nextLine();
         System.out.println("Como es tu apellido:");
        String Apellido = scanner.nextLine();
        System.out.println("Cual es tu edad:");
        int Edad = scanner.nextInt();
        System.out.println("Cual es tu estatura:");
        double Estatura = scanner.nextDouble();
        
        System.out.println("Mi nombre es "+ Nombre+""+""+" Mi apellido es "+ Apellido+""+" y "+""+" tengo "+"" +Edad+""+" años"+","+""+"Mi estatura es de "+""+Estatura+""+" Metros");
    }
    
}
