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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la capital");
        String NombreCiudad = scanner.nextLine();
        System.out.println("Ingrese el nombre del pais");
        String Pais = scanner.nextLine();
        
        System.out.println("la ciudad de "+NombreCiudad+ " es la capital del "+Pais);
    }
    
}
