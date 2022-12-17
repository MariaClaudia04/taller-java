/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerArreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Claudia
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int vector[];
        int Paso = 0;
        vector = new int[5];
        for (i = 0; i <= 5 - 1; i += Paso) {
            System.out.println("Ingrese un numero entero");
            vector[i] = Integer.parseInt(bufEntrada.readLine());
            i = i + 1;
        }
        for (i = 0; i <= 5 - 1; i += Paso) {
            System.out.println("[" + i + "] = " + vector[i]);
            i = i + 1;
        }
    }

}
