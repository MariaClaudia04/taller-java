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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String Nombre = scanner.nextLine();
        System.out.println("cual es tu apellido:");
        String Apellido = scanner.nextLine();
        
        System.out.println(Nombre +" "+ Apellido);
        
    }
    
}
