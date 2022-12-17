package tallerCondicionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Claudia
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader BufEntrada = new BufferedReader(new InputStreamReader(System.in));

        String Titular;
        int Opciones;
        int Cuenta;
        int Cantidad;
        int Deposito;
        int Retiro;
        Cantidad = 0;

        System.out.println("Su banco");
        System.out.println("1: Ingreso");
        System.out.println("2: Salir");
        Opciones = Integer.parseInt(BufEntrada.readLine());

        switch (Opciones) {

            case 1:
                System.out.println("Ingreso");
                System.out.println("Ingresa el nombre del titular");
                Titular = String.format(BufEntrada.readLine());
                System.out.println("Digita su numero de cuenta");
                Cuenta = Integer.parseInt(BufEntrada.readLine());
                System.out.println("Digite el monto a ingresar");
                Deposito = Integer.parseInt(BufEntrada.readLine());

                if (Deposito > 0) {
                    Cantidad = Deposito;

                    System.out.println("Elija una opcion");
                    System.out.println("1: Retiro ");
                    System.out.println("2: Consultar su saldo");
                    System.out.println("3: Salir de la cuenta");
                    Opciones = Integer.parseInt(BufEntrada.readLine());

                    switch (Opciones) {

                        case 1:
                            System.out.println("Retiro");
                            System.out.println("Digita la cantidad a retirar");
                            Retiro = Integer.parseInt(BufEntrada.readLine());

                            if (Retiro < Cantidad) {
                                Cantidad = Cantidad - Retiro;
                                System.out.println("Su retiro fue exitoso de " + Retiro + " su saldo actual es de " + Cantidad);
                            } else {
                                System.out.println("Saldo insuficiente");

                            }
                            break;

                        case 2:
                            System.out.println(" Sr/Sra " + Titular + " su cuenta " + Cuenta + " tiene una cantidad estimada de " + Cantidad);
                            break;

                        case 3:
                            System.out.println(" cerrar sistemas ");
                            break;

                    }

                }
        }

    }
}
