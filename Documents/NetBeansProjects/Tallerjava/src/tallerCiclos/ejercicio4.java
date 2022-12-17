/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCiclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int n = 0;
        int Resultado;

        System.out.println("Ingresa un numero");
        n = Integer.parseInt(bufEntrada.readLine());

        for (x = 1; x <= 10; x++) {
            Resultado = n * x;

            System.out.println(n + "x" + x + "=" + Resultado);
        }
    }

}
