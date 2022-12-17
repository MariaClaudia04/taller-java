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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int numer[];
        numer = new int[20];
        do {
            System.out.println("ingresa el numero en posicion " + i);
            numer[i] = Integer.parseInt(bufEntrada.readLine());
            i = i + 1;
        } while (i != 20);
        System.out.print("Números pares: ");
        for (i = 0; i <= 20 - 1; i++) {
            if (numer[i] % 2 == 0) {
                System.out.print(numer[i] + ",");
            }
        }
        System.out.println("");
        System.out.print("Números impares: ");
        for (i = 0; i <= 20 - 1; i++) {
            if (numer[i] % 2 != 0) {
                System.out.print(numer[i] + ",");
            }
        }
        System.out.println("");
    }

}
