/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Claudia
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader BufEntrada = new BufferedReader(new InputStreamReader(System.in));

        String Nombre;
        int Peso;
        double Estatura;
        double imc;

        System.out.println("Secretaria de salud municipal");
        System.out.println("Calculemos el indice de masa corporal");

        System.out.println("Cual es tu nombre");
        Nombre = BufEntrada.readLine();
        System.out.println("Cual es peso en kg");
        Peso = Integer.parseInt(BufEntrada.readLine());
        System.out.println("Cual es tu estatura en metros, ejemplo asi 1,56m");
        Estatura = Double.parseDouble(BufEntrada.readLine());

        imc = Peso / (Math.pow(Estatura, 2));

        System.out.println(Nombre + " tu imc es: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else {
            if (imc >= 18.5 && imc <= 24.8) {
                System.out.println("Peso Normal");

            } else {
                if (imc >= 25.5 && imc <= 30) {
                    System.out.println("Sobre Peso");
                } else {
                    System.out.println("Obeso");

                }

            }

        }

    }

}
