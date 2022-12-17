/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Claudia
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader BufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int Opciones;
        double Base;
        double Base2;
        double Altura;
        double Resultado;

        System.out.println("Figuras geometricas para calcular el area");
        System.out.println("1: Rectangulo");
        System.out.println("2: Tringulo");
        System.out.println("3: Trapecio");
        Opciones = Integer.parseInt(BufEntrada.readLine());

        switch (Opciones) {
            case 1:
                System.out.println("Rectangulo");
                System.out.println("Para calcular el area necesitamos que ingrese la base");
                Base = Double.parseDouble(BufEntrada.readLine());
                System.out.println("Ahora ingresa la altura");
                Altura = Double.parseDouble(BufEntrada.readLine());

                Resultado = Base * Altura;

                System.out.println("El area que hallamos del resctangulo es: " + Resultado);
                break;
            case 2:
                System.out.println("Triangulo");
                System.out.println("Para calcular el area necesitamos que ingrese la base");
                Base = Double.parseDouble(BufEntrada.readLine());
                System.out.println("Ahora ingresa la altura");
                Altura = Double.parseDouble(BufEntrada.readLine());

                Resultado = (Base * Altura) / 2;

                System.out.println("El area que hallamos del Triangulo es: " + Resultado);
                break;
            case 3:
                System.out.println("Trapecio");
                System.out.println("Para calcular el area necesitamos que ingrese la base");
                Base = Double.parseDouble(BufEntrada.readLine());
                System.out.println("Ingresa la base 2");
                Base2 = Double.parseDouble(BufEntrada.readLine());
                System.out.println("Ahora ingresa la altura");
                Altura = Double.parseDouble(BufEntrada.readLine());

                Resultado = ((Base + Base2) / 2) * Altura;

                System.out.println("El area que hallamos del Trapecio es: " + Resultado);
                break;
        }

    }

}
