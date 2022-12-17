/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerCondicionales;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taller Motos");
        System.out.println("Registro de cliente");
        System.out.println("Nombre del propietario de la motocicleta");
        String NombreCliente = scanner.nextLine();
        System.out.println("Servicio requerido");
        String Motivo = scanner.nextLine();
        System.out.println("Registro de motocicleta");
        System.out.println("Ingrese la placa");
        String Placa = scanner.nextLine();
        System.out.println("Ingrese el cilindraje");
        String Cilindraje = scanner.nextLine();
        System.out.println("Ingresa la observacion de la reparacion");
        String Observaciones = scanner.nextLine();
        System.out.println("Fecha de ingreso al taller");
        String Fecha = scanner.nextLine();
        System.out.println("La motocicleta fue reparada");
        String Respuesta = scanner.nextLine();

        if (Respuesta.equals("si")) {
            System.out.println("Registro de salida de la motocicleta");
            System.out.println("Novedades de la motocicleta");
            String Novedades = scanner.nextLine();
            System.out.println("Arreglos o cambios realizados a la motocicleta");
            String Arreglos = scanner.nextLine();

            System.out.println("Sr/Sra " + NombreCliente + " su motocicleta con placa: " + Placa + " y con cilindraje: " + Cilindraje);
            System.out.println("fue ingresada a la fecha: " + Fecha + " con las siguientes observaciones: " + Observaciones);
            System.out.println("y le hacemos entrega de su motocicleta con las siguientes novedades: " + Novedades);
            System.out.println("y le informamos que se le realizan algunos cambios y arreglos como estos: " + Arreglos);
            System.out.println("dando como resultado una reparacion exitosa");

        } else {
            System.out.println("Aun no se encuentra reparada");

        }

    }

}
