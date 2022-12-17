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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cual es el nombre de tu mascota:");
        String NombreMascota = scanner.nextLine();
        System.out.println("Que tipo de raza es tu masccota:");
        String TipoMascota = scanner.nextLine();
        System.out.println("Cual es la edad de tu mascota:");
        int EdadMascota = scanner.nextInt();
        System.out.println("Cual es el nombre de su dueño:");
        String NombreDueño = scanner.nextLine();
        
        System.out.println(NombreMascota+" es una "+ TipoMascota+" el cual tiene "+ EdadMascota+" años "+ " y su dueño actual se llama "+ NombreDueño);
    }
    
}
