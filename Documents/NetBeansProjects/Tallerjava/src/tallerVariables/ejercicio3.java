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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
     
     System.out.println("Cual es tu nombre:");
     String NombreCompleto = scanner.nextLine();
     System.out.println("Cual es el nombre de tu madre:");
     String NombreMadre = scanner.nextLine();
     System.out.println("Cual es el nombre de tu padre:");
     String NombrePadre = scanner.nextLine();
    
     System.out.println(NombreCompleto+""+" soy hijo de "+""+NombreMadre+""+" y de "+ NombrePadre);
    }
    
}
